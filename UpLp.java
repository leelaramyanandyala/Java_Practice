/*
10.Write a java program to check whether a character is uppercase alphabet or lowercase alphabet
*/
import java.util.Scanner;
class UpLp
  {
    public static void main(String args[])
    {
      char ch;
      System.out.println("enter the character:");
      Scanner sc=new Scanner(System.in);
      ch=sc.next().charAt(0);
      if(ch >= 65 && ch <= 90)
      {
         System.out.println("it is an uppercase");
      }
      else if (ch >= 97 && ch <= 122)
      {
         System.out.println("it is a lowercase");
      }
      else 
      {
        System.out.println("it is not a character");
      }
    }
  }