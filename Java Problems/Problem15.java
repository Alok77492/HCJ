//Write a Java program to swap two variables.

import java.util.Scanner;
public class Problem15
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the first number : ");
       int num1 = sc.nextInt();
       System.out.print("Enter the second number : ");
       int num2 = sc.nextInt();
       sc.close();
       int temp;
       System.out.println("The number before swapping : "+num1+ " and "+num2);
       temp=num1;
       num1=num2;
       num2=temp;
       System.out.println("The number after swapping : "+num1+" and "+num2);
    }
}