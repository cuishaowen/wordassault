/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.enguser.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.enguser.entity.Enguser;
import org.apache.ibatis.annotations.Param;

/**
 * 用户DAO接口
 * @author cuisw
 * @version 2019-08-06
 */
@MyBatisDao
public interface EnguserDao extends CrudDao<Enguser> {

    public void insertUser(Enguser enguser);

    public Enguser getEnguser(@Param("loginName") String loginName, @Param("password") String password);
	
}