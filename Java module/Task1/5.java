import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//Read input from user using Scannner class Object
		Scanner obj=new Scanner(System.in);
		//Read the  three input
		System.out.print("Enter the Total purchase amount : ");
		float totalPurchase = obj.nextFloat();
		float costToPaid,discount;
      if(totalPurchase<500)
      {
         costToPaid = totalPurchase;
         System.out.println("No discount is applicable");
      }
      else if(totalPurchase>500 && totalPurchase<1000)
      {
         discount = (totalPurchase*10)/100;
         System.out.println("discount :10% applied");
         costToPaid = totalPurchase - discount;
      }
      
      else
      {
         discount = (totalPurchase*20)/100;
         System.out.println("discount :20% applied");
         costToPaid = totalPurchase - discount;
      }
      System.out.println("Final Payable amount: " + costToPaid);
   
		

		
		
		
		
	}
}