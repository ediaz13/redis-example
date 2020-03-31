package com.redis.jedis.jedisdemo.dao;

public interface ProgrammerRespository {
	
	void setProgrammerAsString (String idKey, String programmer);
	String getProgrammerAsString(String idKey);
	
}
