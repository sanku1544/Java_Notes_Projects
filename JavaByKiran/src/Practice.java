
public class Practice {
 public static void main(String[] args) {
	 int count=0;
     for(int i=1;i<=500;i++){
         while(i>0){
             int n=i/10;
             if(n==5){
                 count++;
             }
             n=i%10;
             i=n;
         }
        
     }
     System.out.print(count);
 }
}
