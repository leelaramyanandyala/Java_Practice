
import java.util.Scanner;
class String1
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter string content");
      String s=sc.nextLine();
      System.out.println(" ");
      System.out.println(s);
      System.out.println(" ");
      String str1=" bitlabs"; //string literal
      //string literals are stored in heap pool
      String str3=new String("bitlabs"); //string object
      //string objects are directly stored in heap memory
      String str2="bitlabs";
      String str4=new String("bitlabs");
      String str5=new String("mamatha, vijay, vamsi");
      String str6=new String("Welcome to home");
      String str7=new String("dad");
      String rev=new String("");
     
      //string Array
      char [] charr = str2.toCharArray();
      for(Character o:charr)
        {
          System.out.println(o);
        }
      System.out.println(" ");

      //word splitting
      String [] strArray=str6.split(" ");
      for(String y:strArray)
          {
            System.out.println(y);
          }
      System.out.println(" ");

      //Reference Comparison for literals
      if(str1==str2)
      {
          System.out.println("1 and 2 references are same");
        }
      else{
        System.out.println("1 and 2 references are not same");
      }
      //reference comparison for objects
        if(str3==str4)
        {
          System.out.println("3 and 4 references are same");
        }
      else{
        System.out.println("3 and 4 references are not same");
          }
      System.out.println(" ");
     
      //content comparison for literals
      if(str1.equals(str2))
      {
        System.out.println("contents in 1 and 2 are same");
        }
        else{
          System.out.println("contents in 1 and 2 are not same ");
        }
      //content comparison for objects
      if(str3.equals(str4))
        {
          System.out.println("contents in 3 and 4 are same");
        }
      else{
        System.out.println("contents in 3 and 4 are not same");
      }
      System.out.println(" ");
      //printing string
      System.out.println(str1);
      System.out.println(" ");
      //removing space before word
      System.out.println(str1.trim());
      System.out.println(" ");
      //replacing any letter
      System.out.println(str2.replace("b","c"));
      System.out.println(" ");
      //finding string length
      System.out.println(str3.length());
      System.out.println(" ");
      //finding letter or number on any index position
      System.out.println(str2.charAt(0));
      System.out.println(" ");

      //checking whther string contains a word
      if(s.contains("vam"))
      {
      System.out.println("yes vam is present");
        }
      else
      {
        System.out.println("vam is absent");
      }
      System.out.println(" ");
     
      //checking whther string contains a word
      if(str5.contains("vamsi"))
      {
      System.out.println("yes vamsi is present");
        }
      else
      {
        System.out.println("vamsi is absent");
      }
      System.out.println(" ");

      //reversing a string
      for(int i=str7.length()-1;i>=0;i--)
        {
          rev=rev+str7.charAt(i);
        }
      System.out.println(rev);
      System.out.println(" ");
     
      //to find palindrome
      if(str7.equals(rev))
         {
           System.out.println("str7 is palindrome");
         }
      else{
        System.out.println("str7 is not a palindrome");
      }
     
      }
  }