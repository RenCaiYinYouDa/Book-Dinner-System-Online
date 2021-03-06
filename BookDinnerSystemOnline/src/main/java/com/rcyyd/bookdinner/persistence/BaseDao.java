package com.rcyyd.bookdinner.persistence;

import java.io.Serializable;
import java.util.List;

import com.rcyyd.bookdinner.domain.PageModel;



public interface BaseDao <E, K extends Serializable>{

	K save(E entity);
	
	void delete(E entity);
	
	boolean deleteById(K id);
	
	boolean deleteById(K id, String idName);
	
	boolean deleteByDoubleId(K id1, K id2, String idName1, String idName2);
	
	void update(E entity);
	
	E findById(K id);
	
	List<E> findAll();
	
	List<E> findByKey(String keyword, String colName);
	
	List<E> findByKey(int keyword, String colName);
	
	public  PageModel<E> findByKey(int keyword, String colName, Integer page, Integer size);
	
	PageModel<E> findByPage(int page, int size);
	
	PageModel<E> findByPage(int page, int size, String idName);
	
	PageModel<E> findByPageUser(int page, int size, int userid);
	
	PageModel<E> findByPageDish(int page, int size, int dishid);
	
	PageModel<E> findByOrderStatus(int page, int size, int type);
	
	PageModel<E> findByPageAsc(int page, int size, String idName);
	
	PageModel<E> findByLike(String keyword, String colName, Integer page, Integer size);
}
