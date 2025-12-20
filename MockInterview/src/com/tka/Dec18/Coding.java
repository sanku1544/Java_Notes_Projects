package com.tka.Dec18;

public class Coding {
	void ReverseString(String name) {
		String n = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			n = n + name.charAt(i);
		}
		System.out.print(n);

	}

	void PalindromeString() {
		String name = "lal lal";
		String n = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			n = n + name.charAt(i);
		}
		if (n.equals(name)) {
			System.out.print("Palindrome:- " + name);
		} else {
			System.out.println("Not Palindrome:- " + name);
		}
	}

	void countVC() {
		String name = "Mohan Suryawanshi";
		int vowels = 0;
		int cons = 0;

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'u') {
				vowels++;
			} else if (name.charAt(i) != ' ') {
				cons++;
			}
		}
		System.out.println("Vowels in string is:- " + vowels);
		System.out.println("Consonents in string is:- " + cons);
	}

	void Frequency() {
		String name = "aabccd";
		String visited = "";

		for (int i = 0; i < name.length(); i++) {

			char ch = name.charAt(i);

			if (visited.contains(ch + "")) {
				continue;
			}

			int count = 0;
			for (int j = 0; j < name.length(); j++) {
				if (ch == name.charAt(j)) {
					count++;
				}
			}

			visited = visited + ch;
			System.out.println(ch + " = " + count);
		}
	}
	void revArray() {
		int []n= {4,8,5,7,2,6};
		for(int a=n.length-1;a>=0;a--) {
			System.out.println(n[a]);
		}
		
	}

}
