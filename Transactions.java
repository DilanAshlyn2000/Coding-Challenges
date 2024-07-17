package com.chainsys.demo1;

public class Transactions {
   
	public static void getBalance(float balance,int accountnumber,float deposit) {
    	    
    	   System.out.println("\nBALANCE               :"+balance);
    	   float total=balance+deposit;
    	   System.out.println("ACCOUNT NUMBER        :"+accountnumber);
    	   System.out.println("DEPOSITED AMOUNT      :"+deposit);
    	   System.out.println("CURRENT BALANCE       :"+total);
    	   System.out.println("AMOUNT DEPOSITED!");
	}
       public static void getBalance(float balance,long phonenumber,float deposit) {
           System.out.println("\nBALANCE               :"+balance);
           float total=balance+deposit;
           System.out.println("DEPOSITED PHONE NUMBER:"+phonenumber);
    	   System.out.println("DEPOSITED AMOUNT      :"+deposit);
    	   System.out.println("CURRENT BALANCE       :"+total);
    	   System.out.println("AMOUNT DEPOSITED!");
}
       public static void getBalance(float balance,String bankname,int accountnumber,String branch,float deposit) {
    	   System.out.println("\nBALANCE               :"+balance);
           float total=balance+deposit;
           System.out.println("BANK NAME             :"+bankname);
           System.out.println("BRANCH                :"+branch);
           System.out.println("ACCOUNT NUMBER        :"+accountnumber);
    	   System.out.println("DEPOSITED AMOUNT      :"+deposit);
    	   System.out.println("CURRENT BALANCE       :"+total);
    	   System.out.println("AMOUNT DEPOSITED!");
       }   
}

