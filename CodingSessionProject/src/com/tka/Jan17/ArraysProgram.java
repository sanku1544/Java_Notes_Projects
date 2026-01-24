package com.tka.Jan17;

import java.util.Scanner;

public class ArraysProgram {
	int []n= {4,5,1,42,145,2,42};

	
	void A76() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size: ");
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter "+i+" elemment: ");
		
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i:arr) {
			sum=sum+i;
		}
		System.out.println("Sum of array is: "+sum);
	}
	void A77() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size: ");
		int a=sc.nextInt();
		int n[]=new int[a];
		System.out.println("Enter "+a+" Elements");
		for(int i=0;i<n.length;i++) {
		
			n[i]=sc.nextInt();
		}
		System.out.println("Even  no.s: ");
		for(int i:n) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	void A78() {
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size: ");
		int a=sc.nextInt();
		int n[]=new int[a];
		System.out.println("Enter "+a+" Elements");
		for(int i=0;i<n.length;i++) {
		
			n[i]=sc.nextInt();
		}
		for(int i:n) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println("Sum of Even no.s: "+sum);
	}
	void A79() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size: ");
		int a=sc.nextInt();
		int n[]=new int[a];
		System.out.println("Enter "+a+" Elements");
		for(int i=0;i<n.length;i++) {
			
			n[i]=sc.nextInt();
		}
		System.out.println("After reverse the array: ");
		for(int i=n.length-1;i>=0;i--) {
			
			System.out.print(n[i]+" ");
		}
	}
//	void A80() {
//		int min=0;
//		int count=0;
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter size: ");
//		int a=sc.nextInt();
//		int n[]=new int[a];
//		System.out.println("Enter "+a+" Elements");
//		for(int i=0;i<n.length;i++) {
//		
//			n[i]=sc.nextInt();
//		}
//		for(int k=0;k<n.length;k++) {
//			for(int i=0;i<n.length;i++) {
//			if(min<i) {
//				
//				min=n[i];
//			
//			}
//		}
//			n[k]=min;
//		
//		}
//		for(int i:n) {
//			System.out.println(i);
//		}
//		
//	}
	
	void A81() {
		
		int n[]= {11,5,88,41,25,36,45};
		for(int i=1;i<n.length;i++) {
			int j=n[i];
			int count=0;
			for(int k=1;k<=j;k++) {
			if(j%k==0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println(n[i]+" ");
		}
		}
		
	}
	
	void Prime100() {
		for(int i=1;i<=100;i++) {
			int j=i;
			int count=0;
			for(int k=1;k<=j;k++) {
			if(j%k==0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println(i+" ");
		}
		}
}
	void nextPrime() {
		int n=19;
		for(int i=n+1;true;i++) {
			int j=i;
			int count=0;
			for(int k=1;k<=j;k++) {
			if(j%k==0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println(i+" ");
			break;
		}
		}
	}
	void A82() {
		int []n= {45,21,6,3,74,65,44,70};
		for(int i=0;i<n.length;i++) {
			if(n[i]%5==0 && n[i]%7==0) {
				System.out.println(n[i]);
			}
		}
	}
	void A83() {
		int []n= {4,6,52,14,6,14,25};
		int small;
		int max=0;
		for(int i=0;i<n.length;i++) {
			if(max<n[i]) {
				max=n[i];
			}
			
		}
		small=max;
		for(int i=0;i<n.length;i++) {
			
			if(small>n[i]) {
				small=n[i];
			}
		}
		System.out.println("Smallest element is: "+small);
	}
	void A84() {
		int []n= {1,3,4,5,6};
//		int sum=0;
//		int last=6;
//		for(int i=0;i<n.length;i++) {
//			sum=sum+n[i];
//		}
//		int total=last*(last+1)/2;
//		total-=sum;
//		System.out.println(total);
		for(int i=0;i<n.length-1;i++) {
			
			int a=n[i+1];
			int b=n[i]+1;
			
			while(b!=a) {
				System.err.println(a++ +" Missing ");
				break; 
			}
		}
	}
	void A85() {
		int n[]= {4,2,54,1,5,14,3};
		for(int i=0;i<n.length;i++) {
			System.out.println(n[i]+" = "+n[i]*n[i]);
		}
	}
	void A86() {
		int []n= {45,14,21,41,21,43,51,1};
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n.length;j++) {
				if(n[i]!=n[j]) {
					
				}
			}
		}
	}

	void A87() {
		int n[]= {45,21,12,47,62,36,62};
		int max=n[0];
		int sm=n[0];
		for(int j=0;j<n.length;j++)
			for(int i=0;i<n.length;i++) {
			if(max<n[i]) {
				sm=max;
				max=n[i];
			}else if(sm<n[i] ) {
				sm=n[i];
			}
		}
		System.out.println(sm);
	}
	
	
	int max() {
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
				if(n[i]==n[j]) {
					n[j]=0;
				}
			}
			
			
		}
		
//		for(int i=0;i<n.length;i++) {
//			System.out.print(n[i]+" ");
//		}
		
		int max=n[0];
		int sm=n[0];
		for(int j=0;j<n.length;j++)
			for(int i=0;i<n.length;i++) {
			if(max<n[i]) {
				sm=max;
				max=n[i];
			}else if(sm<n[i]  ) {
				sm=n[i];
			}
		}
//		System.out.println("\n"+sm);
		return  sm;
		
	}
	
	void secondMax() {
		int mx=this.max();
//		System.out.println(mx);
		for(int i=0;i<n.length;i++) {
			if(n[i]==this.max()) {
				n[i]=0;
			}
		}
//		for(int i:n) {
//			System.out.println(i);
//		}
		
		int ans=this.max();
		System.out.println(ans);
//		System.out.println(sm);
		

	}
	
	void A89() {
		System.out.println("Before ");
		for(int i=0;i<n.length;i++) {
			
				System.out.print(n[i]+" ");
			
		}
		System.out.println("\nDuplicate elemnts is: ");
		for(int i=0;i<n.length;i++){
//			System.out.print(n[i]+" ");
			for(int j=i+1;j<n.length;j++) {
				if(n[i]==n[j]) {
					System.out.print(n[i]+" ");
					
					n[j]=0;
				}
				
			}
		}
		System.out.println("\nAfter removing duplicates: ");
		for(int i=0;i<n.length;i++) {
			if(n[i]!=0) {
				System.out.print(n[i]+" ");
			}
		}
		
	}

	

}
