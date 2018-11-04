package gestion.stock.mvc2.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import gestion.stock.mvc2.dao.ICategoryDao;
import gestion.stock.mvc2.entities.Category;
import gestion.stock.mvc2.service.ICategoryService;

@Service
@Transactional
public class CategoryServiceImp implements ICategoryService {

	ICategoryDao dao;
	@Autowired
	public void setDao(ICategoryDao dao) {
		this.dao = dao;
	}
	
	@Override
	public Category save(Category entity) {
		// TODO Auto-generated method stub
		return dao.save(entity);
	}

	@Override
	public Category update(Category entity) {
		// TODO Auto-generated method stub
		return dao.update(entity);
	}

	@Override
	public List<Category> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public Category getById(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		dao.remove(id);
	}

	@Override
	public List<Category> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Category findOne(String paramName, Object ParamValue) {
		// TODO Auto-generated method stub
		return dao.findOne(paramName, ParamValue);
	}

	@Override
	public Category findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountBy(paramName, paramValue);
	}

}
