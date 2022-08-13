package com.bridgelabz.AddressBook;

class info 
{
// Method Creation
	void firstname(String firstname)
	{
		System.out.println("First name:" +firstname);
	}
	void lastname(String lastname)
	{
		System.out.println("Last name:" +lastname);
	}
	void city(String city)
	{
		System.out.println("City:" +city);
	}
	void state(String state)
	{
		System.out.println("State:" +state);
	}
	void zip(long zip)
	{
		System.out.println("Zip Code:" +zip);
	}
	void number(long num)
	{
		System.out.println("Number:" +num);
	}
	void email(String email)
	{
		System.out.println("Email:" +email);
	}
}

public class AddressBook {

	public static void main(String[] args) 
	{
	System.out.println("Welcome to address book program");
	info a1 = new info();
	
	// Methode Calling
	a1.firstname("Sushant");
	a1.lastname("Singh");
	a1.city("Pune");
	a1.state("Maharastra");
	a1.zip(410014);
	a1.number(735044778);
	a1.email("sushantsingh@gmail.com");
	}

}
