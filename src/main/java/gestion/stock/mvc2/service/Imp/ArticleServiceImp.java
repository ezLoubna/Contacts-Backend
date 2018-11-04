package gestion.stock.mvc2.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestion.stock.mvc2.dao.IArticleDao;
import gestion.stock.mvc2.entities.Article;
import gestion.stock.mvc2.service.IArticleService;

@Service
@Transactional
public class ArticleServiceImp implements IArticleService {

	
	IArticleDao dao;
	@Autowired
	public void setDao(IArticleDao dao) {
		this.dao = dao;
	}
	
	
	@Override
	public Article save(Article entity) {
	  return dao.save(entity);
	}

	

	@Override
	public Article update(Article entity) {
		return dao.update(entity);
	}

	@Override
	public List<Article> selectAll() {
		return dao.selectAll();
	}

	@Override
	public Article getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		
		dao.remove(id);
	}

	@Override
	public List<Article> selectAll(String sortField, String sort) {
		
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Article findOne(String paramName, Object ParamValue) {
		return dao.findOne(paramName, ParamValue);
	}

	@Override
	public Article findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
