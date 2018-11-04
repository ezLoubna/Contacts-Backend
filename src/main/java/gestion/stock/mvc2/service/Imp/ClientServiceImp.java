package gestion.stock.mvc2.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestion.stock.mvc2.dao.IClientDao;
import gestion.stock.mvc2.entities.Client;
import gestion.stock.mvc2.service.IClientService;

@Service
@Transactional
public class ClientServiceImp implements IClientService  {
	
	IClientDao dao;
	@Autowired
	public void setDao(IClientDao dao) {
		this.dao = dao;
	}
	@Override
	public Client save(Client entity) {
		// TODO Auto-generated method stub
		return dao.save(entity);
	}
	@Override
	public Client update(Client entity) {
		// TODO Auto-generated method stub
		return dao.update(entity);
	}
	@Override
	public List<Client> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}
	@Override
	public Client getById(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}
	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		dao.remove(id);
		
	}
	@Override
	public List<Client> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return dao.selectAll(sortField, sort);
	}
	@Override
	public Client findOne(String paramName, Object ParamValue) {
		// TODO Auto-generated method stub
		return dao.findOne(paramName, ParamValue);
	}
	@Override
	public Client findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paramNames, paramValues);
	}
	@Override
	public int findCountBy(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountBy(paramName, paramValue);
	}

	

	

}
