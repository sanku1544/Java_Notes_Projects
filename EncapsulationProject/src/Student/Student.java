package Student;

public class Student {
   private static int marks;
   public static  void update(int n) {
	   if(n>0 && n<100) {
		   marks=n;
		   System.out.println(marks);
	   }else {
	   System.out.println("Enter  marks 0 to 100");
	   }
   }
}
