package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice {
	int []n= {5,4,6,5,3};
	void prcatice() {
		int count=0;
		for(int i=0;i<n.length;i++) {
			
			for(int j=i+1;j<n.length;j++) {
				if(n[i]==n[j]) {
					count++;
					n[j]=0;
				}
			}
		}
		int u[]=new int[n.length-count];
		int k=0;
		for(int i=0;i<n.length;i++) {
			if(n[i]!=0) {
				u[k++]=n[i];
			
			
			}
			
		}
		for(int i=0;i<u.length;i++) {
			
				
				System.out.print(u[i]+" ");
				
			
			
		}
	}
	
}
