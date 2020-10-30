interface School
{
public void students();
public void teachers();
}
interface College
{
public void students();
public void teachers();
}
class ClassRoom implements School,College
{
public void students()
{
System.out.println("students are 600");
}
public void teachers()
{
System.out.println("teachers are 100");
}
}
class Interface2
{
public static void main(String args[])
{
ClassRoom attend=new ClassRoom();
attend.students();
attend.teachers();
}
}