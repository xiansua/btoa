package com.situ.btoa.sys.user.dao;

import org.springframework.stereotype.Repository;

import com.situ.btoa.commons.dao.BaseDao;
import com.situ.btoa.sys.user.domain.User;

@Repository
public interface UserDao extends BaseDao<User> {
	/**
	 * @Title: getUserByCode 
	 * @Description:(根据UserCode查询实例)
	 * @param userCode
	 * @return
	 */
	User getUserByCode(String userCode);
}
