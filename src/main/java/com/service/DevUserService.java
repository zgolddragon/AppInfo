package com.service;

import com.pojo.DevUser;

public interface DevUserService {
	/**
	 * 根据用户名查询用户对象
	 * @param devCode
	 * @return
	 */
	DevUser findDevUserByDevCode(String devCode);

}
