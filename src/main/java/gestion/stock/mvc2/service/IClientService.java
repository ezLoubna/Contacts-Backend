package gestion.stock.mvc2.service;

import java.util.List;

import gestion.stock.mvc2.entities.Client;

public interface IClientService {
public Client save(Client entity);
	
	public Client update (Client entity);
	
	public List<Client> selectAll();
	
	public Client getById(Long id);
	
	public void remove(Long id);
	
	
	public List<Client> selectAll( String sortField, String sort);
	
	
	public Client findOne(String paramName, Object ParamValue);
	
	
	public Client findOne(String[] paramNames,Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
