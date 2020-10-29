class Teacher //constructor example2
{
int teacher_id;
String teacher_name;
String branch_name;
int number_classes;
int teaching_grades;
float hike_percentage;
float cutoff_salary;
int teacher_salary;
Teacher(int teacher_id,String teacher_name,String branch_name,int number_classes,int teaching_grades,float hike_percentage,float cutoff_salary,int teacher_salary){
this.teacher_id=teacher_id; //instance variable,local variables
this.teacher_name=teacher_name;
this.branch_name=branch_name;
this.number_classes=number_classes;
this.teaching_grades=teaching_grades;
this.hike_percentage=hike_percentage;
this.cutoff_salary=cutoff_salary;
this.teacher_salary=teacher_salary;

this.display();
}
void display()
{
System.out.println("Id of the teacher="+teacher_id);
System.out.println("------------------------------");
System.out.println("Name of the teacher="+teacher_name);
System.out.println("------------------------------");
System.out.println("Name of the branch="+branch_name);
System.out.println("------------------------------");
System.out.println(" Number of classes taking="+number_classes);
System.out.println("------------------------------");
System.out.println("grades of teaching="+teaching_grades);
System.out.println("------------------------------");
System.out.println("hike percentage="+hike_percentage);
System.out.println("------------------------------");
System.out.println("cutoff percentage of teacher="+cutoff_salary);
System.out.println("------------------------------");
System.out.println("salary of the teacher="+teacher_salary);
System.out.println("******************************");
}
}
class Constructors{
public static void main(String args[])
{
Teacher mahesh=new Teacher(1,"swarna","cse",3,4,3.5f,2.6f,20000);
Teacher siri=new Teacher(2,"aparna","cse",4,9,3.5f,2.6f,21000);
Teacher mani=new Teacher(3,"amala","eee",3,8,3.5f,2.6f,24000);
Teacher lasya=new Teacher(5,"swathi","eee",5,2,3.5f,2.6f,23000);            
}

}
