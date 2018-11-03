package gestion.stock.mvc2.dao;

import java.util.List;

public interface IGenericDao<E> {
	
	
	
	public E save(E entity);
	
	public E update (E entity);
	
	public List<E> selectAll();
	
	public E getById(Long id);
	
	public void remove(Long id);
	
	// c'est un select * avec du sorting
	public List<E> selectAll( String sortField, String sort);
	
	// permet de trouver un element en passant son nom et sa valeur
	public E findOne(String paramName, Object ParamValue);
	
	
	public E findOne(String[] paramNames,Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
