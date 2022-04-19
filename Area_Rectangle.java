import java.util.Scanner;
class Area_Rectangle
  {
  public static void main(String args[])
    {
      int l,b;
      System.out.println("enter l and b values");
      Scanner sc=new Scanner(System.in);
      l=sc.nextInt();
      b=sc.nextInt();
      int area=l*b;
      System.out.println("Area_Rectangle is "+area);
    }
  }  