package String;

public class StringMethods {
	public static void main(String[] args) {
			
		String s1 = "Velocity";
		System.out.println(s1.substring(6));
		System.out.println(s1.isEmpty());
		System.out.println(s1.isBlank());
		System.out.println(s1.substring(4, 6));
		
		String s2 = "My Name is Navnath";
		String[] ar = s2.split(" ");
		for(String data:ar) {
			System.out.println(data.trim());
		}
	}
}