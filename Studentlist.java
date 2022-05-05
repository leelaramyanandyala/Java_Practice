import java.util.*;
class Student
  {
    int rollno;
    String name;
    Student(int rollno,String name)
    {
      this.rollno=rollno;
      this.name=name;
    }
  }
class Studentlist
  {
    public static void main(String[] args)
    {
      ArrayList<Student>al=new ArrayList<Student>();
      Student st1=new Student(123,"leela");
       Student st2=new Student(3,"Ram");
      al.add(st1);
      al.add(st2);
      al.add(new Student(34,"rahul"));
      for(Student s:al)
        {
          System.out.println(s.rollno+" "+s.name);
        }
    }
  }