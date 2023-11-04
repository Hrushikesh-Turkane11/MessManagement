package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.app.core.Customer;
import com.app.core.Plan;

public interface CustomerUtils {

	static List<Customer> populateCustomer(){
		/*String firstName, String lastName, String email, String password, String address,
			LocalDate regDate, LocalDate planEndDate, String phoneNo, Plan plan, double final_amount*/
		List<Customer> lst=new ArrayList<Customer>(Arrays.asList(
				new Customer("Abhishek","Mahajan","abhi1.dac@gmail.com"
				,"12345","Pune",LocalDate.parse("1990-05-01"),LocalDate.parse("1995-05-01"),"2222",Plan.valueOf("MONTHLY"),
				3000),  
				new Customer("Hrushi","Turkane","hrushi1.dac@gmail.com"
						,"12345","Pune",LocalDate.parse("2000-08-01"),LocalDate.parse("2005-05-01"),"1111",Plan.valueOf("YEARLY"),
						3000),
				new Customer("Rahul","Mahajan","rahul1.dac@gmail.com"
						,"12345","Pune",LocalDate.parse("1850-08-01"),LocalDate.parse("2000-11-19"),"5555",Plan.valueOf("HALFYEAR"),
						3000),
				new Customer("Vishal","Ingle","vishal1.dac@gmail.com"
						,"12345","Pune",LocalDate.parse("2001-05-01"),LocalDate.parse("2012-05-15"),"4444",Plan.valueOf("HALFYEAR"),
						3000),
				new Customer("Ashish","Sharma","ashish1.dac@gmail.com"
						,"12345","Pune",LocalDate.parse("1995-05-01"),LocalDate.parse("2000-06-30"),"4444",Plan.valueOf("HALFYEAR"),
						3000)
				));
		
		return lst;
	}
	static Map<String,Customer> populateCustomerMap(List<Customer> lst){
			return lst.stream().collect(Collectors.toMap(Customer::getEmail, p->p));
	}
	
}
