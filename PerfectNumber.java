import java.util.Scanner;

public class PerfectNumber
{
   public static void main(String[] args)
  {
    int sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number: ");
    int n = sc.nextInt();
    for(int i=1;i<n;i++)
      {
        if(n%i==0)
        {
          sum=sum+i;
        }
      }
      if(sum==n)
      {
      System.out.println("It is a Perfect Number.");
      }
      else{
        System.out.println("It is not a Perfect Number."); 
      }
        
   }
}