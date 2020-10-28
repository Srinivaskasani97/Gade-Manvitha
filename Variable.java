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






class Variable{
public static void main(String args[])
{

Student data1=new Student();
data1.student_id=2020;
data1.student_name="Manvith";
data1.student_age=21;
data1.student_marks=99;
data1.student_gpa=6;


System.out.println("=======student details======");
System.out.println("student id:  " +data1.student_id);
System.out.println("student name is:  "+data1.student_name);
System.out.println("percentage:  " +data1.student_gpa);
System.out.println("marks:  " +data1.student_marks);
System.out.println("age:  " +data1.student_age);



Employee data2=new Employee();
data2.employee_id=2021;
data2.employee_salary=20000;
data2.employee_number=123;
data2.employee_name="vikas";
data2.employee_address="2324abd";
System.out.println("======employee details======");
System.out.println("employee id:  " +data2.employee_id);
System.out.println("salary:  " +data2.employee_salary);
System.out.println("employee number:  " +data2.employee_number);
System.out.println("employee name:  " +data2.employee_name);
System.out.println("employee address:  " +data2.employee_address);
}
}

