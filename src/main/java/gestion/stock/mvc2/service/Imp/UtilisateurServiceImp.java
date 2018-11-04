package gestion.stock.mvc2.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestion.stock.mvc2.dao.IUtilisateurDao;
import gestion.stock.mvc2.entities.Utilisateur;
import gestion.stock.mvc2.service.IUtilisateurService;

@Service
@Transactional
public class UtilisateurServiceImp implements IUtilisateurService {

	
	 IUtilisateurDao dao;
	@Autowired
	public void setDao(IUtilisateurDao dao) {
		this.dao = dao;
	}

	@Override
	public Utilisateur save(Utilisateur entity) {
		// TODO Auto-generated method stub
		return dao.save(entity);
	}

	@Override
	public Utilisateur update(Utilisateur entity) {
		// TODO Auto-generated method stub
		return dao.update(entity);
	}

	@Override
	public List<Utilisateur> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public Utilisateur getById(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		dao.remove(id);
		
	}

	@Override
	public List<Utilisateur> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Utilisateur findOne(String paramName, Object ParamValue) {
		// TODO Auto-generated method stub
		return dao.findOne(paramName, ParamValue);
	}

	@Override
	public Utilisateur findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountBy(paramName, paramValue);
	}

}
