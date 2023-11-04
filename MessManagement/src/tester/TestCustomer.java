package tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static utils.CustomerUtils.*;
import static utils.CustMethods.*;
import com.app.core.Customer;

public class TestCustomer {

	public static void main(String[] args) {
		
		Map<String,Customer> hm=populateCustomerMap(populateCustomer());
		try(Scanner sc=new Scanner(System.in)){
			boolean exit=false;
			while(!exit) {
				System.out.println("1.Signup 6.Display");
				try {
					switch (sc.nextInt()) {
					case 1:
						/*String firstName, String lastName, String email, String password, String address,
			String regDate, String planEndDate, String phoneNo, String plan,Map<String, Customer> hm*/
						//abc pqr abc@gmail.com 12345 pune 2023-01-01 2022-01-01 2222 MONTHLY
						System.out.println("Enter fname,lname,email,passwd,add,regdate,planDate,phoneNo,plan");
						Customer c= AllValidation(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), hm);
						hm.put(c.getEmail(), c);
						System.out.println("Registered Successfull");
						break;
					case 6:
						hm.values().stream().forEach(System.out::println);
						break;
					case 0:
						exit=true;
						break;
					default:
						break;
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
