package gestion.stock.mvc2.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestion.stock.mvc2.dao.IFournisseurDao;
import gestion.stock.mvc2.entities.Fournisseur;
import gestion.stock.mvc2.service.IFournisseurService;

@Service
@Transactional
public class FournisseurServiceImp implements IFournisseurService  {
	
	IFournisseurDao dao;
	
    @Autowired
	public void setDao(IFournisseurDao dao) {
		this.dao = dao;
	}

	@Override
	public Fournisseur save(Fournisseur entity) {
		// TODO Auto-generated method stub
		return dao.save(entity);
	}

	@Override
	public Fournisseur update(Fournisseur entity) {
		// TODO Auto-generated method stub
		return dao.update(entity);
	}

	@Override
	public List<Fournisseur> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public Fournisseur getById(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		dao.remove(id);
		
	}

	@Override
	public List<Fournisseur> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Fournisseur findOne(String paramName, Object ParamValue) {
		// TODO Auto-generated method stub
		return  dao.findOne(paramName, ParamValue);
	}

	@Override
	public Fournisseur findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountBy(paramName, paramValue);
	}

}
