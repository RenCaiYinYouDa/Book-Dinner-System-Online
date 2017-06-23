package com.rcyyd.bookdinner.service;

import com.rcyyd.bookdinner.domain.Security;

public interface SecurityService {
	void addToSecurity(Security security);
	boolean deleteFromSecurity(Security security);
	boolean changeSecurity(Security security);
	Security getSecurityById(Integer id);
}
