package org.itacademie.java.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaExpression {

	public static void main(String[] args) {
		List<String> names1 = new ArrayList<String>();
		names1.add("Mahesh ");
		names1.add("Suresh ");
		names1.add("Ramesh ");
		names1.add("Naresh ");
		names1.add("Kalpesh ");

		List<String> names2 = new ArrayList<String>();
		names2.add("Mahesh ");
		names2.add("Suresh ");
		names2.add("Ramesh ");
		names2.add("Naresh ");
		names2.add("Kalpesh ");

		LamdaExpression lamdaExp = new LamdaExpression();
		System.out.println("Sort using Java 7 syntax: ");

		lamdaExp.sortUsingJava7(names1);
		System.out.println(names1);
		System.out.println("Sort using Java 8 syntax: ");

		lamdaExp.sortUsingJava7(names2);
		System.out.println(names2);
		
		//Iterates over each element of the List and calls the lambda expression specified by 'action'.
		foreachAndLamda();
	}

	// Using Java7
	private void sortUsingJava7(List<String> names) {
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
	}

	// Using Java8 -> Lamda expression
	private void sortUsingJava8(List<String> names) {
		Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	}
	
	private static void foreachAndLamda(){		
		List<Double> temperature = new ArrayList<Double>(Arrays.asList(new Double[] { 20.0, 22.0, 22.5 }));
		temperature.forEach(s -> System.out.println(s));
		temperature.forEach(System.out::println);
	}
}
