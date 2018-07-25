package org.xxjr.action;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LoyService {
	@Autowired
	RestTemplate restTemplate;
	
	@SuppressWarnings("unchecked")
	public Map<String,Object> show(){
		System.out.println("show");
		return restTemplate.getForObject("http://XXJR-ADMIN-BUSI/show", Map.class);
	}
}
