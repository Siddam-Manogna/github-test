package com.myspr.springbootapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestApi {


@RequestMapping(value="test")
public String hello()
{

return "Hello World";
}



@RequestMapping(value="student")
public Student getStudent()
{

Student student=new Student(10,"DHONI");
return student;
}


}