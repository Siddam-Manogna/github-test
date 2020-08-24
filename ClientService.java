package com.myschool.service;


import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.myschool.dao.ClientDao;
import com.myschool.model.Client;

public class ClientService {

public static void main(String[] args) {
// day mon dd time timezone yyyy
	SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
	java.util.Date dob=null;
	try {
	 dob=dateFormat.parse("01-06-2000");
	 //converts d given string into java util date

	} catch (ParseException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}

Client client=new Client("CENA",dob);

ClientDao dao=new ClientDao();
String res= dao.saveClient(client);
System.out.println(res);
}
// dd-mon-yyyy
}

