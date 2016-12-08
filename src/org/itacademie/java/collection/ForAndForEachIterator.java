package org.itacademie.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForAndForEachIterator {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		long startTime, endTime;
		
		startTime = System.nanoTime();
		for (int i = 0; i <= 100; i++) {
			list.add(i, i);
			System.out.print(i);
		}
		endTime = System.nanoTime();
//		endTime = System.currentTimeMillis();
		System.out.println("That took " + (endTime - startTime) + " nanoseconds");

		startTime = System.nanoTime();
		forLoop(list);
		endTime = System.nanoTime();
		System.out.println("That took " + (endTime - startTime) + " nanoseconds");

		startTime = System.nanoTime();
		forEachLoop(list);
		endTime = System.nanoTime();
		System.out.println("That took " + (endTime - startTime) + " nanoseconds");

		startTime = System.nanoTime();
		iteratingLoop(list);
		endTime = System.nanoTime();
		System.out.println("That took " + (endTime - startTime) + " nanoseconds");
	}

	private static void forLoop(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
	}

	private static void forEachLoop(List<Integer> list) {
		for (Object obj : list) {
			System.out.print(obj);
		}
	}

	private static void iteratingLoop(List<Integer> list) {
		for (Iterator<Integer> it = list.iterator(); it.hasNext();) {
			System.out.print(it.next());
		}
	}
}
