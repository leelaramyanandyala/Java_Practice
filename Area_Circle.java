import java.util.Scanner;
class Area_Circle
  {
  public static void main(String args[])
    {
      double r;
      System.out.println("enter r values");
      Scanner sc=new Scanner(System.in);
      r=sc.nextDouble();
      double area=3.14*r*r;
      System.out.println("Area_Circle is "+area);
    }
  }  