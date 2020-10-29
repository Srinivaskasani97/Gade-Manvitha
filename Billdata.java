class Supermarket  //Constructor example1
{
int customer_id;
String customer_name;
String customer_address;
int number_items;
int bill_number;
float due_amount;
float total_amount;
int number_purchased;
Supermarket(int customer_id,String customer_name,String customer_address,int number_items,int bill_number,float due_amount,float total_amount,int number_purchased){
this.customer_id=customer_id; //instance variable,local variables
this.customer_name=customer_name;
this.customer_address=customer_address;
this.number_items=number_items;
this.bill_number=bill_number;
this.due_amount=due_amount;
this.total_amount=total_amount;
this.number_purchased=number_purchased;


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
System.out.println(" Number of items="+number_items);
System.out.println("------------------------------");
System.out.println("Bill number of the customer="+bill_number);
System.out.println("------------------------------");
System.out.println("Due amount="+due_amount);
System.out.println("------------------------------");
System.out.println("Total amount to be paid="+total_amount);
System.out.println("------------------------------");
System.out.println("No.of times the customer purchased="+number_purchased);
System.out.println("******************************");
}
}
class Billdata{
public static void main(String args[])
{
Supermarket mahesh=new Supermarket(1,"swarna","123 abc",5,234,300.25f,2000.56f,2);
Supermarket siri=new Supermarket(2,"aparna","swarna palace",4,9,323.5f,2999.6f,1);
Supermarket mani=new Supermarket(3,"amala","234 flat",3,8,324.5f,277.6f,24);
Supermarket lasya=new Supermarket(5,"swathi","101 flat",5,2,113.5f,244.6f,23);            
}

}
