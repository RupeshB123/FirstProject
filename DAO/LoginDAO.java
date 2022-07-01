package july1st.accScenario.DAO;

import java.util.ArrayList;

import july1st.accScenario.model.Account;
import july1st.accScenario.model.LoginStatus;

public class LoginDAO 
{

	
	private ArrayList<Account> accounts = new ArrayList<>();
	
	
	
	
	public LoginDAO() 
	{

		accounts.add(new Account(1, "A", 10, false, 2, "A@x.com"));
		accounts.add(new Account(3, "A", 10, false, 4, "A@x.com"));
		accounts.add(new Account(5, "A", 10, false, 6, "A@x.com"));
		
	
	}




	public LoginStatus verifyFromDB(int accountNo, int pin) 
	{

		LoginStatus loginStatus = new LoginStatus(-1, "Login Failed");
		
		for (Account account : accounts) 
		{
			
			if(account.getAccountNo() == accountNo && account.getPin()== pin)
			{
				loginStatus.setStatusCode(1);
				loginStatus.setMessage("loginSuccessful");
			}
		}
		return loginStatus;
	}
	

}
