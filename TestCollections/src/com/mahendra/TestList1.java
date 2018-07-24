package com.mahendra;

import java.util.*;

public class TestList1 {

	public static void main(String[] args) {
		List<Person> people = new LinkedList<>();
		Person p = new Person("Mahendra",34,"mahendra@gmail.com");
		people.add(new Person("Gajendra",50,"gajendra@gmail.com"));
		people.add(new Person("Gajendra",35,"g.itsme@gmail.com"));
		people.add(p);
		p.setName("Surendra");
		people.add(new Person("Narendra",45,"n.itsme@gmail.com"));
		people.add(0, new Person("Dharmendra",78,"d.itsme@gmail.com"));
		people.add(p);
		people.add(new Person("Rajendra",35,"g.itsme@gmail.com"));
		
		Collections.sort(people);
		
		ListIterator<Person> it = people.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next().getName());
		}
		//Lambda Expression (Java 8 Only)
		Comparator<Person> comparator = (p1, p2) ->  p1.getAge()-p2.getAge();
		Comparator<Person> compareEmails = (x,y) -> x.getEmail().compareTo(y.getEmail());
		
		Collections.sort(people, compareEmails);
		
		for(Person pp : people) {
			System.out.println(pp.getName() + " "+pp.getAge()+"  "+pp.getEmail());
		}
	}

}
