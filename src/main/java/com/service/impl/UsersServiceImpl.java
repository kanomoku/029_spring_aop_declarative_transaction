package com.service.impl;

import com.mapper.UsersMapper;
import com.pojo.Users;
import com.service.UsersService;

public class UsersServiceImpl implements UsersService {
	private UsersMapper usersMapper;

	public UsersMapper getUsersMapper() {
		return usersMapper;
	}

	public void setUsersMapper(UsersMapper usersMapper) {
		this.usersMapper = usersMapper;
	}

	@Override
	public int insUsers(Users user) {
		return usersMapper.insUsers(user);
	}


}
