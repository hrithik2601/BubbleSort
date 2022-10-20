package com.jsp.Array;

import java.util.Scanner;

public class BubbleSort {
	
	public static void sort(int[]a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size: ");
		int n = sc.nextInt();
		int[]a= new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		sort(a);
		for(int num:a) {
			System.out.print(num+ " ");
		}
		System.out.println();		
	}
}
