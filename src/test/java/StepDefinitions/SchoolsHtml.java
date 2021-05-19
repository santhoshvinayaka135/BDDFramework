package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import Listeners.ExtentReportListener;
import Pages.PageHomeTitle;
import Utility.Constants;
import Utility.GenericUtility;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SchoolsHtml extends ExtentReportListener {

	WebDriver driver;
	PageHomeTitle page;
	GenericUtility utils;

	@Test
	@Given("check the Firefox browser is open")
	public void check_the_firefox_browser_is_open() throws IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		utils = new GenericUtility(driver);

		ExtentTest logInfo = null;
		try {
			test = extent.createTest(Feature.class, "3schools Feature");
			test = test.createNode(Scenario.class, "Scenario 3schools");
			logInfo = test.createNode(new GherkinKeyword("When"), "navigate to Wikipedia home page");
			logInfo.pass("Navigate to Wikipedia ...");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);

		}

	}

	@Test
	@When("navigate to 3schools home page")
	public void navigate_to_3schools_home_page() throws IOException {

		ExtentTest logInfo = null;
		try {

			logInfo = test.createNode(new GherkinKeyword("When"), "navigate to Wikipedia home page");
			logInfo.pass("Navigate to Wikipedia ...");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
			// logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
		}

		utils.goToUrl(Constants.URL_3SCHOOLS); // navigating to Url

	}

	@Test
	@Then("validate title text")
	public void validate_title_text() {

		ExtentTest logInfo = null;
		try {

			logInfo = test.createNode(new GherkinKeyword("When"), "navigate to Wikipedia home page");
			logInfo.pass("Navigate to Wikipedia ...");

		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);

		}

		page = new PageHomeTitle(driver);
		System.out.println("Getting the title...");
		page.getTitle();
		System.out.println("Validating title......");
		page.validateTitle();

		driver.close();

	}

}
