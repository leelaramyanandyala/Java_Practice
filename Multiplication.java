import java.util.Scanner;
class Multiplication
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter n value");
      n=sc.nextInt();
      int i=1;
      while(i<=10){
      System.out.println(n+"*"+i+"="+n*i);
      i++;
        }
    }
  }
