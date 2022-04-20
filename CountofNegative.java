import java.util.Scanner;
class CountofNegative
{
  public static void main(String args[])
  {
    int a[]=new int[5];
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the array values ");
    //reading values from user
    int count=0;
    for(int i=0;i<5;i++)
      {
        a[i]=sc.nextInt();
      }
    //Printing on to display
    System.out.println("The array values are ");
    for(int i=0;i<5;i++)
      {
        if(a[i]<0){
          count++;
         System.out.println(a[i]);
          }
      }
    System.out.println(count);
  }
}
