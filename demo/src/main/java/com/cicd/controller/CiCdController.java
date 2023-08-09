package com.cicd.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/cicd")
@CrossOrigin("*")
@Slf4j
public class CiCdController {
	@GetMapping("/get")
	@ResponseStatus(value=HttpStatus.OK)
public Product getProduct()
{
		log.info("data is printed");
		return Product.builder().id("12345").name("sashi").address("USA").build();
	
}
}
