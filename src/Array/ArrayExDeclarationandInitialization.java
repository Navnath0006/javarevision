package Array;

import java.util.Arrays;

public class ArrayExDeclarationandInitialization {
	public static void main(String[] args) {
		int [] arr = {10,50,46,14,50,60};
		System.out.println(arr.length);
		System.out.println("Print original data");
		Arrays.sort(arr);
		for(int a:arr)
		{
			System.out.println(a);
		}
	}
}
