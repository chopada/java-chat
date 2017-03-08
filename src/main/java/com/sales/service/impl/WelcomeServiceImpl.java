package com.sales.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.sales.dao.WelcomeDao;
import com.sales.service.WelcomeService;

@Named
public class WelcomeServiceImpl implements WelcomeService {
	
	@Inject
	public WelcomeDao welcomeDao;
	
	public List<String> getWelcomeText() {
		// TODO Auto-generated method stub
		return welcomeDao.getWelcomeText();
	}


	public void setWelcomeText(String text) {
		// TODO Auto-generated method stub
		welcomeDao.setWelcomeText(text);
	}


	public void clearChat() {
		// TODO Auto-generated method stub
		welcomeDao.clearChat();
	}

}
