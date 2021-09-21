package com.rohitthebest;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Rohit
 * 
 *         using generic data-type we can use a single class or method with
 *         different data-types
 *
 */

public class Application {

	public static void main(String[] args) {

		// Using generic class
		Container<Integer, String> container1 = new Container<>(54, "fifty-four");

		container1.printValues();

		Set<String> set1 = new HashSet<String>();
		set1.add("Rohit");
		set1.add("Mohit");
		set1.add("Sagar");

		Set<String> set2 = new HashSet<String>();
		set1.add("Nidhi");
		set1.add("Priya");
		set1.add("Shubham");

		System.out.println(union(set1, set2));

		Set<Integer> set3 = new HashSet<>();
		set3.add(10);
		set3.add(20);
		set3.add(30);

		Set<Integer> set4 = new HashSet<>();
		set4.add(40);
		set4.add(50);
		set4.add(60);

		System.out.println(union(set3, set4));
	}

	// generic method

	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {

		Set<E> set = new HashSet<E>(set1);

		set.addAll(set2);

		return set;
	}

}
