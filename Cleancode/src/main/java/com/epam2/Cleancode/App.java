package com.epam2.Cleancode;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App{
  public static void main(String[]args){
   Scanner obj=new Scanner(System.in);
   System.out.println("Enter 1 to calculate S.I (or) Enter 2 to calculate C.I:");
   int input=obj.nextInt();
   double principal,rate_of_Interest,time,n;
   if(input==1)
   {
    System.out.print("Enter the Principal : ");
    principal = obj.nextDouble();
    System.out.print("Enter the Rate of interest : ");
    rate_of_Interest = obj.nextDouble();
    System.out.print("Enter the Time period : ");
    time = obj.nextDouble();
    Simple_Interest s=new Simple_Interest(principal,rate_of_Interest,time);
    System.out.print("Simple Interest is: " +s.calulatesi());
   }
   else
   {
    System.out.print("Enter the Principal : ");
    principal = obj.nextDouble();
    System.out.print("Enter the Rate of interest : ");
    rate_of_Interest = obj.nextDouble();
    System.out.print("Enter the Time period : ");
    time = obj.nextDouble();
    System.out.print("Enter the number of times the interest is : ");
    n = obj.nextDouble();
    Compound_Interest c=new Compound_Interest(principal,rate_of_Interest,time,n);
    System.out.println("Compond Interest is " +c.calulateci());
   }
   obj.close();
  }
}