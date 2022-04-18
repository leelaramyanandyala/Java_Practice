import java.util.Scanner;
class SumOfNatural
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
        i++;
      }
      System.out.println(sum);
    }
  }