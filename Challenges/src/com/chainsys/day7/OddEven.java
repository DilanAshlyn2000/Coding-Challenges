package com.chainsys.day7;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER:");
        int n = sc.nextInt();

        if(n%2!=0)
        {
            System.out.println("Weird");
        }
        else if(n%2==0 && (n>=2 && n<=5))
        {
            System.out.println("Not Weird");
        }
        else if(n%2==0 && (n>=6 && n<=20))
        {
            System.out.println("Weird");
        }
        else if(n%2==0 && n>20)
        {
            System.out.println("Not Weird");
        }
        sc.close();
    }

	}

