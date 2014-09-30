	package Banking;

public class Customer {
	private int cashInPocket;
	private String mPassword;
	
	public Customer(int cash,String password){
		cashInPocket = cash;
		mPassword = password;
	}
	
	public int getCashIntPocket(){
		return cashInPocket;
	}
	public int giveCash(int amount){
		cashInPocket -= amount;
		return amount;
	}
	public int takeCash(int amount){
		cashInPocket += amount;
		return amount;
	}
	public String getPassword(){
		return mPassword;
	}
}
