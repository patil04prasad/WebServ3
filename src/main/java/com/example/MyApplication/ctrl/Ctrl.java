package com.example.MyApplication.ctrl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Ctrl
{

	@Autowired
	RestTemplate rsMethod;
	
	Logger l=LogManager.getLogger(Ctrl.class);
	
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/GoAir",produces="Appication/json",method=RequestMethod.GET)
	public List get()
	{
			l.warn("hdsadjk");
		    String url="http://localhost:8084/JetAirways";
		    l.warn("hdsadjk");
			List l1=rsMethod.getForObject(url, List.class);
			l.warn("hdsadjk");
			System.out.println(l1);
			return l1;
	}
}
