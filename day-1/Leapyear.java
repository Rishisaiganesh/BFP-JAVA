package com.bridgelabz.BRP.day1;

import java.util.Scanner;
public class Leapyear 
{
	public static void main(String[] args) 
	{
	  Scanner cs = new Scanner(System.in);
	  System.out.println("Enter the year : ");
	  int year = cs.nextInt();
	  if (((year %4 == 0) && (year % 100!=0)) || (year %400 == 0))
		System.out.println("Its a Leapyear");
	  else
		System.out.println("Its not a leap year");
 
	}
}
