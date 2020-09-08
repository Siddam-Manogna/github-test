package com.myspr.demo.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.myspr.demo.Model.Store;



@Transactional
public class StoreDao {


@Autowired
SessionFactory factory;


public StoreDao() {
// TODO Auto-generated constructor stub
}


public StoreDao(SessionFactory factory) {
super();
this.factory = factory;
}


public String saveStore(Store store){
try{
Session session=factory.getCurrentSession();
session.save(store);
return "Store Created";
}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}

return "cannot create Store";
}



}