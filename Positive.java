/*
3.Write a java program to check whether a number is positive,negative or zero 
*/
import java.util.Scanner;
class Cc
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the n value :");
      n = sc.nextInt();
      if(n>0){
        System.out.println("positive ");
        }
      else if(n==0){
           System.out.println("positive or negative ");
        }
      else if(n<0){
           System.out.println("negative ");
      }
      }
      }