package com.rathalos.contactschedule.contactSchedule.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rathalos.contactschedule.contactSchedule.constant.ViewConstant;

@Controller
@RequestMapping("/contacts")
public class ContactController {

	@GetMapping("/contactform")
	private String redirectContactForm(){
		return ViewConstant.CONTACT_FORM;
	}
}
