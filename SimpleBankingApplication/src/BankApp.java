import java.util.Scanner;

class BankOps {
	private String accNo;
	private String name;
	public int balance = 100000;// I set money in account as 100000
	private int pinNo;
	boolean choiceD;
	boolean choiceW;
	int amountD;
	int amountW;
	
	public int getPinNo() {
		return pinNo;
	}
	
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	
	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	Scanner sc = new Scanner(System.in);
	int pinCode = sc.nextInt();
	
	public void acountDetails() {
		if(pinCode == pinNo) {
			System.out.println("Details of bank customer: account number is " +this.accNo + " name is  "+ this.name);
			}
		else
		{
			System.out.println("please enter correct pincode");
		}
	}
	
	public void checkBalance() {
		if(pinCode == pinNo) {
			System.out.println("The account balance is " +balance);
		}
		else 
		{
			System.out.println("we can't fetch your account balance until you enter correct pin");
		}
	}
	
	public void withdraw() {
		
		if(pinCode == pinNo) {
			System.out.println("you like to withdraw money: true or false");
			boolean choiceW = sc.nextBoolean();
			if(choiceW == true) {
				System.out.println("Enter amount for withdrawl");
				int amountW = sc.nextInt();
				System.out.println("Account balance after withdrawl");
				System.out.println(balance-amountW);
				balance = balance-amountW;
			}
		}
		else {
			System.out.println("You cant withdraw money");
		}
	}
	
	
	public void deposit() {
		if(pinCode == pinNo) {
			System.out.println("You like to  deposite the money: true or false");
			boolean choiceD = sc.nextBoolean();
			
			if(choiceD == true) {
				System.out.println("Enter amount to be deposited");
			int amountD = sc.nextInt();
			    System.out.println("Total amount after deposit");
			    System.out.println(balance+amountD);
			    balance = balance+amountD;
			}
			else {
				System.out.println("Thankyou for visiting us");
			}
		}
		else {
			System.out.println("You can't deposite money either");
			}
	  }
}



public class BankApp {

	public static void main(String[] args) 
	{
		
		BankOps b = new BankOps();
		b.setAccNo("90009229");
		b.setName("Chandrika");
		b.setPinNo(7788);
		
		b.acountDetails();
		b.checkBalance();
		b.withdraw();
		b.deposit();
		
		System.out.println("Thanyou for visiting us");
	}
}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	


