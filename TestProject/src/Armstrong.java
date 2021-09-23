import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int num=number;
		while(number>0)
		{
		int digit=number%10;
		sum=sum+(digit*digit*digit);
		number=number/10;
		
		}
		System.out.println(sum);
		if(sum==num)
		{
			System.out.println("The number is an Armstrong number");
		}
		else
		{
			System.out.println("The number is not an Armstrong number");
		}
	}

}
