package com.dh.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/courses")
public class CourseController {

	@RequestMapping("/dh1")
	@ResponseBody
	public String hello1() {
		System.out.println("进来了");

		return null;
	}
}
