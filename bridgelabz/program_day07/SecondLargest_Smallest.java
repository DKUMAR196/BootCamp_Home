package com.bridgelabz.program_day07;

import java.util.Scanner;

public class SecondLargest_Smallest {
	static void findSecondLargest_Smallest(int a[]) {
		int n=1, temp;
		for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second Largest:"+a[n-2]);
        System.out.println("Smallest:"+a[0]);	
	}

	public static void main(String[] args) {		 
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array(Minimum 2):");
	       int n = sc.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for (int i = 0; i < n; i++) 
	        {
	            a[i] = sc.nextInt();
	        }	
	        findSecondLargest_Smallest(a);
	}
}
