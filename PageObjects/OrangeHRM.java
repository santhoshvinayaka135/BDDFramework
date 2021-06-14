package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.jayway.jsonpath.JsonPath;

// https://santhoshtest.cloud.testinsights.io/app/#!/module-collection/guid/8ee148ef-d498-4f2b-ac6b-8685e214c56a
@TestModellerModule(guid = "8ee148ef-d498-4f2b-ac6b-8685e214c56a")
public class OrangeHRM extends BasePage
{
	public OrangeHRM (WebDriver driver)
	{
		super(driver);
	}


	
	private By txtUsernameElem = By.xpath("//INPUT[@name='txtUsername']");

	private By txtPasswordElem = By.xpath("//INPUT[@name='txtPassword']");

	private By LOGINElem = By.xpath("//INPUT[@name='Submit']");


	
	public void GoToUrl()
	{
		m_Driver.get("https://opensource-demo.orangehrmlive.com/");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://opensource-demo.orangehrmlive.com/");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://opensource-demo.orangehrmlive.com/");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/";

        if (!currentUrl.equals("https://opensource-demo.orangehrmlive.com/")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter txtUsername
     * @name Enter txtUsername
     */
 	public void Enter_txtUsername(String txtUsername)
 	{
 	    
 		WebElement elem = getWebElement(txtUsernameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_txtUsername", "Enter_txtUsername failed. Unable to locate object: " + txtUsernameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_txtUsername", "Enter_txtUsername failed. Unable to locate object: " + txtUsernameElem.toString());

 			Assert.fail("Unable to locate object: " + txtUsernameElem.toString());
         }

 		elem.sendKeys(txtUsername);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_txtUsername " + txtUsername);

  		TestModellerLogger.PassStep(m_Driver, "Enter_txtUsername " + txtUsername);
 	}

      
	/**
 	 * Enter txtPassword
     * @name Enter txtPassword
     */
 	public void Enter_txtPassword(String txtPassword)
 	{
 	    
 		WebElement elem = getWebElement(txtPasswordElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_txtPassword", "Enter_txtPassword failed. Unable to locate object: " + txtPasswordElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_txtPassword", "Enter_txtPassword failed. Unable to locate object: " + txtPasswordElem.toString());

 			Assert.fail("Unable to locate object: " + txtPasswordElem.toString());
         }

 		elem.sendKeys(txtPassword);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_txtPassword " + txtPassword);

  		TestModellerLogger.PassStep(m_Driver, "Enter_txtPassword " + txtPassword);
 	}

      
	/**
 	 * Click LOGIN
     * @name Click LOGIN
     */
    public void Click_LOGIN()
    {
         
        WebElement elem = getWebElement(LOGINElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_LOGIN", "Click_LOGIN failed. Unable to locate object: " + LOGINElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_LOGIN", "Click_LOGIN failed. Unable to locate object: " + LOGINElem.toString());

            Assert.fail("Unable to locate object: " + LOGINElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_LOGIN");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_LOGIN");
    }}