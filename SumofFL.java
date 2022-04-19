import java.util.*;
public class SumofFL 
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
    
      System.out.println("Enter a number: ");
      int number = sc.nextInt(); 
      int temp=number;
      int firstDigit=0;
      int lastDigit=0;
      int totalDigits=0;
      lastDigit=number%10;
     while(temp!=0)
      {
         temp= temp/10;
         totalDigits++;
        }
      firstDigit=number/((int) Math.pow(10, totalDigits-1));
      
      System.out.println("Number is: "+number);
      System.out.println("Total Digits: "+totalDigits);
      System.out.println("First digit of number: "+ firstDigit );
      System.out.println("Last digit of number: "+ lastDigit);
      System.out.println("Sum of first and last digit of number: "+ (firstDigit+lastDigit));
   }
}