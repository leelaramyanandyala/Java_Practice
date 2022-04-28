import java.util.*;
class Area
  {
    int mul(int l,int b)
    {
      return(l*b);
    }
    double mul(double r)
    {
      return(3.14*r*r);
    }
    int mul(int p)
    {
      return(p*p);
    }
    double mul(double b,double h)
    {
      return((1/2)*b*h);
    }
  }
class Shapes
  {
    public static void main(String args[])
    {
      Area a= new Area();
      int w=a.mul(4,5);
      double x=a.mul(6);
      int y=a.mul(2);
      double z=a.mul(4,8);
      System.out.println(w+" \n"+x+" \n"+y+" \n"+z);
    }
  }