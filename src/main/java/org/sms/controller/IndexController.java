package org.sms.controller;


import org.neo4j.cypher.internal.compiler.v2_1.perty.printToString;
import org.sms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class IndexController {
@Autowired
private UserService userService;
	

	@RequestMapping("/index")
	public String index(Model model) {
		//model.addAttribute("users", userService.getUsers());
		return "index";
	}
}
