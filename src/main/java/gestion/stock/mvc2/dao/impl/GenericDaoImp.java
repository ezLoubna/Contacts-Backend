package gestion.stock.mvc2.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import gestion.stock.mvc2.dao.IGenericDao;

@SuppressWarnings("unchecked")
public class GenericDaoImp<E> implements IGenericDao<E> {

	@PersistenceContext
	EntityManager em;
	
	private Class<E> type;
	
	
	public  GenericDaoImp() {
		Type t = getClass().getGenericSuperclass() ;
		ParameterizedType pt= (ParameterizedType) t ;
		type = (Class<E>) pt.getActualTypeArguments()[0];
	}


	@Override
	public E save(E entity) {
		// TODO Auto-generated method stub
		em.persist(entity);
		return entity;
	}


	@Override
	public E update(E entity) {
		// TODO Auto-generated method stub
		return em.merge(entity);
	}


	@Override
	public List<E> selectAll() {
		// TODO Auto-generated method stub
		Query query= em.createQuery("select t from"+ type.getSimpleName()+"t");
		return ((javax.persistence.Query) query).getResultList() ;
	}


	@Override
	public E getById(Long id) {
		// TODO Auto-generated method stub
		return em.find(type, id);
	}


	@Override
	public void remove(Long id) {
		E tab= em.getReference(type, id);
		em.remove(tab);
		
	}

	@Override
	public List<E> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		Query query= em.createQuery("select t from"+ type.getSimpleName()+"t order by" + sortField+ " "+ sort);
	   return query.getResultList() ;
	}


	@Override
	public E findOne(String paramName, Object ParamValue) {
		// TODO Auto-generated method stub
		Query query=em.createQuery("select t from"+ type.getSimpleName()+"t where" + paramName + "=:x");
		query.setParameter(paramName, ParamValue);
		return query.getResultList().size() > 0 ? (E) query.getResultList().get(0): null;
	}


	@Override
	public E findOne(String[] paramNames, Object[] paramValues) {
		String queryString ="select e from"+ type.getName()+"e where";
		int len= paramNames.length;
		for (int i =0; i<len;i++) {
			queryString += " e."+ paramNames[i]+"= :x" +i;
			if ((i+1)<len) {
				queryString += " and ";
			}
		}
		
		Query query = em.createQuery(queryString);
		for (int i =0; i<paramValues.length;i++) {
			query.setParameter("x" + 1, paramValues[i]);
			
		}
		
		return query.getResultList().size() > 0 ? (E) query.getResultList().get(0): null; 
	}
	
	


	@Override
	public int findCountBy(String paramName,String paramValue) {
		Query query = em.createQuery("select t from"+ type.getSimpleName() + " t where"+ paramName+"=:x");
		 query.setParameter(paramName, paramValue);
		 return query.getResultList().size() > 0 ? ((Long) query.getSingleResult()).intValue():0;
		
		}


	
	

	
	

}
  