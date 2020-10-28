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

public class Hotel
{
	public static void main(String[] args)
	{
		HotelStaff waiter=new HotelStaff();
		waiter.staff_name="Anand";
		waiter.staff_address="4-68, hyderabad";
		waiter.phone_number=3289;
		waiter.referred_name="payal";
		waiter.table_number=16;
		waiter.appointed_date=20;		
		waiter.salary_amount=20000;	
		
		
		
		Orders customer=new Orders();
		customer.number_plates=22;
		customer.item_name="Chicken fry";
		customer.starter_name="dry chicken";
		customer.bill_amount=2000;
		customer.table_number=2;
		
		
		
		
		
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
		System.out.println("item name is : "+customer.item_name);
		System.out.println("starter name is : "+customer.starter_name);
		System.out.println("bill amount  is : "+customer.bill_amount);
		System.out.println("the table number is : "+customer.table_number);		
		
	}
}