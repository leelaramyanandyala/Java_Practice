/*
4.Write a java program to check whether a number is divisible by 5 and 11 or not 
*/
import java.util.Scanner;
class Divisible
  {
    public static void main(String args[])
    {
      int num;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the n value");
      num = sc.nextInt();
      if((num%5==0) && (num%11==0)){
        System.out.println("divisible "+ num);
        }
      else {
        System.out.println("not divisible");
      }
        
      }
      
  }