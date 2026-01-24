package com.tka.Jan17;

public class FrequencyCount {

	public static void main(String[] args) {
		int []n= {4,5,41,82,41,5,14,33,98,41};
		for(int i=0;i<n.length;i++) {
			int cnt=1;
			for(int j=i+1;j<n.length;j++) {
				if(n[i]==n[j] && n[i]!=0) {
					cnt++;
					n[j]=0;
				}
			}
			if(n[i]!=0) {
				System.out.println(n[i]+" = "+cnt);
			}
		}

	}

}
