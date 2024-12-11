package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class taskdao implements taskservice {

	@Autowired
	taskrepo tr;
	
	@Override
	public void savedata(task t1) {
	tr.save(t1);
	}
	
	

}
