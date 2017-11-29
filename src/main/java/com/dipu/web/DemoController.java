package com.dipu.web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/*@Controller annotation as it a a request controller*/
@Controller
public class DemoController {

	@RequestMapping("/")
	String defaultFun(){
		return "index";
	}	
	@RequestMapping(value="/Welcome", method = RequestMethod.GET)
	String welcome(HttpServletRequest request) throws IOException{
			return "welcome";
	}
	@RequestMapping("/Bye")
	String bye(){
		return "bye";
	}
	@RequestMapping("/Hi")
	String hi(){
		return "hi";
	}	
	
}
