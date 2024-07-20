import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//Read input from user using Scannner class Object
		Scanner obj=new Scanner(System.in);
		//Read the  input
		System.out.print("Input =");
		int input=obj.nextInt();
		int reversedNumber=0;
		int remainder;
		while(input!=0){
		    remainder=input%10;
		    reversedNumber=reversedNumber*10+remainder;
		    input/=10;
		    
		}System.out.print("Output ="+reversedNumber);
		
		
		
		
	}
}