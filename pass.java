import java.util.Scanner;


public class Positive {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		if(a%2==0)
		{
			System.out.println("number is positive");
		}
		else
		{
			System.out.println("number is negatitive");
		}
		
	}
	

}
