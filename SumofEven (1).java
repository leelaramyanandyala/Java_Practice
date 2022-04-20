import java.util.Scanner;
class SumofEven
{
  public static void main(String args[])
  {
    int a[]=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array values ");
    //reading values from user
    for(int i=0;i<5;i++)
      {
        a[i]=sc.nextInt();
      }
    //Printing on to display
    System.out.println("The array values are ");
    int sum=0;
    for(int i=0;i<5;i++)
      {
        if(a[i]%2==0)
          sum=sum+a[i];
         System.out.println(a[i]);
      }
    System.out.println(sum);
   
  }
}
