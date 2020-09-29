package org.mycompany.DetailsCustomer;

//import java.util.List;

//import javax.websocket.server.PathParam;

/*import org.mycompany.DetailsCustomerService.GetCustomerService;
import org.springframework.beans.factory.annotation.Autowired;*/


public class CustomerResponse {

	
	 // private List<CustomerDetails> customerDetailsList;
	  
	  private  CustomerDetails customerDetails;
	 
//	  
//	  public List<CustomerDetails> getCustomerDetailsList() {
//		  return customerDetailsList; 
//		  }
//	  
//	  public void setCustomerDetailsList(List<CustomerDetails> customerDetailsList){ 
//		  this.customerDetailsList = customerDetailsList; 
//		  }

			
			
			  public CustomerDetails getCustomerDetails() {
				  return customerDetails; 
				  }
			  
			  public void setCustomerDetails(CustomerDetails customerDetails) {
			  this.customerDetails = customerDetails;
			  }
			 
			 
	 
	

	
	
	
			/*
			 * @Autowired GetCustomerService gcds;
			 */
	  
		/*
		 * public List<CustomerDetails> getAllCustomer() {
		 * 
		 * return gcds.getAllCustomer(); }
		 * 
		 * public CustomerDetails getCustomerById(@PathParam("id") int id) {
		 * 
		 * return gcds.getCustomerById(id); }
		 */
	 
}
