package practicehctl;

import org.testng.annotations.Test;
import HctlPageObject.BasePage;
import HctlPageObject.Logout;

public class Test_Logout extends BasePage {
	
	
	
	
    @Test
    public void validLogout() {
        Logout logout = new Logout(driver);
        logout.Profileclick();
    }
}