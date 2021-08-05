package com.bridgelabz.BRP.day4;

import java.util.Scanner;

public class Sqrt 
{

    static double square(double n, double l){
        double x =n;
        double root;
        int count  =0;
        while (true){
            count++;
            root = 0.5 * (x +(n / x));
            if (Math.abs(root - x) < 1)
                break;
            x = root;
        }
        return root;
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        double n,1;
        System.out.println("Enter Value of n");
        n=cs.nextDouble();
        System.out.println("Enter Value of l ");
        l=cs.nextDouble();
        System.out.println(squareRoot(n,1));
    }
}

