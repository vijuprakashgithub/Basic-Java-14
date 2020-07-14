package com.viju;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    System.out.println("Enter the boundary to see numbers from 1");
    Scanner in = new Scanner(System.in);
    int boundary = in.nextInt();
    int sum = 0;
	for(int i=1; i<=boundary; i++)
    {
        System.out.println(i);
        sum = sum + i;
    }
        System.out.println("Sum of 1 to "+boundary+" is "+sum);
    }
}
