package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.DevUserDao;
import com.pojo.DevUser;
import com.service.DevUserService;

@Service
public class DevUserServiceImpl implements DevUserService {

	@Autowired
	private DevUserDao devuserDAO;
	@Override
	@Transactional(readOnly=true)
	public DevUser findDevUserByDevCode(String devCode) {
		// TODO Auto-generated method stub
		return devuserDAO.findDevUserByDevCode(devCode);
	}
	/**
	 * @param devuserDAO the devuserDAO to set
	 */
	public void setDevuserDAO(DevUserDao devuserDAO) {
		this.devuserDAO = devuserDAO;
	}
	
	
}
