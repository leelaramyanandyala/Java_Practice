import java.util.Scanner;
  class Number
    {
      public static void main(String args[])
      {
        int a;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a value");
        a = sc.nextInt();
        if(a>18)
        {
          System.out.println("Eligible");
        }
        else 
          {
            System.out.println("Not Eligible");
          }
        }  
    }
