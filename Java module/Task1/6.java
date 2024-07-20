import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//Read input from user using Scannner class Object
		Scanner obj=new Scanner(System.in);
		for(int i=5;i>0;i--){
		    for(int j=5;j>i;j--){
		        System.out.print(j);
		    }for(int k=i;k>0;k--){
		        System.out.print(k);
		    }System.out.println();
		}
}

}