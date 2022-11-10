package com;

import java.util.Scanner;

public class MathInt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1 Number: ");
		x= sc.nextInt();
		System.out.print("Enter 2 Number :");
		y=sc.nextInt();
		System.out.println("Math Add"+"="+Math.addExact(x, y));
	    System.out.println("Math Sub"+"="+Math.subtractExact(x, y));
	    System.out.println("Math Multiply"+"="+Math.multiplyExact(x, y));
	    System.out.println("Math Div"+"="+(x/ y));
	    System.out.println("Math Mod"+"="+(x % y));
	    System.out.println("Math Add Div"+"="+(x+y/23));
     
     long a,b;
		System.out.print("Enter 3 Number: ");
		a= sc.nextLong();
		System.out.println("Enter 4 Number ");
	    b= sc.nextLong();
	    System.out.println("And add"+"="+Math.addExact(a, b));
	    System.out.println("And sub"+"="+Math.subtractExact(a, b));
	    System.out.println("And multiply"+"="+Math.multiplyExact(a, b));
	    System.out.println("And Div"+"="+(a/b));
	    System.out.println("And Mod"+"="+(a%b));
	    
	  double math = 0D;
	    System.out.println("resultDbl3 = " + math);

	    for(int i=0; i<100; i++){
	        math += 0.01D;
	    }
	    System.out.println("resultDbl3 = " + math);
	    
	    
	   float X,Y;
		System.out.print("Enter 5 Number: ");
		X= sc.nextFloat();
		System.out.println("Enter 6 Number ");
	    Y= sc.nextFloat();
	    System.out.println("with to Number"+"="+Math.abs(X));
	    System.out.println("with to Number"+"="+Math.ceil(Y));
	    System.out.println("with to Number"+"="+Math.floor(X));
	    System.out.println("with to Number"+"="+Math.min(X, Y));
	    System.out.println("with to Number"+"="+Math.max(X, Y));
	    System.out.println("with to Number"+"="+Math.round(Y));
	    System.out.println("with to Number"+"="+Math.random());
	    
        int A,B;
        System.out.print("Enter 7 Number: ");
	    A= sc.nextInt();
	    System.out.println("Enter 8 Number ");
        B= sc.nextInt();
        System.out.println("The of number"+"="+Math.exp(A));
        System.out.println("The of  number"+"="+Math.log(B));
        System.out.println("The of number"+"="+Math.log10(B));
        System.out.println("The of number"+"="+Math.pow(A, B));
        System.out.println("The of number"+"="+Math.sqrt(A));
        
	    
	    short M,N;
		System.out.print("Enter 9 Number: ");
	    System.out.println("Number the enter"+"="+Math.PI);
	    System.out.println("Number the enter"+"="+Math.sin(Math.PI));
	    System.out.println("Number the enter"+"="+Math.cos(Math.PI));
	    System.out.println("Number the enter"+"="+Math.tan(Math.PI));
	    System.out.println("Number the enter"+"="+Math.asin(Math.PI));
	    System.out.println("Number the enter"+"="+Math.acos(Math.PI));
	    System.out.println("Number the enter"+"="+Math.atan(Math.PI));
        System.out.println("Number the enter"+"="+Math.atan2(Math.PI,Math.PI));
        System.out.println("Number the enter"+"="+Math.sinh(Math.PI));
        System.out.println("Number the enter"+"="+Math.cosh(Math.PI));
        System.out.println("Number the enter"+"="+Math.tanh(Math.PI));
        System.out.println("Number the enter"+"="+Math.toDegrees(Math.PI) );
        System.out.println("Number the enter"+"="+Math.toRadians(Math.PI) );
        
	 }
   
	}


