import java.util.Scanner;
class SumOfOdd
  {
    public static void main(String args[])
    {
      int sum=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter n value");
      int n=sc.nextInt();
      int i=1;
      while(i<=n){
        sum=sum+i;
        i=i+2;
      }
      System.out.println(sum);
    }
  }