package com.sales.service;

import java.util.List;

public interface WelcomeService {
	public List<String> getWelcomeText();
	public void clearChat();
	public void setWelcomeText(String text);
}
