package com.mvc.springmvc.controller;

import com.mvc.springmvc.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * This controller handles requests for Customers views.
 *
 * @author Thanh
 */
@Controller
public class CustomerController {
	/**
	 * This method handles GET requests to the "/products" endpoint.
	 * It returns a ModelAndView object, which includes both the view name
	 * and the model data that will be passed to the view for rendering.
	 *
	 * @return ModelAndView - contains the view name and data for rendering.
	 */
	@GetMapping("/customers")
	public ModelAndView customers() {
		ModelAndView modelAndView = new ModelAndView("customers/list");
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setCustomerId(1);
		customer.setCustomerName("Huynh Minh Chien");
		customer.setCustomerAddress("Do Xuan Hop");
		customer.setCustomerMail("Chien@gmail.com");
		customers.add(customer);
		modelAndView.addObject("customers", customers);
		return modelAndView;
	}
}
