package gestion.stock.mvc2.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestion.stock.mvc2.dao.IVenteDao;
import gestion.stock.mvc2.entities.Vente;
import gestion.stock.mvc2.service.IVenteSercive;

@Service
@Transactional
public class VenteServiceImp implements IVenteSercive {
	
	IVenteDao dao;
	@Autowired

	public void setDao(IVenteDao dao) {
		this.dao = dao;
	}

	@Override
	public Vente save(Vente entity) {
		// TODO Auto-generated method stub
		return dao.save(entity);
	}

	@Override
	public Vente update(Vente entity) {
		// TODO Auto-generated method stub
		return dao.update(entity);
	}

	@Override
	public List<Vente> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vente getById(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		dao.remove(id);
		
	}

	@Override
	public List<Vente> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Vente findOne(String paramName, Object ParamValue) {
		// TODO Auto-generated method stub
		return dao.findOne(paramName, ParamValue);
	}

	@Override
	public Vente findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountBy(paramName, paramValue);
	}

}
