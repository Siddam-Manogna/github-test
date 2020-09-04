package com.myapp.spring;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//import com.myapp.spring.bean.Student;


@Controller
public class HomeController {

@RequestMapping(value = "/")
public String home() {
return "show";
}



@RequestMapping(value = "cars")
public String home1() {
return "cars";
}
/*@RequestMapping(value="display")
public String myMeth2(Model model,@ModelAttribute Student student)
{
model.addAttribute("student",student);
return "design";
}*/
}
