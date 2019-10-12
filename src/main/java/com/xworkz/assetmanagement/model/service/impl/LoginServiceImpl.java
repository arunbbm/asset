package com.xworkz.assetmanagement.model.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.assetmanagement.dto.LoginDTO;
import com.xworkz.assetmanagement.exception.DAOException;
import com.xworkz.assetmanagement.exception.ServiceException;
import com.xworkz.assetmanagement.model.dao.LoginDAO;
import com.xworkz.assetmanagement.model.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private MailSender mailSender;

	@Autowired
	private LoginDAO loginDAO;

	private static final Logger logger = Logger.getLogger(LoginServiceImpl.class);

	public String validateuser(LoginDTO emailId) throws ServiceException {

		logger.info("inside the service impl ");
		try {
			SimpleMailMessage message = new SimpleMailMessage();
			message.setTo(emailId);
			message.setText("hello");
			message.setSubject("generated password");
			mailSender.send(message);
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage());
			e.printStackTrace();
		}

	}

}
