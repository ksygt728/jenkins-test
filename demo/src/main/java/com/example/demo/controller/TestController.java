package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

// 프로토타입 개발중 간단한 데이터 확인을 위한 test컨트롤러

@RestController
@Tag(name = "bear controller", description = "bear controller desc")
public class TestController {

	@GetMapping("/print")
	public String helloworld() {
		return "build pipeline test";

	}

}
