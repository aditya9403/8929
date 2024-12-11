package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentdao implements studentservice
{
  @Autowired
  studentRepo sr;

@Override
public void savedata(student s1) 
{
	sr.save(s1);
	
}
}
