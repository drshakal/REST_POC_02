package org.mycompany.CustomerRepository;

//import java.util.Optional;

import org.mycompany.DetailsCustomer.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository <CustomerDetails ,Integer>{

	

}
