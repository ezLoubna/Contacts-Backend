package gestion.stock.mvc2.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestion.stock.mvc2.dao.ILigneVenteDao;
import gestion.stock.mvc2.entities.LigneVente;
import gestion.stock.mvc2.service.ILigneVenteService;

@Service
@Transactional
public class LigneVenteServiceImp implements ILigneVenteService  {
	
	ILigneVenteDao dao;
	
	@Autowired
	public void setDao(ILigneVenteDao dao) {
		this.dao = dao;
	}

	@Override
	public LigneVente save(LigneVente entity) {
		// TODO Auto-generated method stub
		return dao.save(entity);
	}

	@Override
	public LigneVente update(LigneVente entity) {
		// TODO Auto-generated method stub
		return dao.update(entity);
	}

	@Override
	public List<LigneVente> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public LigneVente getById(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		dao.remove(id);
		
	}

	@Override
	public List<LigneVente> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return dao.selectAll(sortField, sort);
	}

	@Override
	public LigneVente findOne(String paramName, Object ParamValue) {
		// TODO Auto-generated method stub
		return dao.findOne(paramName, ParamValue)   ;
	}

	@Override
	public LigneVente findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountBy(paramName, paramValue);
	}

}
