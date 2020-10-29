class Restuarants{ //example1

void takeOrder(String order){
System.out.println("order given is "+order);
}
void takeOrder(String order1,String order2){
System.out.println("order given is "+order1+" and "+order2);
}
void takeOrder(String order1,String order2,String order3){
System.out.println("order given is  "+order1+ " and " +order2+ " and " +order3);
}
void takeOrder(String order1,String order2,String order3,String order4,String order5)
{
System.out.println("full meals order "+order1+ " and " +order2+ " and " +order3+ " and " +order4+ " and " +order5);
}
}
class Customer{
public static void main(String args[]) {
Restuarants kfc=new Restuarants();

kfc.takeOrder("Dosa");
kfc.takeOrder("dosa","idly");
kfc.takeOrder("dosa","idly","vada");
kfc.takeOrder("rice","curd","curry","paratha","icecream");
}
}