package com.Demo;
import java.util.*;
public class Reversestring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the string:");
		String str = sc.nextLine();
		
		StringBuffer str1 = new StringBuffer(str);
		
		System.out.println(str1.reverse());
		
		
		

	}

}
