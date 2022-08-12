package org.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest {
	
	public static void main(String[] args) throws InterruptedException {
		int a[]=new int[] {1,2,3,4,5,6,7,8,9,10};
		//System.out.println(a[9]);
	
		for (int i : a) {
		
				System.out.println(i);
			}
		String s[]=new String[] {"a","b","c","d","e","f","g"};
		
		List<String> list=new ArrayList<String>();
		int v=0;
		for (String i : s) {
			
			list.add(i);
			System.out.println(list.get(v));
			v=v+1;
		}
		
		System.out.println(list);
		}	
	
	
	}
		


