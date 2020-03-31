package com.redis.jedis.jedisdemo.service;

public interface ProgrammerService {
	
	void setProgrammerAsString(String key, String programmer);

	String getProgrammerAsString(String key);


}
