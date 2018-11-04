package gestion.stock.mvc2.service;

import java.util.List;

import gestion.stock.mvc2.entities.MvtStk;

public interface IMvtSktService {
public MvtStk save(MvtStk entity);
	
	public MvtStk update (MvtStk entity);
	
	public List<MvtStk> selectAll();
	
	public MvtStk getById(Long id);
	
	public void remove(Long id);
	
	
	public List<MvtStk> selectAll( String sortField, String sort);
	
	
	public MvtStk findOne(String paramName, Object ParamValue);
	
	
	public MvtStk findOne(String[] paramNames,Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
