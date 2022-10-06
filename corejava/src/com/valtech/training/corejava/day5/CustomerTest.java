package com.valtech.training.corejava.day5;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class CustomerTest {
	int Diamond=4;
	int Platinum =3;
	int gold=2;
	int silver=1;
	@Test
	public void test() throws Exception {
		Set<Customer> cust= new TreeSet<Customer>();
		
		Customer cus1= new Customer("Meghana",Diamond,"2001-09-25",23000);
		Customer cus2= new Customer("Meg",Platinum,"2001-09-13",23000);
  	    Customer cus3= new Customer("ABC",Diamond,"2001-05-25",5400);
        Customer cus4= new Customer("XYZ",Platinum,"2001-09-10",54000);
        Customer cus5= new Customer("HELLO",gold,"2001-10-25",8100);
        Customer cus6= new Customer("LMN",silver,"2001-10-25",1400);
        Customer cus7= new Customer("PQR",Diamond,"2001-11-25",6500);
        Customer cus8= new Customer("Blahblah",silver,"2001-11-25",900);
        
        
		
		cust.add(cus1);
		cust.add(cus2);
  	    cust.add(cus3);
  	    cust.add(cus4);
  	    cust.add(cus5);
  	    cust.add(cus6);
  	  cust.add(cus7);
  	cust.add(cus8);
  	    
  	    
		
		 System.out.println(cust.size());
		for(Customer c : cust) {
			System.out.println(c.name+" "+convert_to_string(c.type)+" "+c.date+" "+c.moneyspent);
		}
	}
	
	public String convert_to_string (int t1) {
		switch (t1) {
		case 1:
			  return "Silver";
		
		case 2:
			  return "Gold";
		
		case 3:
			  return "Paltinum";
			
		case 4:
			  return "Diamond";
			

		default:
			return "0";
		
		}
	}

}