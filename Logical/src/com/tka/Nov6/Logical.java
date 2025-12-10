package com.tka.Nov6;

public class Logical {
	
		void Add(int a , int b) {
			int c =a+b;
			System.out.println("The Addition is : "+c);
		}
		void Sub(int a , int b) {
			int c =a-b;
			System.out.println("The Subtraction is : "+c);
		}
		void Mul(int a , int b) {
			int c =a*b;
			System.out.println("The Multiplication is : "+c);
		}
		void Div(int a , int b) {
			int c =a/b;
			System.out.println("The Dividation is : "+c);
		}
		
		void digitCount(int num) {
			int original_num = num;
			int count=0;
			if(num<0) {
				num *= -1;
			}
			while(num>0) {
				num= num/10;
				count++;
			}
			System.out.println("Total digits of "+original_num+" is : "+count);
		}
		
		void sumOfDigits(int num) {
			int original_num = num;
			int sum = 0;
			while(num>0) {
		int	rem = num%10;
			sum = sum+rem;
			num=num/10;
			}
			System.out.println("Sum of "+original_num+" is "+sum);
		}
		
		void reverseNumber(int  num) {
			int original_num = num;
			int n = 0;
			int rem=0;
			while(num>0) {
				rem = num%10;
				n = n*10+rem ;
				num=num/10;
				
			}
			System.out.println("Reverse of "+original_num+" is "+n);

		}
		void palindromeCheck(int  num) {
			int original_num = num;
			int n = 0;
			int rem=0;
			while(num>0) {
				rem = num%10;
				n = n*10+rem ;
				num=num/10;
				
			}
			if(original_num==n) {
			System.out.println("Palindrome");
			}
			else {
				System.out.println("Not Palindrome ");
			}

		}
}
