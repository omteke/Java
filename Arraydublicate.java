package com.Demo;
import java.util.*;
public class Arraydublicate {

	public static void main(String[] args) {
		  String[] arr1 = new String[5];
	        String[] arr2 = new String[5];

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the array elements for arr1:");
	        for (int i = 0; i < arr1.length; i++) {
	            arr1[i] = sc.nextLine();
	        }

	        System.out.println("Enter the array elements for arr2:");
	        for (int i = 0; i < arr2.length; i++) {
	            arr2[i] = sc.nextLine(); // correctly storing in arr2
	        }

	        // Display arr1
	        System.out.println("Elements of arr1:");
	        for (String val : arr1) {
	            System.out.println(val);
	        }

	        // Display arr2
	        System.out.println("Elements of arr2:");
	        for (String val : arr2) {
	            System.out.println(val);
	        }

	        // Find and print duplicate elements
	        System.out.println("Duplicate elements are:");
	        for (int i = 0; i < arr1.length; i++) {
	            for (int j = 0; j < arr2.length; j++) {
	                if (arr1[i].equals(arr2[j])) {
	                    System.out.println(arr1[i]);
	                }
	            }
	        }
	        sc.close();
	}
}
