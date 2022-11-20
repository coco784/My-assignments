package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class PrintSecondLargest {

	public static void main(String[] args) {
		//int[] data = {3,2,11,4,6,7};
List <Integer> lst = new ArrayList <Integer>();
lst.add(3);
lst.add(2);
lst.add(11);
lst.add(4);
lst.add(6);
lst.add(7);
System.out.println(lst);

int n= lst.size()-1;
		Collections.sort(lst);
		System.out.println(lst);
		
		int secondLargest=lst.get(n-1);
		System.out.println(secondLargest);
		
}
}
