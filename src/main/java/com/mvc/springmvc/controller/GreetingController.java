package com.mvc.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * This controller handles requests for greeting views.
 *
 * @author Thanh
 */
@Controller
public class GreetingController {
	/**
	 * This method handles GET requests to the "/greeting" endpoint.
	 * It returns the name of the view, in this case "index", which will be
	 * resolved by the view resolver.
	 *
	 * @return String - the name of the view to be rendered ("index").
	 */
	@GetMapping("/greeting")
	public String greeting() {
		return "index";
	}
}
