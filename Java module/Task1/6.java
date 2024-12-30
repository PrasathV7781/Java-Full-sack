import java.util.Scanner;
public class PatternPrinter {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
	for(int i=0;i<n;i++) { 
            for(int j=n;j>=1;j--) { 
                if((i+j)>n) 
                    System.out.print(j); 
                else 
                     System.out.print(n-i); 
             } 
         System.out.println(); 
        } 
    }
}
