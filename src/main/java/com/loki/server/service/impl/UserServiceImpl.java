package com.loki.server.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.loki.server.dao.UserDao;
import com.loki.server.model.User;
import com.loki.server.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao userDao;

	@Override
	public void insert(User user) {
		userDao.insert(user);
	}

	@Override
	public boolean update(User user) {
		return userDao.update(user);
	}

	@Override
	public boolean delete(long id) {
		return userDao.delete(id);
	}

	@Override
	public User findById(long id) {
		User user=userDao.findById(id);
		return user;
	}

	@Override
	public List<User> findAll() {
		List<User> findAllList=userDao.findAll();
		return findAllList;
	}

}
