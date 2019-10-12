package com.xworkz.assetmanagement.model.service;

import org.springframework.stereotype.Service;

import com.xworkz.assetmanagement.dto.LoginDTO;
import com.xworkz.assetmanagement.exception.ServiceException;

@Service
public interface LoginService {

	public String validateuser(LoginDTO emailId) throws ServiceException;
}
