package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
//	トップページへの遷移
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
