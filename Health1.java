  import java.util.Scanner;
class Hospital{
	String patient_name;
	String patient_address;
	int bill_number;
	String disease_name;
	int ward_number;
	int admitted_date;
	int balance_amount;
	

	
	
}
class Blood
{
	float isonophils;
	int monophils;
	String blood_group;
        String blood_flow;
	int wbc_count;
	int rbc_count;
}

public class Health1
{
	public static void main(String[] args)
	{
		Hospital patient1=new Hospital();
                Scanner sc=new Scanner(System.in);
                System.out.println(" Enter patient details");
		patient1.patient_name=sc.next();
		patient1.patient_address=sc.next();
		patient1.bill_number=sc.nextInt();
		patient1.disease_name=sc.next();
		patient1.ward_number=16;
		patient1.admitted_date=sc.nextInt();		
		patient1.balance_amount=sc.nextInt();	
		
		
		
		Blood samples=new Blood();
                System.out.println("enter blood results");
		samples.isonophils=sc.nextFloat();
		samples.monophils=sc.nextInt();
		samples.blood_group=sc.next();
		samples.blood_flow=sc.next();
		samples.wbc_count=sc.nextInt();
		samples.rbc_count=sc.nextInt();
		
		
		
		
		System.out.println("============Patient details =============");
		
		System.out.println("patient name is: "+patient1.patient_name);
		System.out.println("patient address : "+patient1.patient_address);
		System.out.println("patient bill number : "+patient1.bill_number);
		System.out.println("the disease patient encountered with : "+patient1.disease_name);
		System.out.println("ward number is: "+patient1.ward_number);
		System.out.println("admitted date is : "+patient1.admitted_date);
		System.out.println("the balance amount is : "+patient1.balance_amount);
		
		

		System.out.println("============Blood Group details=============");
		
		System.out.println("isonophils are : "+samples.isonophils);
		System.out.println("monophils are : "+samples.monophils);
		System.out.println("blood group is : "+samples.blood_group);
		System.out.println("blood flow is : "+samples.blood_flow);
		System.out.println("wbc count  is : "+samples.wbc_count);
		System.out.println("rbc count is : "+samples.rbc_count);		
		
	}
}