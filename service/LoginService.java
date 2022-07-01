package july1st.accScenario.service;

import july1st.accScenario.DAO.LoginDAO;
import july1st.accScenario.model.LoginStatus;

public class LoginService 
{
	
	private LoginDAO loginDAO = new LoginDAO();

	public LoginStatus verifyUser(int accountNo, int pin) 
	{
		return loginDAO.verifyFromDB(accountNo, pin);
	}
	

	
	
	

}
