package com.mahendra;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {

	public static void main(String[] args) {
		List<Person> people = new LinkedList<>();
		Person p = new Person("Mahendra",34,"mahendra@gmail.com");
		people.add(new Person("Gajendra",50,"gajendra@gmail.com"));
		people.add(new Person("Gajendra",35,"g.itsme@gmail.com"));
		people.add(p);
		people.add(new Person("Narendra",45,"n.itsme@gmail.com"));
		people.add(0, new Person("Dharmendra",78,"d.itsme@gmail.com"));
		
 /*List<Person> newList=people.stream().filter((x)->x.getAge()>40).collect(Collectors.toList());
		for(Person y : newList) {
			System.out.println(y.getName()+ " age "+y.getAge());
		}
		*/
		people.stream().filter((x)->x.getAge()>40).forEach(TestStream::print);
	}
	
	static void print(Person p) {
		System.out.println("Name : "+p.getName()+" age: "+p.getAge());
	}

}
