/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.userenguser.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.userenguser.entity.UserEnguser;
import com.thinkgem.jeesite.modules.userenguser.dao.UserEnguserDao;

/**
 * userenguserService
 * @author cuisw
 * @version 2019-08-06
 */
@Service
@Transactional(readOnly = true)
public class UserEnguserService extends CrudService<UserEnguserDao, UserEnguser> {

	public UserEnguser get(String id) {
		return super.get(id);
	}
	
	public List<UserEnguser> findList(UserEnguser userEnguser) {
		return super.findList(userEnguser);
	}
	
	public Page<UserEnguser> findPage(Page<UserEnguser> page, UserEnguser userEnguser) {
		return super.findPage(page, userEnguser);
	}
	
	@Transactional(readOnly = false)
	public void save(UserEnguser userEnguser) {
		super.save(userEnguser);
	}
	
	@Transactional(readOnly = false)
	public void delete(UserEnguser userEnguser) {
		super.delete(userEnguser);
	}


}