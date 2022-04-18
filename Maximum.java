/*
2.Write a java program to write maximum of three numbers
*/
class Maximum
  {
  public static void main(String args[]){
    int a = 10;
    int b = 20;
    int c = 30;
    if(a>b){
      if(a>c){
        System.out.println("a is Big");
      }
      else{
        System.out.println("c is Big");
      }
      }
    else{
      if(b>c){
        System.out.println("b is Big");
      }
      else{
        System.out.println("c is Big");
      }
      }
    }
  }