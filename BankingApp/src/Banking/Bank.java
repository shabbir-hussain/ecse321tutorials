package Banking;

public class Bank {
	
	/*
	 * This is a very simple Banking sim. Some questions to ask are:
	 * What happens if two customers try to access eachother's account
	 * What happens if a customer withdraws too much money?
	 */
	
	public static void main(String args[]){
		System.out.println("Bank is Open");
		
		Customer Jim = new Customer(100, "password");
		Customer Tim = new Customer(88,"tH8^d#89X!");
		
		Account JimAccount = new Account(Jim.giveCash(99), Jim.getPassword());
		Account TimAccount = new Account(Tim.giveCash(99), Tim.getPassword());
		
		TimAccount.Withdraw(Tim, 10000);
		
		System.out.println("Jim now has $"+ Jim.getCashIntPocket()+" in his pocket." );
		System.out.println("Tim now has $"+ Tim.getCashIntPocket()+" in his pocket." );
	}

}
