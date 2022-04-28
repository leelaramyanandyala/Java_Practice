import java.util.*;
class Addition
  {
    int add(int a,int b)
    {
      return(a+b);
    }
    int add(int a,int b,int c)
    {
      return(a+b+c);
    }
    double add(double a,double b,double c,double d)
    {
      return(a+b+c+d);
    }
  }
class Cpoly
  {
    public static void main(String args[])
    {
      Addition a= new Addition();
      int x=a.add(2,4);
      int y=a.add(2,5,6);
      double z=a.add(2,4,6,6);
      System.out.println(x+" \n"+y+" \n"+z);
    }
  }
