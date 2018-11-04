package gestion.stock.mvc2.service;

import java.util.List;

import gestion.stock.mvc2.entities.Vente;

public interface IVenteSercive {
public Vente save(Vente entity);
	
	public Vente update (Vente entity);
	
	public List<Vente> selectAll();
	
	public Vente getById(Long id);
	
	public void remove(Long id);
	
	
	public List<Vente> selectAll( String sortField, String sort);
	
	
	public Vente findOne(String paramName, Object ParamValue);
	
	
	public Vente findOne(String[] paramNames,Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);


}
