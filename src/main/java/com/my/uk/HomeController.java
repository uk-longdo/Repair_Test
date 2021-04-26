package com.my.uk;



import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

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

	@Autowired
	RepairDao rdao;
	
	
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		
		return "home";
	}
	//메인페이지
	@RequestMapping({"/","/index"})
	public String repair_main() {
		System.out.println("메인");
		return "index";
	}
	
	//리스트페이지
	@RequestMapping("repair_list")
	public String repair_list(Model model) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		model.addAttribute("list",rdao.relist(map));
		
		return "repair_list";
	}
	
	
	//정보등록 페이지
	@RequestMapping("repair_insert")
	public String repair_insert() {
		
		return "repair_insert";
	}
	
	@RequestMapping("insert")
	public String insert(String dress_name, int dress_age, int dress_weight,int dress_height,String dress_number, String dress_bottom, String dress_waist, String dress_top, String dress_size, String dress_day) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("dress_name", dress_name);
		map.put("dress_age", dress_age);
		map.put("dress_weight", dress_weight);
		map.put("dress_height", dress_height);
		map.put("dress_number", dress_number);
		map.put("dress_bottom", dress_bottom);
		map.put("dress_waist", dress_waist);
		map.put("dress_top", dress_top);
		map.put("dress_size", dress_size);
		map.put("dress_day", dress_day);

		rdao.insertdress(map);
		return "index";
	}
	
}
