package org.itacademie.java.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
*A lambda expression is characterized by the following syntax -
*parameter -> expression body
*/
public class ForEachAndLamdaExpression {

	public static void main(String[] args) {
		ForEachAndLamdaExpression obj = new ForEachAndLamdaExpression();
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		List<String> items2 = new ArrayList<>();
		items2.add("A");
		items2.add("B");
		items2.add("C");
		items2.add("D");
		items2.add("E");

		// Normal way to loop a Map
		obj.normalLoopMap(items);
		// In Java 8, you can loop a Map with forEach + lambda expression.
		obj.LoopMapUsingForEachAndLambda(items);
		// Normal for-loop to loop a List.
		obj.NormalForLoopList(items2);
		// In Java 8, you can loop a List with forEach + lambda expression or
		// method reference.
		obj.ForLoopList(items2);

	}

	private void normalLoopMap(Map<String, Integer> items) {

		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}
	}

	private void LoopMapUsingForEachAndLambda(Map<String, Integer> items) {

		items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));
		items.forEach((k, v) -> 
				{
					System.out.println("Item : " + k + " Count : " + v);
					if ("E".equals(k)) { System.out.println("Hello E");
						}
				});
	}

	private void NormalForLoopList(List<String> items2) {
		for (String item : items2) {
			System.out.println(item);
		}
	}

	private void ForLoopList(List<String> items2) {
		items2.forEach(item -> System.out.println(item));
		items2.forEach(item ->{
			if ("C".equals(item)) {
				System.out.println(item);
			}
		});

		System.out.println("method reference");		
		items2.forEach(System.out::println);

		System.out.println("Stream and filter");
		// Output : B
		items2.stream().filter(s -> s.contains("B")).forEach(System.out::println);
	}
}
