package july1st.accScenario.controller;

import org.common.util.GUI;

import july1st.accScenario.model.LoginStatus;
import july1st.accScenario.service.LoginService;

public class AccPresentation 
{

	
	private LoginService loginService = new LoginService();
	
	public void start() 
	{

		System.out.println("start method of AccPresentation");
		
		String options = "\n 1. Login  \n 0. Exit" ;
		
		int choice = -1;
		
		
		do {
			choice = GUI.acceptNumber(options);
			if (choice == 1)
				loginScenario();
		} while (choice != 0);
		
	}

	private void loginScenario() 
	{
		int accountNo =GUI.acceptNumber("accountNo");
		int pin = GUI.acceptNumber("pin");
		
		LoginStatus loginStatus = loginService.verifyUser(accountNo, pin);
		
		if(loginStatus.getStatusCode() == -1   )
		{
GUI.display("Login Failed");		
}
		
		else
		{
			GUI.display("Login succedded");		
		}
		
		
	}
	

}
