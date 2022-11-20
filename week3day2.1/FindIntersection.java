package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		int [] s1= {3,2,11,4,6,7};	
		int [] s2= {1,2,8,4,9,7};
		List<Integer>lst=new ArrayList <Integer>();
		for (int i = 0; i < s1.length; i++) {
			lst.add(s1[i]);
		}
		Collections.sort(lst);
		System.out.println(lst);
		List <Integer>lst1=new ArrayList<Integer>();
		for (int j = 0; j < s2.length; j++) {
			lst1.add(s2[j]);
			}
		Collections.sort(lst1);
		System.out.println(lst1);
		
		//to find intersection
		for(int k=0;k<lst.size();k++) {
			for(int l=0;l<lst1.size();l++) {
				if(lst.get(k).equals(lst1.get(l))) {
					System.out.println(lst.get(k));
				}
				
			}
		}
			
				}
					
				
				
			
				
		
		
		
	}



