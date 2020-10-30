class Gadjets{
void ram()
{
System.out.println("Ram is different");
}
void display()
{
System.out.println("display is different");
}
}
class Mobile extends Gadjets
{
void ram()
{
System.out.println(" Ram is 2gb");
}
void display()
{
System.out.println("5.2 inches");
}
}
class Laptop extends Gadjets
{
void ram()
{
System.out.println("Ram is 8gb");
}
void display()
{
System.out.println("14.2 inches");
}
}
class MethodOverriding2
{
public static void main(String args[])
{
Gadjets x=new Gadjets();
x.ram();
x.display();
x=new Mobile();
x.ram();
x.display();
x=new Laptop();
x.ram();
x.display();
}
}
