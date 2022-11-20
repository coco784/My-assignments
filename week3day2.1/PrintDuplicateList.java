package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDuplicateList {
public static void main(String[] args) {
	int[] arr={14,12,13,11,15,14,18,16,17,19,18,17,20};
	List<Integer>lst=new ArrayList <Integer>();
	for (int i = 0; i < arr.length; i++) {
		lst.add(arr[i]);
	}
	Collections.sort(lst);
	System.out.println(lst);
	
	for (int i = 0; i < lst.size()-1; i++) {
		if(lst.get(i)==(lst.get(i+1))){
			System.out.println(lst.get(i));
		}
		
}
}
}