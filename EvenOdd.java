/*
5.Write a java program to check whether a number is even or odd 
*/
import java.util.Scanner;
class EvenOdd
{
public static void main(String args[])
  {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the n value");
    n = sc.nextInt();
    if(n%2==0){
      System.out.println("even number");
    }
    else
    {
       System.out.println("odd number");
    }
  }
}