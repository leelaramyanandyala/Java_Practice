import java.util.Scanner;

public class Palindrome
{
   public static void main(String[] args)
   {
      int rev=0;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter a Number: ");
      int num = scan.nextInt();
      
      int temp = num;
      while(temp!=0)
      {
         rev = (rev*10) + (temp%10);
         temp /= 10;
      }
      
      if(num==rev)
         System.out.println("\n" +num+ " is a Palindrome Number.");
      else
         System.out.println("\n" +num+ " is not a Palindrome Number.");
   }
}