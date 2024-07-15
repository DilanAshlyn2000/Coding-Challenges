package com.chainsys.day7;

	import java.util.Scanner;

	public class Armstrong {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	       
	        if (isArmstrong(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	    }

	    public static boolean isArmstrong(int number) {
	        int originalNumber = number;
	        int numDigits = String.valueOf(number).length();
	        int sum = 0;

	        while (number > 0) {
	            int digit = number % 10;
	            sum += Math.pow(digit, numDigits);
	            number /= 10;
	        }
	        return sum == originalNumber;
	    }
	}
