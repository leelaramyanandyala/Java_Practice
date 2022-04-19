import java.util.*;
public class FirstandLast{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    System.out.println("Given number is: "+ n);
        int firstDigit = 0;
        int lastDigit = 0;
        lastDigit = n % 10;
        System.out.println("Last Digit is: " + lastDigit);        
        while(n != 0)
        {
            firstDigit = n % 10;
            n = n / 10;
        }
        System.out.println("First Digit is: " + firstDigit);
    }
}