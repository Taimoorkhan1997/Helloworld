package HctlPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage {
		
	
//		private WebDriver driver;
		private By usernameField = By.cssSelector("#__next > div > div > main > div > div > div > form > span.w-100.h-16.flex.flex-col.items-center.relative.mb-1 > div > input");
	    private By passwordField = By.xpath("//*[@id=\"__next\"]/div/div/main/div/div/div/form/span[2]/div/input");
	    private By loginButton = By.xpath("//*[@id=\"__next\"]/div/div/main/div/div/div/form/span[3]/button");

	    public LoginPage(WebDriver driver) {
	       this.driver=driver;
	    }

	    public void setUsername(String username) {
	    	driver.findElement(usernameField).sendKeys(username);
	    }

	    public void setPassword(String password) {
	    	driver.findElement(passwordField).sendKeys(password);
	    }

	    public void clickLogin() {
	    	driver.findElement(loginButton).click();
	    }
	
	
	
}
