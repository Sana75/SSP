package com.bt.ssp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bt.ssp.model.Customer;
import com.bt.ssp.service.CustomerService;

@Controller
public class HomeController {

  @Autowired
  private CustomerService customerService;
	
  @RequestMapping("/")
  public String home(Model model) {
    return "home";
  }
  
/*  @RequestMapping("/app/{id}")
	public void product(@PathVariable("id") int id) {

		Customer user= customerService.findById(id);
		System.out.println(user);
	}*/
  
  @RequestMapping(value="/app/{id}", method=RequestMethod.GET)
  public ResponseEntity<?> getPoll(@PathVariable("id") int id) {
		Customer user= customerService.findById(id);
  return new ResponseEntity<> (user, HttpStatus.OK);
  }
}
