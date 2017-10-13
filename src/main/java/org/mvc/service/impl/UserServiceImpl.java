package org.mvc.service.impl;

import org.mvc.dao.UserDao;
import org.mvc.domain.User;
import org.mvc.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

	private final Logger logger=LoggerFactory.getLogger(this.getClass());
	@Autowired
	private UserDao userDao;
	
	@Override
	public int deleteByPrimaryKey(Long userId) {
		logger.info("UserServiceImpl userId:"+userId+"删除");
		return userDao.deleteByPrimaryKey(userId);
	}

	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
	@Override
	public void insert(User record) {
			logger.info("UserServiceImpl user:"+record+"新增");
			userDao.insert(record);
			//System.out.println(1/0);
	}

	@Transactional
	@Override
	public User selectByPrimaryKey(Long userId) {
		logger.info("UserServiceImpl userId:"+userId+"查询");
		return userDao.selectByPrimaryKey(userId);
	}

	@Override 
	public int updateByPrimaryKey(User record) {
		logger.info("UserServiceImpl user:"+record+"更新");
		return userDao.updateByPrimaryKey(record);
	}

}
