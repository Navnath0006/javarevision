package Array;

public class StringArrayExp {
	public static void main(String[] args) {
		
		String arr[] = new String[5];
		arr[0]="Navnath";
		arr[1]="Abhay";
		arr[2]="Sagar";
		arr[3]="Vinay";
		arr[4]="Rajesh";
		
		System.out.println(arr[1]);
		System.out.println(arr.length);
		System.out.println("--------Print all data----------");
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("--------Print all data ni reverse order----------");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
}
