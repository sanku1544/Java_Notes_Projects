package com.tka.Jan16;

public class Array {
 public static void main(String  []args) {
	 int []n= {1,5,7,3,69,41,8,54,4,45};
	 int max=0;
	 int sm=0;
	 for(int i=0;i<n.length;i++) {
		 if(n[i]>max) {
			 sm=max;
			 max=n[i];
		 }else if(sm<n[i] && sm!=max) {
			 sm=n[i];
		 }
	 }
	 System.out.println(sm);
 }
}
