package com.bridgelabz.BRP.day1;

import java.util.Scanner;
public class SpringSeason 
{
    public static void main(String[] args) 
	{
        Scanner cs = new Scanner(System.in);

        System.out.println("Enter the Month : ");
        int month = cs.nextInt();
        System.out.println("Enter the Day : ");
        int day = cs.nextInt();

        if ((month == 4 || month == 5) && (day <= 30 && day != 0))
		{
            System.out.println("True");
        }
        else if (month == 6 && day <= 20)
		{
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
}