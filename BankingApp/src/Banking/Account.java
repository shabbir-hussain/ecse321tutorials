package Banking;

public class Account {
	private int mCash;
	private String mPassword;
	
	public Account(int initCash, String newPassword){
		mCash = initCash;
		mPassword = newPassword;
	}
	
	public boolean Deposit(Customer c,int amount){
		if(c.getPassword().equals(mPassword)){
			mCash += c.giveCash(amount);
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean Withdraw(Customer c, int amount){
		if(c.getPassword().equals(mPassword)){
			//This is clearly a mistake write a test to catch this error
			mCash -= c.giveCash(amount);
			return true;
		}
		else{
			return false;
		}
	}
}
