package com.controller;

import service.ServiceCall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;

@Controller
@RequestMapping("/welcome")
public class HelloController {
	@Autowired
    ServiceCall serviceCall;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("Times", String.valueOf(serviceCall.getTimes()));
        model.addAttribute("Airports", Arrays.toString(serviceCall.getAirports()));
		return "hello";

	}


}