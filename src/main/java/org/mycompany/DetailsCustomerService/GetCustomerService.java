package org.mycompany.DetailsCustomerService;

import java.util.List;
//import java.util.Optional;
//import java.util.Optional;
//import java.util.Optional;
import java.util.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.apache.camel.Exchange;
import org.mycompany.CustomerProcessor.ProcessorClass;
import org.mycompany.CustomerRepository.CustomerRepository;
import org.mycompany.DetailsCustomer.CustomerDetails;
import org.mycompany.DetailsCustomer.CustomerRequest;
import org.mycompany.DetailsCustomer.CustomerResponse;
import org.mycompany.DetailsCustomer.CustomerResponse;
//import org.mycompany.DetailsCustomer.CustomerRequest;
//import org.mycompany.DetailsCustomer.CustomerResponse;
import org.mycompany.DetailsCustomer.CustomerRequest;
//import org.mycompany.DetailsCustomer.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;

public class GetCustomerService {

	@Autowired
	CustomerRepository customerRepository;
//	
//	public List<CustomerDetails> getAllCustomer(){
//		
//		return customerRepository.findAll();
//	}
	

	public CustomerDetails getCustomer(CustomerRequest request) {
		int id=request.getCustomerDetails().getId();
		System.out.println("ID"+id);
		return customerRepository.findById(id).get();
		}
	
	
	
//	public Optional<CustomerDetails> getCustomer(CustomerRequest request) {
//		
//		int id = request.getCustomerDetails().getId();
//		
//		System.out.println("Id" +id);
//		
//		return customerRepository.findById(id);
//		
////		Optional<CustomerDetails> cd =customerRepository.findById(id);
////		cd.g
//		//CustomerResponse response = new CustomerResponse();
//		//response.getCustomerDetailsList().addAll(cd);
//		//return response;
//	}
	
	
	/*
	 * public CustomerDetails getCustomerbyId(int id) { return
	 * customerRepository.findById(id);
	 * 
	 * }
	 */
	
	/*
	 * public Optional<CustomerDetails> getCustomerDetails(CustomerRequest request)
	 * {
	 * 
	 * int id = request.getId();
	 * 
	 * return customerRepository.findById(id); }
	 */
	
	/*
	 * public Optional<CustomerDetails> getCustomerbyId(int id) {
	 * 
	 * return customerRepository.findById(id); }
	 */
	
	
	/*
	 * public Optional<CustomerDetails> getCustomerDetails(CustomerRequest request)
	 * {
	 * 
	 * int id=request.getCustomerDetails().getId();
	 * 
	 * Optional<CustomerDetails> response = customerRepository.findById(id);
	 * 
	 * return response; }
	 */
	
	/*
	 * public CustomerDetails getCustomerById(CustomerDetails reques) {
	 * 
	 * 
	 * int id = reques.getId();
	 * 
	 * System.out.println("ID :" +id); return customerRepository.findById(id).get();
	 * }
	 */
	 
	
	/*
	 * public Optional<CustomerDetails> getCustomerDetails(CustomerRequest request)
	 * { int id=request.getCustomerDetails().getId(); //CustomerResponse response =
	 * newCustomerResponse(); Optional<CustomerDetails> response
	 * =customerRepository.findById(id); return response;
	 * 
	 * }
	 */
	 

	
	/*
	 * public CustomerResponse getCustomerList(CustomerRequest request) { String
	 * name = request.getCustomerDetails().getName(); CustomerDetails
	 * customerDetails=request.getCustomerDetails(); List <CustomerDetails>
	 * custDetails = customerRepository.findAll(); return (CustomerResponse)
	 * custDetails; }
	 */
//	
//		
//		
//	}

	
	 
	 
	
	  
		/*
		 * public List<CustomerDetails> getAllCustomer(){
		 * 
		 * return customerRepository.findAll(); }
		 * 
		 * public CustomerDetails getCustomerById(int id) {
		 * 
		 * return customerRepository.findById(id).get(); }
		 */
	 
}
