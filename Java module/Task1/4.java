import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//Read input from user using Scannner class Object
		Scanner obj=new Scanner(System.in);
		//Read the  three input
		System.out.print("Enter the First number : ");
		int first=obj.nextInt();
		System.out.print("Enter the Second number : ");
		int second=obj.nextInt();
		System.out.print("Enter the Third number : ");
		int third=obj.nextInt();
		//using if elsif condition
		if(first<=second&&first<=third){
		    System.out.print("The smallest number is "+first);
		}else if(second<=third){
		    System.out.print("The smallest number is "+second);
		}else{
		    System.out.print("The smallest number is "+third);
		}
		

		
		
		
		
	}
}