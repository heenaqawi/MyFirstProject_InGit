import java.util.Scanner;

public class Count_Words {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		
			String str1[]=str.split("\\s+");
			System.out.println(str1.length);
		
		
		

	}

}
