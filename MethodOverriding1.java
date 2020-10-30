class Bank{
void interest()
{
System.out.println("No interest");
}
void savings()
{
System.out.println("No savings");
}
}
class Sbi extends Bank
{
void interest()
{
System.out.println(" interest is 10lakhs");
}
void savings()
{
System.out.println("savings is 5lakhs");
}
}
class Union extends Bank
{
void interest()
{
System.out.println("interest is 9lakhs");
}
void savings()
{
System.out.println("savings is 5lakhs");
}
}
class MethodOverriding1
{
public static void main(String args[])
{
Bank x=new Bank();
x.interest();
x.savings();
x=new Sbi();
x.interest();
x.savings();
x=new Union();
x.interest();
x.savings();
}
}
