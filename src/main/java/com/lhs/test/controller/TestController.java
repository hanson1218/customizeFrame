package com.lhs.test.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lhs.test.annotation.Autowired;
import com.lhs.test.annotation.Controller;
import com.lhs.test.annotation.RequestMapping;
import com.lhs.test.annotation.RequestParam;
import com.lhs.test.service.TestService;
import com.lhs.test.service.TestService2;

@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired("testServiceImpl")
    private TestService testService;
	
	@Autowired()
    private TestService2 testService2;
	
	@RequestMapping("/doTest")
    public void test(HttpServletRequest request, HttpServletResponse response, @RequestParam("param") String param){
        String result = testService.test();
        try {
            response.getWriter().println("do service result:" + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
