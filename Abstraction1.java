abstract class Gadjets{
abstract void ram();
abstract void display();
void Start()
{
System.out.println(" starts with pressing power button");
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
class Abstraction1
{
public static void main(String args[])
{
Gadjets x;

x=new Mobile();
x.ram();
x.display();
x=new Laptop();
x.ram();
x.display();
}
}
