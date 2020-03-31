package com.redis.jedis.jedisdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.redis.jedis.jedisdemo.model.Programmer;
import com.redis.jedis.jedisdemo.service.ProgrammerService;

@RestController
public class ProgrammerController {
	
	@Autowired
	ProgrammerService programmerService;
	
	
	@PostMapping(value = "/programmer-string")
	//@RequestMapping(method = RequestMethod.POST, value = "/programmer-string")
	public void addProgrammer (@RequestBody Programmer programmer) throws JsonProcessingException {
		
		ObjectMapper mapper = new ObjectMapper();
		programmerService.setProgrammerAsString(String.valueOf(programmer.getId()), mapper.writeValueAsString(programmer));
		
	}
	
	
//	@RequestMapping(value = "/programmer-string/{id}")
	@GetMapping(value = "/programmer-string/{id}")
	@ResponseBody
	public String readString (@PathVariable String id) {
		return programmerService.getProgrammerAsString(id);
	}


}
