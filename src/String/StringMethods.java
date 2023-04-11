package String;

public class StringMethods {
	public static void main(String[] args) {
			
		String s1 = "Velocity";
		System.out.println(s1.substring(6));
		System.out.println(s1.isEmpty());
		System.out.println(s1.isBlank());
		System.out.println(s1.substring(4, 6));
		
		String s3 = "New Setup for Jenkins";
		
		String[] jenkins = s3.split(" ");
		for(int i=0;i<=jenkins.length-1;i++) {
			System.out.println(jenkins[i]);
		}
		
		System.out.println(s3.isEmpty());
		
		String s2 = "My Name is Navnath";
		String[] ar = s2.split(" ");
		for(String data:ar) {
			System.out.println(data.trim());
			
			
		
		}
		String name1 = 	"Ishuka ";
		String name2 = "Love you";
		System.out.println(name1.concat(name2));
		
	}
}
