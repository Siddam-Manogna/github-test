package com.myspr.demo.controller;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myspr.demo.bean.Bank;

@RestController
public class BankController {

@GetMapping(value="/getbank")
public Bank getBank()
{
return new Bank("ICICI","M.G ROAD","Bangalore");

}

@GetMapping(value="/getbanks")
public List<Bank> getBanks()
{

/*
* Bank bank1= new Bank("ICICI","M.G ROAD","Bangalore"); List<Bank> banks=new
* ArrayList<Bank>(); banks.add(bank1);
*/


return (List<Bank>)Arrays.asList
(
new Bank("ICICI","M.G ROAD","Bangalore"),
new Bank("ICICI","J P Nagar","Bangalore"),
new Bank("ICICI","R T Nagar","Bangalore"),
new Bank("HDFC","M.G ROAD","Bangalore")

);



}

}
