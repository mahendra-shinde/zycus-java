package com.mahendra;

import java.util.*;

public class TestSet1 {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();
		set.add(new Person("Gajendra",50,"gajendra@gmail.com"));
		set.add(new Person("Gajendra",35,"g.itsme@gmail.com"));
		set.add(new Person("Narendra",45,"n.itsme@gmail.com"));
		set.add(new Person("Dharmendra",78,"d.itsme@gmail.com"));
		
		set.add(new Person("Rajendra",35,"g.itsme@gmail.com"));
			
		System.out.println(set.size());
		
		Iterator<Person > it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getName());
		}
		
		
	}

}
