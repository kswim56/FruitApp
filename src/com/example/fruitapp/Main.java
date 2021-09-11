package com.example.fruitapp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args){
		//create arraylist of user-defined class objects
		List<Fruit> list = new ArrayList<Fruit>();
		System.out.println("Student List (orderd by name)");
		list.add(new Fruit(1, "rambutan", 50));
		list.add(new Fruit(2, "apple", 80));
		list.add(new Fruit(3, "banana", 70));
		list.add(new Fruit(4, "strewberry", 90));
		list.add(new Fruit(5, "peach", 100));
		list.add(new Fruit(6, "watermelon", 75));
		list.add(new Fruit(7, "durian",20));
		list.add(new Fruit(8, "orange",60));
		list.add(new Fruit(9, "cherry",45));
		list.add(new Fruit(10, "grape", 65));
		list.add(new Fruit(11, "pineapple", 35));
		list.add(new Fruit(12, "coconut", 20));
		
		
		Collections.sort(list, new FruitComparator());
		for(Fruit a : list) {
			System.out.println(a.toString());
		}
		
	}
}

