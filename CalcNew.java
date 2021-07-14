package calculator;

import java.util.*;


public class CalcNew {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=scn.nextInt();
		System.out.println("Enter value of b");
		int b=scn.nextInt();
		
		int c=addition(a,b);
		System.out.println("Addition of two numbers is :" +c);
		
		int d=subtraction(a,b);
		System.out.println("Subtraction of two numbers is :" +d);
		
		int e=multiplication(a,b);
		System.out.println("Addition of two numbers is :" +e);
		
		int f=division(a,b);
		System.out.println("Addition of two numbers is :" +f);
		
		
				
		
		
		

	scn.close();
	}
	static int addition(int x,int y)
	{
		return x+y;
	}
	static int subtraction(int x,int y)
	{
		return x-y;
	}
	static int multiplication(int x,int y)
	{
		return x*y;
	}
	static int division(int x,int y)
	{
		return x/y;
	}

}