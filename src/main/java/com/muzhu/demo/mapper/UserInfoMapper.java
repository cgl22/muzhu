package com.muzhu.demo.mapper;

import org.springframework.stereotype.Repository;

import com.muzhu.demo.entity.UserInfoBean;


@Repository
public interface UserInfoMapper {
	public UserInfoBean getUserInfo();
}
