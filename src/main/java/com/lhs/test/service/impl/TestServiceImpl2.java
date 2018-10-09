package com.lhs.test.service.impl;

import com.lhs.test.annotation.Service;
import com.lhs.test.service.TestService2;

@Service
public class TestServiceImpl2 implements TestService2 {

	@Override
	public String test2() {
		return "method test2 do success!";
	}

}
