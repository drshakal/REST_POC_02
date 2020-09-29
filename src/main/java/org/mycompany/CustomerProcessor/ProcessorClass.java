package org.mycompany.CustomerProcessor;
import org.apache.camel.*;
import org.mycompany.DetailsCustomer.*;

public class ProcessorClass implements Processor  {
	
		
		
		public void process(Exchange exchange) throws Exception {

		
			int id = (int) exchange.getIn().getHeader("id");
			System.out.println("Header id"+id);
			CustomerDetails customerDetails = new CustomerDetails();
			customerDetails.setId(id);
			exchange.getIn().setBody(customerDetails);
			//String body = exchange.getIn().getBody(String.class);
			//exchange.getOut().setBody("Customer Details :"+body );
			
		
	}

}
