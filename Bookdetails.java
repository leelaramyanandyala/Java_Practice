import java.util.*;
class Library
  {
    int Book_id;
    String Book_name;
    String Author_name;
    Library(int Book_id,String Book_name,String Author_name)
    {
      this.Book_id=Book_id;
      this.Book_name=Book_name;
      this.Author_name=Author_name;
    }
  }
class Bookdetails
  {
    public static void main(String[] args)
    {
      ArrayList<Library>al=new ArrayList<Library>();
      Library b1=new Library(12345,"The James","leela");
      Library b2=new Library(6879,"Harrypotter","Ramss");
      al.add(b1);
      al.add(b2);
      al.add(new Library(34567, "Ramayan","rahul"));
      for(Library b:al)
        {
          System.out.println(Book_id+" "+Book_name+" "+Author_name);
        }
    }
  }