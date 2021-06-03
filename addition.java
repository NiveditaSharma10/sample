package helloworld;
import java.util.Scanner;

public class addition {
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	public void ADD()
	{
		System.out.println("enter one numbers");
		a=sc.nextInt();
		System.out.println("enter another numbers");
		b=sc.nextInt();
		c=a+b;
		System.out.println("addition is :"+c);
		
		
	}

	public static void main(String[] args) {
		addition o=new addition();
		o.ADD();

	}

}
