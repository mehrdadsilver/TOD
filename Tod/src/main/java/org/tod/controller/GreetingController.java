package org.tod.controller;

import java.security.Principal;
import java.util.Collections;

import java.util.Map;


import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

//	@RequestMapping(value="/resource")
//	public Map<String, Object> home()
//	{
//		Map<String, Object> model =new HashMap<String, Object>();
//		
//		model.put("id", UUID.randomUUID().toString());
//		model.put("content", "Hello World");
//		
//		return model;
//		
//	}
	
	@RequestMapping("/user")
	  public Principal user(Principal user) {
	    return user;
	  }
	
	@RequestMapping("/token")
	  @ResponseBody
	  public Map<String,String> token(HttpSession session) {
	    return Collections.singletonMap("token", session.getId());
	  }
	
}
