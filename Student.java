class Student{
  String Name;
  int Rollno;
  String Branch;
public static void main(String args[])
  {
    Student st1= new Student();
    st1.Name="Leela";
    st1.Rollno=1234;
    st1.Branch="ECE";
    Student st2= new Student();
    st2.Name= "Ramu";
    st2.Rollno= 5678;
    st2.Branch= "CSE";
    System.out.println(st1.Name+" "+st1.Rollno+" "+st1.Branch);
    System.out.println(st2.Name+" "+st2.Rollno+" "+st2.Branch);
  }
}