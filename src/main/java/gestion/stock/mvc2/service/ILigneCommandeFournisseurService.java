package gestion.stock.mvc2.service;

import java.util.List;

import gestion.stock.mvc2.entities.LigneCommandeFournisseur;

public interface ILigneCommandeFournisseurService {
public LigneCommandeFournisseur save(LigneCommandeFournisseur entity);
	
	public LigneCommandeFournisseur update (LigneCommandeFournisseur entity);
	
	public List<LigneCommandeFournisseur> selectAll();
	
	public LigneCommandeFournisseur getById(Long id);
	
	public void remove(Long id);
	
	
	public List<LigneCommandeFournisseur> selectAll( String sortField, String sort);
	
	
	public LigneCommandeFournisseur findOne(String paramName, Object ParamValue);
	
	
	public LigneCommandeFournisseur findOne(String[] paramNames,Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
