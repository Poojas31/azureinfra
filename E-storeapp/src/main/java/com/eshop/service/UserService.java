package com.eshop.service;

import com.eshop.model.User;

public interface UserService {

	public User findUserById(int id);

	public User save(User user);

	public void edit(User user);

	public void delete(User user);
	
	public User verifyUser(String name, String password, String role);

	public User findUserForEmailAddress(String emailAddress);
}
