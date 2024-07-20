import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//Read input from user using Scannner class Object
		Scanner obj=new Scanner(System.in);
		//Read the starting number
		System.out.println("Enter the starting number: ");
		int start=obj.nextInt();
		//Read the starting number
		System.out.println("Enter the ending number: ");
		int end=obj.nextInt();
		while(start<=end){
		    System.out.print(start+" ");
		    start++;
		}
		
	}
}
