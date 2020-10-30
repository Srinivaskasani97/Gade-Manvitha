class Human
{  
void describes()
{
System.out.println("Relationships");
}  
}  
class Father extends Human
{  
void draw()
{
System.out.println("works as an artist");
}  
}  
class Son extends Father
{  
void drive()
{
System.out.println("he loves driving");
}  
}  
class MultiInheritance2
{  
public static void main(String args[])
{  
Son ob=new Son();  
ob.describes();  
ob.draw();  
ob.drive();  
}
}