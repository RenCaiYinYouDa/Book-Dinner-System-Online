package com.rcyyd.bookdinner.service;

import java.util.List;

import com.rcyyd.bookdinner.domain.Security;

public interface SecurityService {
	void addToSecurity(Security security);
	boolean deleteFromSecurity(Security security);
	boolean changeSecurity(Security security);
	Security getSecurityById(Integer id);
	Security getSecurityByKey(String keyword);
	List<Security> getAllSecurities();
}
