package gestion.stock.mvc2.service;

import java.util.List;

import gestion.stock.mvc2.entities.CommandeClient;

public interface ICommandeClient {
public CommandeClient save(CommandeClient entity);
	
	public CommandeClient update (CommandeClient entity);
	
	public List<CommandeClient> selectAll();
	
	public CommandeClient getById(Long id);
	
	public void remove(Long id);
	
	
	public List<CommandeClient> selectAll( String sortField, String sort);
	
	
	public CommandeClient findOne(String paramName, Object ParamValue);
	
	
	public CommandeClient findOne(String[] paramNames,Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);


}
