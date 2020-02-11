package com.openspace24.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
	
	@Autowired
	ElasticSearchConnection elasticSearchConnection;
	
	@RequestMapping(value = "/log",method = RequestMethod.GET)
	public List<EmActionLog> getEmlogInfo(){
		
		return elasticSearchConnection.getLogInfo();		
	}
	
//	
//	@RequestMapping(value = "/log/info",method = RequestMethod.GET)
//	public void getEdumanLog(){
//		
//		 elasticSearchConnection.getEdumanLog();	
//	}
//	
}
