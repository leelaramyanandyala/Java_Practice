class Employee{
  String Name;
  int rollno;
  int salary;
  String dept;
public static void main(String args[])
  {
    Employee e1= new Employee();
    e1.Name="Leela";
    e1.rollno=1234;
    e1.salary= 30000;
    e1.dept="ECE";
    Employee e2= new Employee();
    e2.Name= "Ramu";
    e2.rollno= 5678;
    e2.salary= 30000;
    e2.dept= "CSE";
    Employee e3= new Employee();
    e1.Name="Vijay";
    e1.rollno=1356;
    e1.salary= 20000;
    e1.dept="ECE";
    System.out.println(e1.Name+" "+e1.rollno+" "+e1.salary+" "+e1.dept);
    System.out.println(e2.Name+" "+e2.rollno+" "+e2.salary+" "+e2.dept);
    System.out.println(e3.Name+" "+e3.rollno+" "+e3.salary+" "+e3.dept);
  }
}