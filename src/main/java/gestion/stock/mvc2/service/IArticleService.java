package gestion.stock.mvc2.service;

import java.util.List;

import gestion.stock.mvc2.entities.Article;

public interface IArticleService {
   
	
	public Article save(Article entity);
	
	public Article update (Article entity);
	
	public List<Article> selectAll();
	
	public Article getById(Long id);
	
	public void remove(Long id);
	
	
	public List<Article> selectAll( String sortField, String sort);
	
	
	public Article findOne(String paramName, Object ParamValue);
	
	
	public Article findOne(String[] paramNames,Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
