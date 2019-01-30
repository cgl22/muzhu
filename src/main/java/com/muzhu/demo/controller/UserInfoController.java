package com.muzhu.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muzhu.demo.entity.UserInfo;
import com.muzhu.demo.service.UserInfoService;

@RestController
@RequestMapping("/userInfo")
public class UserInfoController {
	@Autowired
	private UserInfoService userInfoService;

	@GetMapping("")
	public UserInfo getUserInfo() {
		return userInfoService.getUserInfoByProperties();
	}

}
