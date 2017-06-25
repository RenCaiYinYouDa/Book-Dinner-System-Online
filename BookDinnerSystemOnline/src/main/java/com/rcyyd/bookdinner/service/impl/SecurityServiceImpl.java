package com.rcyyd.bookdinner.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rcyyd.bookdinner.domain.Security;
import com.rcyyd.bookdinner.persistence.SecurityDao;
import com.rcyyd.bookdinner.service.SecurityService;

@Service
@Transactional
public class SecurityServiceImpl implements SecurityService {

	@Autowired
	private SecurityDao securityDao;
	
	@Override
	public void addToSecurity(Security security){
		securityDao.save(security);
	}
	
	@Override
	public boolean deleteFromSecurity(Security security){
		securityDao.delete(security);
		return true;
	}
	
	@Override
	public boolean changeSecurity(Security security) {
		securityDao.update(security);
		return true;
	}

	@Override
	public Security getSecurityById(Integer id) {
		// TODO Auto-generated method stub
		return securityDao.findById(id);
	}

	@Override
	public Security getSecurityByKey(String keyword) {
		// TODO Auto-generated method stub
		return securityDao.findByKey(keyword, "security").get(0);
	}

	@Override
	public List<Security> getAllSecurities() {
		// TODO Auto-generated method stub
		return securityDao.findAll();
	}
}
