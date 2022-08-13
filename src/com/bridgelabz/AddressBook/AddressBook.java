package com.bridgelabz.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

class info 
{
	void dataAdd() 
	{
		// Scanner to take user input
		Scanner scanner = new Scanner(System.in); 
		{
			ArrayList<String> contacts = new ArrayList<String>();
			
			System.out.println("Enter First Name:");
			String firstname = scanner.nextLine();
			contacts.add(firstname);
			
			System.out.println("Enter Last Name:");
			String lastname = scanner.nextLine();
			contacts.add(lastname);
			
			System.out.println("Enter Address:");
			String add = scanner.nextLine();
			contacts.add(add);
			
			System.out.println("Enter City:");
			String city = scanner.nextLine();
			contacts.add(city);
			
			System.out.println("Enter State:");
			String state = scanner.nextLine();
			contacts.add(state);
			
			System.out.println("Enter Zip Code:");
			String zip = scanner.nextLine();
			contacts.add(zip);
			
			System.out.println("Enter Phone Number:");
			String phoneno = scanner.nextLine();
			contacts.add(phoneno);
			
			System.out.println("Enter Email Address:");
			String email = scanner.nextLine();
			contacts.add(email);
			
			// Display a array list
			System.out.println("Contact Added");
			System.out.println(contacts);
			
			System.out.println("Enter the first name of contact you want to edit :");
			String firstname1 = scanner.nextLine();
			
			if(firstname1.equals(firstname)) {
				dataAdd();
			} else {
				System.out.println("No contact exists by this name..! Please try again");
			}
		}	
	}

}

public class AddressBook 
{

	public static void main(String[] args) 
	{
	System.out.println("Welcome to address book program");
	System.out.println("PhoneBook");
	// Creating Object
	info person1 = new info();
	// Calling method
	person1.dataAdd();
	
	}
}
