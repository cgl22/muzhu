package com.muzhu.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muzhu.demo.entity.UserInfo;
import com.muzhu.demo.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	private UserInfo userInfo;

	@Override
	public UserInfo getUserInfoByProperties() {
		return userInfo;
	}

}
