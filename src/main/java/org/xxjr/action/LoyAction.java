package org.xxjr.action;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoyAction {
	@Autowired
	LoyService loyService;
	@RequestMapping("/test")
	public String test(){
		System.out.println("test");
		Map<String,Object> res = loyService.show();
		return (String) res.get("test");
	}
}
