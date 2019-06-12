package cn.tedu.store.service.impl;

import cn.tedu.store.entity.User;
import cn.tedu.store.service.IUserService;
import cn.tedu.store.service.ex.InsertException;
import cn.tedu.store.service.ex.PasswordNotMatchException;
import cn.tedu.store.service.ex.UpdateException;
import cn.tedu.store.service.ex.UserNotFoundException;
import cn.tedu.store.service.ex.UsernameDuplicateException;

public class UserServiceImpl2 implements IUserService {

	@Override
	public void reg(User user) throws UsernameDuplicateException, InsertException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User login(String username, String password) throws UserNotFoundException, PasswordNotMatchException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changeInfo(User user) throws UserNotFoundException, UpdateException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePassword(Integer uid, String oldPassword, String newPassword, String username)
			throws UserNotFoundException, PasswordNotMatchException, UpdateException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeAvatar(Integer uid, String avatar, String username)
			throws UserNotFoundException, UpdateException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getByUid(Integer uid) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
