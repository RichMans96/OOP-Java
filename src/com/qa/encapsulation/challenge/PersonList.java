package com.qa.encapsulation.challenge;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
	public List<Person> people = new ArrayList<>();
	
	public PersonList() {}
	
	public Person search(String name) {
		int personIndex = 0;

		for(int i = 0; i < people.size(); i++) {
			if(people.get(i).getName() == name) {
				personIndex = people.indexOf(people.get(i));
			}	
		}
		return people.get(personIndex);
	}

	public void add(Person person) {
		people.add(person);
	}
	
	public void printAll() {
		for(Person person : people) {
			System.out.println(person);
		}
	}
	
}
