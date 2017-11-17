package com.loki.server.service;

import java.util.List;

import com.loki.server.model.User;

public interface UserService {
	void insert(User user);
	boolean update(User user);
	boolean delete(long id);
	User findById(long id);
	List<User> findAll();
}
