package com.sales.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sales.service.WelcomeService;

@Controller
public class SetTextController {
	@Inject
	public WelcomeService welcomeService;

	@RequestMapping(value = "/set", method = RequestMethod.POST)
	@ResponseBody
	public void printHello(@RequestParam("msg") String text) {
		if (text != "")
			welcomeService.setWelcomeText(text);
	}
}
