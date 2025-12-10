package com.tka.Nov6;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first no.: ");
		int a = sc.nextInt();
		
		System.out.print("Enter secoond  no.: ");
		int b = sc.nextInt();
		
		System.out.print("Enter Choice : ");
		int n = sc.nextInt();
		
		Logical l1 = new Logical();
		
		sc.close();
		
		switch(n) {
		case 1:
			l1.Add(a,b);
			break;
		case 2:
			l1.Sub(a,b);
			break;
		case 3:
			l1.Mul(a,b);
			break;
		case 4:
			l1.Div(a,b);
			break;
		default:
			System.out.println("Enter valid details");
//			

	}

}
}
