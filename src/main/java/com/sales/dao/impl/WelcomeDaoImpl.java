package com.sales.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import com.sales.dao.WelcomeDao;

@Named
public class WelcomeDaoImpl implements WelcomeDao {
private List<String> welcometext= new ArrayList<String>();

	public List<String> getWelcomeText() {
		// TODO Auto-generated method stub
		return this.welcometext;
	}

	public void setWelcomeText(String text) {
		// TODO Auto-generated method stub
		this.welcometext.add(text);
	}

	public void clearChat() {
		this.welcometext.clear();
		
	}

}
