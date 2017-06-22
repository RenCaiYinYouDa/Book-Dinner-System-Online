package com.rcyyd.bookdinner.persistence;

import java.io.Serializable;
import java.util.List;


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
}
