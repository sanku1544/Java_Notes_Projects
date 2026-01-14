package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice {
	void prcatice() {
		List l1= new ArrayList();
		l1.add(25);
		l1.add(23);
		l1.add(54);
		Collections.sort(l1);
		System.out.println(l1);
		
		int []n= {1,45,2,54,1,65,2,1,74,13,4,15,77};
		int m[]=new int[n.length];
		for(int i=0;i<n.length;i++) {
			
			for(int j=i+1;j<m.length;j++) {
				if(n[i]==n[j]) {
					System.out.println(n[i]);
					break;
				}
			}
		}
	}
	
}
