package com.example.demo;

import org.springframework.batch.item.ItemProcessor;
import com.example.demo.*;



public class CustomerProcessor implements ItemProcessor<Customer,Customer> {

	/*@Override
	public Customer process(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		return customer;
	}*/
	
	 @Override
	    public Customer process(Customer customer) throws Exception {
	       if(customer.getSalary()>15000) {
	    	   customer.setStatus("High");
	       }else {
	    	   customer.setStatus("Low");
	       }
	       
	       customer.setName(customer.getFirstName()+" " +customer.getLastName());
	       return customer;
	
	   }
	
	

}
