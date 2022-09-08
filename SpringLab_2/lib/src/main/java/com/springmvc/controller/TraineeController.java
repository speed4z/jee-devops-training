package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springmvc.service.TraineeService;


@Controller
public class TraineeController {
	
	@Autowired
	TraineeService service;

}
