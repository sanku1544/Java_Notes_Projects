
public class ObjectProggram {
	int roll;
	String name;
	String city;
	
	void reading(String book) {
		System.out.println(name +"  likes  " + book);
	}
	
	void display (int roll, String name, String city) {
		this.name=name;
		this.roll=roll;
		this.city=city;
		System.out.println("Student name is "+this.name);
		System.out.println("Student roll no is "+this.roll);
		System.out.println("Student city is "+this.city);
	}

}
