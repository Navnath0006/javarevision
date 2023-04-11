package Array;

public class CompareArrayData {

	public static void main(String[] args) {
		int arr1 [] = {10,20,30,50,60};
		int arr2 [] = {10,20,80,90,70};
		
		for(int i=0;i<=arr1.length-1;i++) {
			if(arr1[i]==arr2[i])
			{
				
			}
			else
			{
				System.out.println(i+": "+arr1[i]+" "+arr2[i]);
			}
		}
	}
}
