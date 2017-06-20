package com.rcyyd.bookdinner.persistence.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.rcyyd.bookdinner.persistence.BaseDao;


public abstract class BaseDaoHibernateAdapter<E, K extends Serializable> implements BaseDao<E, K> {
	@Autowired
	protected SessionFactory sessionFactory;
	
	protected Class<E> entityType;
	protected String entityTypeName;
	
	public BaseDaoHibernateAdapter() {
		ParameterizedType pt = (ParameterizedType) getClass().getGenericSuperclass();
		entityType = (Class<E>) pt.getActualTypeArguments()[0];
		entityTypeName = entityType.getSimpleName();
	}
	
	@Override
	public K save(E entity) {
		return (K) sessionFactory.getCurrentSession().save(entity);
	}

	@Override
	public void delete(E entity) {
		sessionFactory.getCurrentSession().delete(entity);
	}
	
	@Override
	public boolean deleteById(K id) {
		return deleteById(id, "id");
	}

	@Override
	public boolean deleteById(K id, String idName) {
		return sessionFactory.getCurrentSession()
				.createQuery("delete from " + entityTypeName + " as o where o." + idName + "=?")
				.setParameter(0, id).executeUpdate() == 1;
	}
	
	@Override
	public boolean deleteByDoubleId(K id1, K id2, String idName1, String idName2) {
		return sessionFactory.getCurrentSession()
				.createQuery("delete from " + entityTypeName + " as o where o." + idName1 + "=? and o." + idName2 + "=?")
				.setParameter(0, id1).setParameter(1, id2).executeUpdate() == 1;
	}
	
	@Override
	public void update(E entity) {
		sessionFactory.getCurrentSession().update(entity);
	}

	@Override
	public E findById(K id) {
		return sessionFactory.getCurrentSession().get(entityType, id);
	}

	@Override
	public List<E> findAll() {
		return sessionFactory.getCurrentSession()
				.createQuery("from " + entityTypeName, entityType).getResultList();
	}

}
