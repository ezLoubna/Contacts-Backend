package gestion.stock.mvc2.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestion.stock.mvc2.dao.IMvtStkDao;
import gestion.stock.mvc2.entities.MvtStk;
import gestion.stock.mvc2.service.IMvtSktService;

@Service
@Transactional
public class MvtStkServiceImp implements IMvtSktService  {

	IMvtStkDao dao;
	
	@Autowired
	public void setDao(IMvtStkDao dao) {
		this.dao = dao;
	}

	@Override
	public MvtStk save(MvtStk entity) {
		// TODO Auto-generated method stub
		return dao.save(entity);
	}

	@Override
	public MvtStk update(MvtStk entity) {
		// TODO Auto-generated method stub
		return dao.update(entity);
	}

	@Override
	public List<MvtStk> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public MvtStk getById(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		dao.remove(id);
		
	}

	@Override
	public List<MvtStk> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return dao.selectAll(sortField, sort);
	}

	@Override
	public MvtStk findOne(String paramName, Object ParamValue) {
		// TODO Auto-generated method stub
		return dao.findOne(paramName, ParamValue);
	}

	@Override
	public MvtStk findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountBy(paramName, paramValue);
	}

}
