package com.dh.mvcdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dh.test.TestService;

@Controller
@RequestMapping("/hello")
public class SpringTestController {

	@Autowired
	private TestService testService;

	@RequestMapping("/dh")
	public String hello() {

		System.out.println("sdfsd");
		System.out.println(testService.test());
		return "home";
	}

	@RequestMapping("/dh1")
	public String hello1() {
		System.out.println(testService.test());
		System.out.println("杩涙潵浜�");
		return "home";
	}

}
