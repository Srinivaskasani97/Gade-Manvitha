import java.util.Scanner;
class HotelStaff{
	String staff_name;
	String staff_address;
	int phone_number;
	String referred_name;
	int table_number;
	int appointed_date;
	int salary_amount;
		
}
class Orders
{
	int number_plates;
	int item_varities;
	String item_name;
        String starter_name;
	int bill_amount;
	int table_number;
}

public class Restaurant
{
	public static void main(String[] args)
	{
		HotelStaff waiter=new HotelStaff();
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter waiter details");
		waiter.staff_name=sc.next();
		waiter.staff_address=sc.next();
		waiter.phone_number=sc.nextInt();
		waiter.referred_name=sc.next();
		waiter.table_number=sc.nextInt();
		waiter.appointed_date=sc.nextInt();		
		waiter.salary_amount=sc.nextInt();	
		
		
		
		Orders customer=new Orders();
                System.out.println("Enter order details");
                customer.item_varities=sc.nextInt();
		customer.number_plates=sc.nextInt();
		customer.item_name=sc.next();
		customer.starter_name=sc.next();
		customer.bill_amount=sc.nextInt();
		customer.table_number=sc.nextInt();
		
		
		
		
		
                System.out.println("============waiter details =============");
                System.out.println("waiter name is: "+waiter.staff_name);
		System.out.println("waiter address : "+waiter.staff_address);
		System.out.println("waiter phone number : "+waiter.phone_number);
		System.out.println("referred by : "+waiter.referred_name);
		System.out.println("table number is: "+waiter.table_number);
		System.out.println("appointed date is : "+waiter.appointed_date);
		System.out.println("the salary amount is : "+waiter.salary_amount);
		
		

		System.out.println("============Customer details=============");
		System.out.println("number plates ordered are : "+customer.number_plates);
                System.out.println("number of varities ordered are : "+customer.item_varities);
                System.out.println("item name is : "+customer.item_name);
		System.out.println("starter name is : "+customer.starter_name);
		System.out.println("bill amount  is : "+customer.bill_amount);
		System.out.println("the table number is : "+customer.table_number);		
		
	}
}