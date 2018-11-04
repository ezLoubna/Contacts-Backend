package gestion.stock.mvc2.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestion.stock.mvc2.dao.ICommandeClientDao;
import gestion.stock.mvc2.entities.CommandeClient;
import gestion.stock.mvc2.service.ICommandeClient;


@Service
@Transactional
public class CommandeClientServiceImp implements ICommandeClient  {

	ICommandeClientDao dao;
	@Autowired
	public void setDao(ICommandeClientDao dao) {
		this.dao = dao;
	}
	@Override
	public CommandeClient save(CommandeClient entity) {
		// TODO Auto-generated method stub
		return dao.save(entity);
	}
	@Override
	public CommandeClient update(CommandeClient entity) {
		// TODO Auto-generated method stub
		return dao.update(entity);
	}
	@Override
	public List<CommandeClient> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}
	@Override
	public CommandeClient getById(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}
	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		dao.remove(id);
		
	}
	@Override
	public List<CommandeClient> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return dao.selectAll(sortField, sort);
	}
	@Override
	public CommandeClient findOne(String paramName, Object ParamValue) {
		// TODO Auto-generated method stub
		return dao.findOne(paramName, ParamValue);
	}
	@Override
	public CommandeClient findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paramNames, paramValues);
	}
	@Override
	public int findCountBy(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountBy(paramName, paramValue);
	}

	
	
	
	

}
