class Father
{  
void works()
{
System.out.println("doctor");
}  
}  
class Son extends Father
{  
void work()
{
System.out.println("engineer");
}  
}  
class Daughter extends Father
{  
void learn()
{
System.out.println("Still studying");
}  
}  
class HierInherit
{  
public static void main(String args[])
{  
Daughter c=new Daughter();  
c.learn();  
c.works();  
//c.bark();//C.T.Error  
}
}  