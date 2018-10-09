package com.lhs.test.service.impl;

import com.lhs.test.annotation.Autowired;
import com.lhs.test.annotation.Service;
import com.lhs.test.service.TestService;
import com.lhs.test.service.TestService2;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestService2 testService2;
	
	@Override
	public String test() {
		System.out.println(testService2.test2());
        return "method test do success!";
	}

}
