package com.rcyyd.bookdinner.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rcyyd.bookdinner.domain.Collection;
import com.rcyyd.bookdinner.persistence.CollectionDao;
import com.rcyyd.bookdinner.service.CollectionService;

@Service
@Transactional
public class CollectionServiceimpl implements CollectionService {
	@Autowired
	protected CollectionDao collectionDao;
	
	@Override
	public boolean save(Collection collection) {
		// TODO Auto-generated method stub
		return collectionDao.save(collection)!=null;
	}

	/**
	 * 删除指定编号的收藏
	 * @param addrid
	 * @return
	 */
	@Override
	public boolean deleCollection(int addrid) {
		// TODO Auto-generated method stub
		return collectionDao.deleteById(addrid);
	}

	/**
	 * 删除指定用户usrid下所有的收藏
	 * @param userid 
	 * @return
	 */
	@Override
	public boolean deleAllCollection(int userid) {
		// TODO Auto-generated method stub
		return collectionDao.deleteById(userid, "userid");
	}

}
