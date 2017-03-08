package com.sales.dao;

import java.util.List;

public interface WelcomeDao {
	public List<String> getWelcomeText();

	public void setWelcomeText(String text);

	public void clearChat();
}
