package july1st.accScenario.model;

public class Account 
{
	private int accountNo;
	private String accountHolderName;
	private int balance;
	private boolean blocked;
	private int pin;
	private String email;
	
	
	
	public Account(int accountNo, String accountHolderName, int balance, boolean blocked, int pin, String email) {
		super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.blocked = blocked;
		this.pin = pin;
		this.email = email;
	}
	

	public Account(int accountNo, String accountHolderName, boolean blocked, int balance) {
		super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.blocked = blocked;
		this.balance = balance;
	}


	public int getAccountNo() {
		return accountNo;
	}


	public int getPin() {
		return pin;
	}


	public void setPin(int pin) {
		this.pin = pin;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
	
	
	
}
