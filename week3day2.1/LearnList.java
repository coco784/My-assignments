package week3.day2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		//create List
		List <Integer> lst = new ArrayList<Integer>();
		//to add data in the list
		lst.add(10);
		lst.add(20);
		lst.add(40);
		lst.add(60);
		lst.add(50);
		lst.add(30);
		//to print the list
		System.out.println(lst);
		//to get individual index value
		System.out.println(lst.get(3));
		//to remove any data from list
		//lst.remove(4);
		//System.out.println(lst);
		System.out.println(lst.size());
		System.out.println(lst.isEmpty());
		System.out.println(lst.contains(50));
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i));
			
		}
		//lst.clear();
		//System.out.println(lst);
		//System.out.println(lst.isEmpty());
      Collections.sort(lst);
      System.out.println(lst);
		
		
		
	}

}
