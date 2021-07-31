package com.bridgelabz.BRP.day3;

import java.util.Scanner;
public class WindChill 
{
    public static void main(String[] args) 
	{
        Scanner cs = new Scanner(System.in);
        double V,T,W;
        System.out.println("Enter Arguments of T and V : ");
        T = cs.nextDouble();
        V = cs.nextDouble();

        W = 35.74 + 0.6215 * T + (0.4275 * t - 35.75) * (Math.pow(V,0.16));
        System.out.println("windChill is : "+W);
    }
}