package com.dgs.business.service.login.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.dgs.business.service.LoginService;
import com.dgs.data.dao.MmeUserDao;
import com.dgs.data.domain.MmeUser;
import com.dgs.infra.dto.login.UserDTO;

@Transactional
public class LoginServiceImpl implements LoginService {

	@Autowired
	MmeUserDao mmeUserDao;

	@Override
	public UserDTO authenticate(String userName, String password)
			throws Exception {
		UserDTO userDTO = new UserDTO();

		Map<String, String> userDetails;
		try {

				
				List<MmeUser> userMasterList = mmeUserDao.getAllActiveRecords();
				for (MmeUser mmeUser : userMasterList) {
					if(mmeUser.getUserMailId().equalsIgnoreCase(userName) && mmeUser.getPassword().equals(password)){
						
						userDTO.setId(mmeUser.getUserId());
						userDTO.setUserName(userName);
						userDTO.setRole(mmeUser.getUserRole());
						userDTO.setUserFullName(mmeUser.getUserProfileName());
						userDTO.setUserMailID(mmeUser.getUserMailId());
						
						
					}
					
				}
				
				return userDTO;
				
			//}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

}
