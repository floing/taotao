package com.taotao.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.dao.UserMapper;
import com.taotao.model.User;
import com.taotao.service.UserServiceI;

/**
 * @author HuangQinJian ����1:15:46 2017��3��28��
 */
@Service("userService")
public class UserServiceImpl implements UserServiceI {

	private UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}

	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public User getUserById(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}
}
