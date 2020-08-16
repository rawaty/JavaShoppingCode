import java.util.*;

public class Shop {
	
static String Email="rawaty209@gmail.com";
static int quantity=0;
static int price=0;

static void verify()
{
	Scanner s =new Scanner(System.in);
	System.out.println("Please Verify Email to enter in the Sopping Site:");
	String e=s.nextLine();
	
	
	while(e.equals(Email)) {
		
			System.out.println("---------------------------Welcome To Shopping Site-----------------------");
			System.out.println("1.Chocolate		price=10");
			System.out.println("2.Biscuit   	price=10");
			System.out.println("3.kurkure		price=20");
			System.out.println("4.Colgate		price=40");
			
			break;
		}
	
}
static void chooseP()
{
	Scanner s =new Scanner(System.in);
	System.out.println("\nEnter Number in Above Option:");
	int n=s.nextInt();
	switch(n)
	{
	case 1:System.out.println("How many Chocolate You want:");
			int c=s.nextInt();
			quantity=quantity+c;
			price=quantity*10;
			break;
			
	case 2:System.out.println("How many Buscuit You want:");
			int b=s.nextInt();
			quantity=quantity+b;
			price=quantity*10;
			break;
	case 3:System.out.println("How many Kurkure You want:");
			int k=s.nextInt();
			quantity=quantity+k;
			price=quantity*20;
			break;
	case 4:System.out.println("How many Colgate You want:");
			int col=s.nextInt();
			quantity=quantity+col;
			price=quantity*40;
			break;
			
	default:
		System.out.println("Enter Correct Input");
	}


}
static void PaymentModeDetails(String bank,int number,int cv)
{
	System.out.println("-----------------Your Card Details----------------");
	System.out.println("Your bank Name :"+bank);
	System.out.println("Your Card Number :"+number);
	System.out.println("Your CV :"+cv);
	System.out.println("Your Amount:"+price);
	System.out.println("Thank you For Purchase");
	
}
static void paymentMode()
{
System.out.println("-----------Choose Your Option for Payment:--------------");
System.out.println("1.credit card");
System.out.println("2.Debit card");
System.out.println("3.Cash Only");
Scanner c=new Scanner(System.in);
int p=c.nextInt();
switch(p)
{
case 1: System.out.println("Which Bank?\n");
		String b=c.next();
		System.out.println("Plz Enter Your Credit card Number:");
		int n=c.nextInt();
		System.out.println("Plz Enter Your CV:");
		int cv=c.nextInt();
		PaymentModeDetails(b,n,cv);
		
		break;
		
case 2:System.out.println("Which Bank?");
		String ba=c.next();
		System.out.println("Plz Enter Your Credit card Number:");
		int no=c.nextInt();
		System.out.println("Plz Enter Your CV");
		int cve=c.nextInt();
		PaymentModeDetails(ba,no,cve);
		break;
case 3:System.out.println("Thank you for Product");
		
		break;
		
default:
	System.out.println("Enter Correct Input");
}
}
static void showInfo()
{
System.out.println("--------------------Payment Detail-----------------");
System.out.println("Quantity:"+quantity);
System.out.println("Your Amount:"+price);
}
	public static void main(String[] args) {
		
		verify();
		
	
		chooseP();
		showInfo();
		
		paymentMode();
			
				
		
		}
		

	}


