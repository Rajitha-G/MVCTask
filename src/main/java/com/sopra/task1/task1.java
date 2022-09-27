package com.sopra.task1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class task1 
{
	@RequestMapping("/rajhu")
	public String Raj() 
	{
		return "information";
		
	}

}
