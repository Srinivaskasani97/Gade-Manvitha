import java.util.Scanner;
class Student{
int student_id;
String student_name;
int student_age;
int student_marks;
int student_gpa;
}

class Employee{
int employee_id;
int employee_salary;
int employee_number;
String employee_name;
String employee_address;

}






class Variables{
public static void main(String args[])
{

Student data1=new Student();
Scanner sc=new Scanner(System.in);  //using scanner
System.out.println("Enter student details");
data1.student_id=sc.nextInt();
data1.student_name=sc.next();
data1.student_age=sc.nextInt();
data1.student_marks=sc.nextInt();
data1.student_gpa=sc.nextInt();


System.out.println("=======student details======");
System.out.println("student id: " +data1.student_id);
System.out.println("student name is: "+data1.student_name);
System.out.println("age: " +data1.student_age);
System.out.println("marks: " +data1.student_marks);
System.out.println("percentage: " +data1.student_gpa);



Employee data2=new Employee();

System.out.println("Enter employee details");
data2.employee_id=sc.nextInt();
data2.employee_salary=sc.nextInt();
data2.employee_number=sc.nextInt();
data2.employee_name=sc.next();
data2.employee_address=sc.next();
System.out.println("======employee details======");
System.out.println("employee id: " +data2.employee_id);
System.out.println("salary: " +data2.employee_salary);
System.out.println("employee number: " +data2.employee_number);
System.out.println("employee name: " +data2.employee_name);
System.out.println("employee address: " +data2.employee_address);
}
}

