package gestion.stock.mvc2.service;

import java.util.List;

import gestion.stock.mvc2.entities.LigneVente;

public interface ILigneVenteService {
public LigneVente save(LigneVente entity);
	
	public LigneVente update (LigneVente entity);
	
	public List<LigneVente> selectAll();
	
	public LigneVente getById(Long id);
	
	public void remove(Long id);
	
	
	public List<LigneVente> selectAll( String sortField, String sort);
	
	
	public LigneVente findOne(String paramName, Object ParamValue);
	
	
	public LigneVente findOne(String[] paramNames,Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);


}
