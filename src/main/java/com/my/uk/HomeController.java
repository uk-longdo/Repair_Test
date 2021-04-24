package com.my.uk;



import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Handles requests for the application home page.
 */


@Controller
public class HomeController {
	
	
	
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		
		return "home";
	}
	//����������
	@RequestMapping({"/","/index"})
	public String repair_main() {
		System.out.println("����");
		return "index";
	}
	
	//����Ʈ������
	@RequestMapping("repair_list")
	public String repair_list() {
		
		return "repair_list";
	}
	
	
	//������� ������
	@RequestMapping("repair_insert")
	public String repair_insert() {
		
		return "repair_insert";
	}
}
