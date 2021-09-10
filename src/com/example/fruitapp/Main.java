package com.example.fruitapp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args){
		//create arraylist of user-defined class objects
		List<Fruit> list = new ArrayList<Fruit>();
		System.out.println("Student List (orderd by name)");
		Fruit s = new Fruit();
		list.add(s); //adding Student class object
		list.add(new Fruit(1, "rambutan"));
		list.add(new Fruit(2, "apple"));
		list.add(new Fruit(3, "banana"));
		list.add(new Fruit(4, "strewberry"));
		list.add(new Fruit(5, "peach"));
		list.add(new Fruit(6, "watermelon"));
		list.add(new Fruit(7, "durian"));
		list.add(new Fruit(8, "orange"));
		list.add(new Fruit(9, "cherry"));
		list.add(new Fruit(10, "grape"));
		list.add(new Fruit(11, "pineapple"));
		list.add(new Fruit(12, "coconut"));
		
		
		Collections.sort(list);
		for(Fruit a : list) {
			System.out.println(a.toString());
		}
		
	}
}

