package com.mycalculator.app;
import java.util.Scanner;
import java.lang.Math;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        float a,b,res;
		char choice,ch;
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.print("1. Add two nos\n");
			System.out.print("2. Subtract two nos\n");
			System.out.print("3. Multiply two nos\n");
			System.out.print("4. Divide two nos\n");
			System.out.println("5. Exponent function\n");
			System.out.print("6. Exit \n\n");
			System.out.print("Enter your choice :");
			choice=s.next().charAt(0);
			switch(choice) 
			{
			case '1':System.out.print("Enter two nos :");
			         a=s.nextFloat();
			         b=s.nextFloat();
			         res=a+b;
			         System.out.print("Result ="+res);
			         break;
			case '2':System.out.print("Enter two nos :");
	                 a=s.nextFloat();
	                 b=s.nextFloat();
	                 res=(a>b)?(a-b):(b-a);
	                 System.out.print("Result ="+res);
	                 break;
			case '3':System.out.print("Enter two nos :");
                     a=s.nextFloat();
                     b=s.nextFloat();
                     res=a*b;
                     System.out.print("Result ="+res);
                     break;
			case '4':System.out.print("Enter two nos :");
                     a=s.nextFloat();
                     b=s.nextFloat();
                     res=a/b;
                     System.out.print("Result ="+res);
                     break;
			case '5':System.out.print("Enter two nos :");
                     a=s.nextFloat();
                     b=s.nextFloat();
                     res=(float) Math.pow(a, b);
                     System.out.print("Result ="+res);
                     break;
			case '6':System.exit(0);
			         break;
			default :System.out.print("Invalid choice !!!");
			         break;
			}
			
			System.out.print("\n--------------------------------------\n");
		}while(choice!=6);
    }
}
