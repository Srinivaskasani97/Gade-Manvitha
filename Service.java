class Hyundai     //constructor example3
{
int customer_id;
String customer_name;
String customer_address;
int year_purchased;
int bill_number;
float due_amount;
float total_amount;
int number_services;
Hyundai(int customer_id,String customer_name,String customer_address,int year_purchased,int bill_number,float due_amount,float total_amount,int number_services){
this.customer_id=customer_id; //instance variable,local variables
this.customer_name=customer_name;
this.customer_address=customer_address;
this.year_purchased=year_purchased;
this.bill_number=bill_number;
this.due_amount=due_amount;
this.total_amount=total_amount;
this.number_services=number_services;


this.display();
}
void display()
{
System.out.println("Id of the customer="+customer_id);
System.out.println("------------------------------");
System.out.println("Name of the customer="+customer_name);
System.out.println("------------------------------");
System.out.println("Address of the customer="+customer_address);
System.out.println("------------------------------");
System.out.println(" Year of purchasing the car="+year_purchased);
System.out.println("------------------------------");
System.out.println("Bill number of the customer="+bill_number);
System.out.println("------------------------------");
System.out.println("Due amount="+due_amount);
System.out.println("------------------------------");
System.out.println("Total amount to be paid="+total_amount);
System.out.println("------------------------------");
System.out.println("No.of times the car serviced="+number_services);
System.out.println("******************************");
}
}
class Service{
public static void main(String args[])
{
Hyundai mahesh=new Hyundai(1,"swarna","123 abc",5,234,300.25f,2000.56f,2);
Hyundai siri=new Hyundai(2,"aparna","swarna palace",4,9,323.5f,2999.6f,1);
Hyundai mani=new Hyundai(3,"amala","234 flat",3,8,324.5f,277.6f,24);
Hyundai lasya=new Hyundai(5,"swathi","101 flat",5,2,113.5f,244.6f,23);            
}

}