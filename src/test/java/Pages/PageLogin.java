package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


//POM - Page Object Model
public class PageLogin {
	
	WebDriver driver;
	
	By txt_username = By.id("name");
	By txt_usernamepassword = By.id("password");
	By btn_login = By.id("login");
	By btn_logoutBy = By.id("logout");
	By btn_save = By.id("save");
	
	
	public PageLogin(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void enterUsername(String username) {
		
		
		driver.findElement(txt_username).sendKeys(username);
		
	}
	
	public void enterPassword(String password) {
		
		
		driver.findElement(txt_usernamepassword).sendKeys(password);
		
	}

	public void clickLogin() {
		
		
		driver.findElement(btn_login).click();
		
	}
	
		public void clickSave() {
		
		
		driver.findElement(btn_save).click();
		
	}
		
		public void navigateToForm() {
			
			WebElement loginFormBtn = driver.findElement(btn_login);
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loginFormBtn);
			
			
		}
	
	
	
	public void clickLogout() {
		
		driver.findElement(btn_logoutBy).click();
	}
	
	public void loginValidUser(String username, String password) {
		
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_usernamepassword).sendKeys(password);
		driver.findElement(btn_login).click();
	}
	
	
}
