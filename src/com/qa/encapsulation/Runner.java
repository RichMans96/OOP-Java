package com.qa.encapsulation;

import com.qa.encapsulation.challenge.Person;
import com.qa.encapsulation.challenge.PersonList;

public class Runner {

	public static void main(String[] args) {
		PersonList people = new PersonList();
		
		Person richard = new Person("Richard", 25, "Developer");
		Person chris = new Person("Chris", 25, "Developer");

		people.add(richard);
		people.add(chris);

		System.out.println(people.search("Chris"));
		people.printAll();
	}

	
}
