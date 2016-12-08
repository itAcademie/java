package org.itacademie.java.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewMethodsInCollections {

	public static void main(String[] args) {
		List<Double> temperature = new ArrayList<Double>(Arrays.asList(new Double[] { 20.0, 22.0, 22.5 }));
		Map<String , Integer> authorBooks = new HashMap<String , Integer>();
		authorBooks.put("Robert Ludlum", 27);
		authorBooks.put("Clive Cussler", 50);
		authorBooks.put("Tom Clancy", 17);
		// void forEach(Consumer<? super T> action)
		// Iterates over each element of the List and calls the lambda expression specified by 'action'.
		forEachAndLamda(temperature);
		// boolean removeIf(Predicate<? super E> filter)
		// Iterates through the Collection and removes the element that matches the filter.
		removeIfMatchesFilter(temperature);
		//void replaceAll(UnaryOperator<E> operator)
		//// This is a very useful method. It replaces all elements in the List with the result of applying the operator (apply method)
		replaceAllInList(temperature);
		//void sort(Comparator<? super E> c)
		//Sorts the element using the provided comparator. This example sorts the elements in descending order
		sortingList(temperature);
		//void forEach(BiConsumer<? super K, ? super V> action)
		//This method performs the operation specified in the 'action' on each Map Entry (key and value pair). It iterates in the order of the key set.
		forEachMapEntry(authorBooks);
		//V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
		//V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)
		//V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction
		computeIfAbsentOrPresent(authorBooks);
		//V getOrDefault(Object key, V defaultValue)
		getOrDefaultMap(authorBooks);
		//V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction
		mergeInMap(authorBooks);
		//V putIfAbsent(K key, V value)
		putIfAbsentInMap(authorBooks);
		//remove and ReplaceAll
		//boolean remove(Object key, Object value)
		//V replace(K key, V newValue)
		//boolean replace(K key, V oldValue, V newValue)
		//void replaceAll (BiFunction<? super K, ? super V, ? extends V> function)
		removeAndReplaceAll(authorBooks);
		
	}

	private static void forEachAndLamda(List<Double> temperature) {
		temperature.forEach(s -> System.out.println(s));
		temperature.forEach(System.out::println);
	}

	private static void removeIfMatchesFilter(List<Double> temperature) {
		temperature.removeIf(s -> s > 22);
		temperature.forEach(System.out::println);
	}

	private static void replaceAllInList(List<Double> temperature) {
		temperature.replaceAll(s -> Math.pow(s, 0.5));
	}
	
	private static void sortingList(List<Double> temperature){
		temperature.sort((a, b) -> a > b ? -1 : 1);
	}
	private static void forEachMapEntry(Map<String , Integer> authorBooks){		
		authorBooks.forEach((a, b) -> System.out.println(a + " wrote " + b + " books"));
	}
	private static void computeIfAbsentOrPresent(Map<String, Integer> authorBooks){
		authorBooks.compute("Clive Cussler", (a, b) -> b + 1);
		authorBooks.computeIfAbsent("Agatha Christie", b -> b.length());
		authorBooks.computeIfPresent("Tom Clancy", (a, b) -> b + 1);
	}
	private static void getOrDefaultMap(Map<String, Integer> authorBooks){
		authorBooks.getOrDefault("AuthorA", 0);
	}
	private static void mergeInMap(Map<String, Integer> authorBooks){
		authorBooks.merge("AuthorB", 1, (a, b) -> a + b);
		System.out.println(authorBooks.get("AuthorB"));// 1
		authorBooks.merge("AuthorB", 1, (a, b) -> a + b);
		System.out.println(authorBooks.get("AuthorB"));//2
	}
	private static void putIfAbsentInMap(Map<String, Integer> authorBooks){
		System.out.println(authorBooks.putIfAbsent("AuthorC", 2));//null
		System.out.println(authorBooks.putIfAbsent("AuthorC", 2));//2
	}
	private static void removeAndReplaceAll(Map<String, Integer> authorBooks){
		authorBooks.replaceAll((a,b)->a.length()+b);
	}
	
}
