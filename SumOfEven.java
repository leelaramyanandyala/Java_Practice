import java.util.Scanner;
class SumOfEven
  {
    public static void main(String args[])
    {
      int sum=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter n value");
      int n=sc.nextInt();
      int i=0;
      while(i<=n)
      {
        sum=sum+i;
        i=i+2;
      }
      System.out.println(sum);
    }
  }