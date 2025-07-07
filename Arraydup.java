package com.Demo;
import java.util.*;
public class Arraydup {

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
		            arr2[i] = sc.nextLine();
		        }

		        // Use a HashSet to store elements of arr1
		        Set<String> set1 = new HashSet<>(Arrays.asList(arr1));
		        Set<String> duplicateSet = new HashSet<>();

		        // Check duplicates using set
		        for (String item : arr2) {
		            if (set1.contains(item)) {
		                duplicateSet.add(item); // Set ensures uniqueness
		            }
		        }

		        // Print unique duplicates
		        System.out.println("Unique duplicate elements are:");
		        for (String dup : duplicateSet) {
		            System.out.println(dup);
		        }

		        sc.close();
		    }
     
	
}
