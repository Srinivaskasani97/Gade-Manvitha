class library{ //Method overlooading example3

void takeOrder(String order){
System.out.println(" first order given is "+order);
}
void takeOrder(String order1,String order2){
System.out.println("second order given is "+order1+" and "+order2);
}
void takeOrder(String order1,String order2,String order3){
System.out.println("third order given is  "+order1+ " and " +order2+ " and " +order3);
}
void takeOrder(String order1,String order2,String order3,String order4,String order5)
{
System.out.println("fourth order given is  "+order1+ " and " +order2+ " and " +order3+ " and " +order4+ " and " +order5);
}
}
class Books{
public static void main(String args[]) {
library text=new library();

text.takeOrder("novels");
text.takeOrder("magazines","textbooks");
text.takeOrder("journals","storybooks","novels");
text.takeOrder("paintings","magazines","storybooks","novels","newspaper");
}
}