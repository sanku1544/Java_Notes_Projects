package com.tka.Jan17;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int []n= {4,5,1,42,145,2,42,2,5};
		int cnt=0;
		System.out.println("Before ");
		for(int i=0;i<n.length;i++) {
			
				System.out.print(n[i]+" ");
			
		}
		System.out.println("\nDuplicate elemnts is: ");
		for(int i=0;i<n.length;i++){
			
			for(int j=i+1;j<n.length;j++) {
				if(n[i]==n[j]) {
					if(n[i]!=0) {
					System.out.print(n[i]+" ");
					cnt++;
					n[j]=0;
					}
				}
				
			}
		}
		int unique[]=new int[n.length-cnt];
		int k=0;
		System.out.println("\nAfter removing duplicates: ");
		for(int i=0;i<n.length;i++) {
			if(n[i]!=0) {
				unique[k++]=n[i];
				
			}
		}
		for(int i=0;i<unique.length;i++) {
			
				System.out.print(unique[i]+" ");
			
		}
		
	}


	

}
