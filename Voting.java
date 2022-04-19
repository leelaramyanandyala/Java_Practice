import java.util.Scanner;
  class Voting
    {
      public static void main(String args[])
      {
        int age;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the age");
        age = sc.nextInt();
        if(age>=18)
        {
          System.out.println("Eligible");
        }
        else{
          System.out.println("Not Eligible");
          }
        }  
      }
      
    