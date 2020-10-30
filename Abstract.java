abstract class Car{
abstract void cost();

abstract void mileage();
void start()
{
System.out.println("starts with a key");
}
}
class Audi extends Car
{
void cost()
{
System.out.println(" cost is 20lakhs");
}
void mileage()
{
System.out.println("mileage is 17km");
}
}
class Bmw extends Car
{
void cost()
{
System.out.println("cost is 30lakhs");
}
void mileage()
{
System.out.println("mileage is 21km");
}
}
class Abstract
{
public static void main(String args[])
{
Car x;

x=new Audi();
x.cost();
x.mileage();
x=new Bmw();
x.cost();
x.mileage();
}
}
