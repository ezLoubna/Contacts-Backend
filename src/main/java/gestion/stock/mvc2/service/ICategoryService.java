package gestion.stock.mvc2.service;

import java.util.List;

import gestion.stock.mvc2.entities.Category;

public interface ICategoryService {
public Category save(Category entity);
	
	public Category update (Category entity);
	
	public List<Category> selectAll();
	
	public Category getById(Long id);
	
	public void remove(Long id);
	
	
	public List<Category> selectAll( String sortField, String sort);
	
	
	public Category findOne(String paramName, Object ParamValue);
	
	
	public Category findOne(String[] paramNames,Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
