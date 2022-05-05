class Stringpalindrome
  {
    public static void main(String args[])
    {
      String str=new String("sas");
      String rev="";
      for(int i=str.length()-1;i>=0;i--)
        {
          rev=rev+str.charAt(i);
        }
      System.out.println(rev);
      if(str.equals(rev))
      {
        System.out.println(str+" it is palindrome");
      }
     else{
       System.out.println(str+" it is not a palindrome");
     }
    }
  }