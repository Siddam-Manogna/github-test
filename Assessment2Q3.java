package com.dxc.logical;

import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class Assessment2Q3 {

Map<String, List<Car>> carstore;

public void displayCarsByShowroomName(String showroomname)
{
List<Car> cars=carstore.get(showroomname);

for(Car car:cars){
System.out.println(car);
}

}

public static void main(String[] args) {

Car c1=new Car("BMW",2000);
Car c2=new Car("Oodi",1999);
Car c3=new Car("Mahendra",1998);

List<Car> cars=new ArrayList<Car>();

cars.add(c1);
cars.add(c2);
cars.add(c3);

Showroom showroom=new Showroom("CARZ","Xyz",cars);
Car library=new Car("Abx",1997);



Assessment2Q3 m= new Assessment2Q3();

m.carstore=new HashMap<String,List<Car>>();
m.carstore.put(showroom.getShowroomName(), showroom.getCars());


m.displayCarsByShowroomName("CARZ");

}

}