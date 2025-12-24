package com.home.Dec14;

public class Example {
	void m1() {
   int []a= {4,5,3,8,7,1};
   for(int n=a.length-1;n>=0;n--) {
	   System.out.print(a[n]+" ");
   }
	}
	void m2() {
		int []a= {4,5,3,8,7,1};
		for(int n=a.length-1;n>=0;n--) {
			if(a[n]==8) {
			System.out.print(n+" ");
			}
		}
	}
	void m3() {
		int []a= {4,5,3,8,7,10};
		int max=0;
		for(int n=0;n<a.length;n++) {
			if(a[n]>max) {
				max=a[n];
			}
		}
		System.out.print(max);
	}
	void m4() {
		int []a= {4,5,3,8,5,10,9};
		int max=0;
		int m=0;
		for(int n=0;n<a.length;n++) {

			if(a[n]>max) {
				m = max;
				max = a[n];
				
			} else if(a[n]>m && max>a[n]){
				m = a[n];
				
			}
			
		}
		
		System.out.println(max);
		System.out.print(m);
	}
	void m5() {
		int n = 15;

		for (int m = 1; m <= n; m++) {

		    int count = 0;

	
		    for (int i = 1; i <= m; i++) {
		        if (m % i == 0) {
		            count++;
		        }
		    }

		   
		    if (count == 2) {
		        System.out.println(m);
		    }
		}

		
	}
	
	void m6() {
		String s="Sanket";
		 s.toLowerCase();
	
		for(int i=0;i<=s.length()-1;i++) {
			
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ) {
				System.out.println("Vowels are: "+s.charAt(i)+" ");
			}else {
				System.out.println("Consonants are: "+s.charAt(i)+" ");
			}
		}
	}
	void m7() {
		int []n={4,8,158,2,45,56,2};
        int target=45;
        for(int i=0;i<n.length;i++){
            if(n[i]==target){
               System.out.println("target is placed on: "+i+" : "+n[i]); 
            }
           
        }
	}
	void m8() {
		int []n={4,8,158,2,45,56,2};
		int sum=0;
		for(int i:n) {
			sum=sum+i;
		}
		System.out.println("Sum of total elements: "+sum);
	}
	void m9() {
		int []n={4,8,158,2,45,56,2};
		int sum=0;
		int avg=0;
		for(int i:n) {
			sum=sum+i;
		}
		
		avg=sum/n.length;
		System.out.println("Avarage of total elements: "+avg);
	}
	void m10() {
		int []n={1,2,3,4,5,6,7,8,9};
		int b=15;
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n.length;j++) {
				if(n[i]+n[j]==b) {
					System.out.println(n[i]+" + "+n[j]+" = "+b);
				}
			}
		}
		
	}
	void m11() {
		int []n={1,2,3,4,5,6,7,8,9};
		int even=0;
		int odd=0;
		for(int i=0;i<n.length;i++) {
			if(n[i]%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Total even no.s: "+even);
		System.out.println("Total odd no.s: "+odd);
	}
	void m12() {
		
	}
}
