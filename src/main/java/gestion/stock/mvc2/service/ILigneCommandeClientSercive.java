package gestion.stock.mvc2.service;

import java.util.List;

import gestion.stock.mvc2.entities.LigneCommandeClient;

public interface ILigneCommandeClientSercive {
public LigneCommandeClient save(LigneCommandeClient entity);
	
	public LigneCommandeClient update (LigneCommandeClient entity);
	
	public List<LigneCommandeClient> selectAll();
	
	public LigneCommandeClient getById(Long id);
	
	public void remove(Long id);
	
	
	public List<LigneCommandeClient> selectAll( String sortField, String sort);
	
	
	public LigneCommandeClient findOne(String paramName, Object ParamValue);
	
	
	public LigneCommandeClient findOne(String[] paramNames,Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
