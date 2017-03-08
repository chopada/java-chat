package com.sales.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sales.service.WelcomeService;

@Controller
public class WelcomeController {

	@Inject
	public WelcomeService welcomeService;

	@RequestMapping(value = "/get", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<String> WelcomeScrin() {
		return welcomeService.getWelcomeText();
	}

	@RequestMapping(value = "/clearChat", method = RequestMethod.GET)
	@ResponseBody
	public void clearChat() {
		welcomeService.clearChat();
	}
}
