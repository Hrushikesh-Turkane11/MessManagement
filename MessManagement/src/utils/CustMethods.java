package utils;

import java.time.LocalDate;
import java.util.Map;

import com.app.core.Customer;
import com.app.core.Plan;

import custom_exception.CustomExp;

public interface CustMethods {

	static void emailValidation(Map<String, Customer> hm,String email) throws CustomExp {
		if(hm.containsKey(email)) {
			throw new CustomExp("Email already taken");
		}
	}
	
	
	static LocalDate validateDate(String date) {
		return LocalDate.parse(date);
	}
	
	static Customer AllValidation( String firstName, String lastName, String email, String password, String address,
			String regDate, String planEndDate, String phoneNo, String plan,Map<String, Customer> hm) throws CustomExp {
		
			LocalDate rDate=validateDate(regDate);
			LocalDate pDate=validateDate(planEndDate);
			emailValidation(hm, email);
			Plan p=Plan.valueOf(plan.toUpperCase());
		return new Customer(firstName, lastName, email, password, address, rDate, pDate, phoneNo, Plan.valueOf(plan), p.getPrice());
	}
}
