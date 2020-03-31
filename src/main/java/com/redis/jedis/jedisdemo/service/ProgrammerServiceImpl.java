package com.redis.jedis.jedisdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redis.jedis.jedisdemo.dao.ProgrammerRespository;

@Service
public class ProgrammerServiceImpl implements ProgrammerService{

	@Autowired
	ProgrammerRespository repository;
	
	@Override
	public void setProgrammerAsString(String key, String programmer) {
		repository.setProgrammerAsString(key, programmer);
		
	}

	@Override
	public String getProgrammerAsString(String key) {
		return repository.getProgrammerAsString(key);
	}

}
