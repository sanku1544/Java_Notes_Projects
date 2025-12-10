package com.tka.Nov11;

public class staticVariable {
		static int roll;
		static int  count=0;
		String name="Kiran";
		int update(int r) {
			roll=r;
			return roll;
		}
		void newRoll(int n) {
			roll=n;
			System.out.println(roll);
			System.out.println(name);

		}
		
		staticVariable(){
			count++;
		}
		void showCount() {
			System.out.println(count);
		}
}
