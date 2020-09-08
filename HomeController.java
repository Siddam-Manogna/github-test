package com.myspr.demo;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myspr.demo.Model.Store;
import com.myspr.demo.dao.StoreDao;


@Controller
public class HomeController {

@Autowired
StoreDao dao;



@RequestMapping(value="/")
public String home(Model model)
{
return "home";
}

@RequestMapping(value="/display")
public String display(Model model,@ModelAttribute Store store)
{
String status=dao.saveStore(store);
model.addAttribute("status",status);
return "display";
}

}