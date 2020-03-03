package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

public class FurthurExercise {
	public static void main(String[] args) {
		printHelloWorld(new int[]{1,2,3,4,5,6,7,8});
		System.out.println("Second biggest: " + findSecondBiggest(new int[] {1,2,3,4,5}));
		System.out.println("Second biggest: " + findSecondBiggest(new int[] {19,9,11,0,12}));
	}
	public static void printHelloWorld(int[] arr) {
		for(int num: arr) {
			if(num % 5 == 0)
				System.out.println("World");
			else if(num % 7 == 0)
				System.out.println("Hello");
			else if(num % 5 == 0 && num % 7 == 0)
				System.out.println("HelloWorld");
		}
	}
	public static int findSecondBiggest(int[] arr) {
		int max1 = arr[0], max2 = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			}else if(arr[i] > max2) 
				max2 = arr[i];
		}
		return max2;
	}
}
