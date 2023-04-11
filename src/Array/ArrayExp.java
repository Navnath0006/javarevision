package Array;

import java.util.Arrays;

public class ArrayExp {
	
	
	public static void main(String[] args) {
		int arr [] = new int[5];
		
		arr[0]=20;
		arr[1]=100;
		arr[2]=40;
		arr[3]=80;
		arr[4]=60;
		
		System.out.println(arr[1]);
		System.out.println(arr.length);
		System.out.println("--------Print all data----------");
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("--------Print all data in reverse order----------");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		System.out.println("--------Print data with sort----------");
		Arrays.sort(arr);
		System.out.println("print data in Ascending order");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("print data in reverse order");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
}
