package com.myspr.demo.controller;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.myspr.demo.bean.Bank;

@RestController
public class BankSubController {

@Autowired
RestTemplate restTemplate;
@RequestMapping("/subscribebank")
public Bank getBank()
{
Bank bank=restTemplate.getForObject("http://localhost:1215/getbank", Bank.class);
System.out.println(bank);
return bank;

}
@RequestMapping("/subscribebanks")
public List<Bank> getBanks()
{
List<Bank> banks=restTemplate.exchange("http://localhost:1215/getbanks", HttpMethod.GET, null,
new ParameterizedTypeReference<List<Bank>>() {}).getBody();
return banks;

}


}