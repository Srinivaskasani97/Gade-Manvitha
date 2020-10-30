class Square
{
int a=4;
int b=5;
void sum()
{
System.out.println(a+b);
}
}
class Sum extends Square
{
int c=20;
void mul()
{
System.out.println(c*a);
}
}
class Result{
public static void main(String args[])
{
Sum s=new Sum();
System.out.println("sum of two numbers");
s.sum();
System.out.println("multiplication of two numbers");
s.mul();
}
}