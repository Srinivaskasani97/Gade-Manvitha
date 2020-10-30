abstract class Shape{
abstract void sides();

abstract void area();
void start()
{
System.out.println("starts with a line");
}
}
class Traingle extends Shape
{
void sides()
{
System.out.println(" sides of traingle is 3");
}
void area()
{
System.out.println("area of a traingle is hb/2");
}
}
class Square extends Shape
{
void sides()
{
System.out.println("sides of square is 4");
}
void area()
{
System.out.println("area of square is s*s");
}
}
class Abstraction
{
public static void main(String args[])
{
Shape x;

x=new Traingle();
x.sides();
x.area();
x=new Square();
x.sides();
x.area();
}
}
