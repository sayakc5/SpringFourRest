package com.sayak.spring.four.rest.client;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.List;
 
import org.springframework.web.client.RestTemplate;
import com.sayak.spring.four.rest.model.Customer;
public class SpringRestTestClient {
	public static final String REST_SERVICE_URI ="http://localhost:8080/SpringFourRestDemo";
	
	@SuppressWarnings("unchecked")
    private static void listAllCustomers(){
        System.out.println("Testing listAllUsers API-----------");
         
        RestTemplate restTemplate = new RestTemplate();
        List<LinkedHashMap<String, Object>> customersMap = restTemplate.getForObject(REST_SERVICE_URI+"/customers/", List.class);
         
        if(customersMap!=null){
            for(LinkedHashMap<String, Object> map : customersMap){
                System.out.println("Customer : id="+map.get("id")+
                		", First Name="+map.get("firstName")+", Last Name="+map.get("lastName")+", Age="+map.get("age")+", Salary="+map.get("salary"));;
            }
        }else{
            System.out.println("No user exist----------");
        }
    }
}
