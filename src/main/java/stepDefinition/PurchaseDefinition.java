package stepDefinition;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.CommonFun;

public class PurchaseDefinition {
	public CommonFun commonfun;

	public PurchaseDefinition(CommonFun commonfun) {

		this.commonfun = commonfun;
	}

	WebDriver dr = new ChromeDriver();

	@Given("User enter valid url")
	public void user_enter_valid_url() {
		dr.manage().window().maximize();
		dr.get("https://www.facebook.com/r.php");

	}

	@When("User enter valid username and password")
	public void user_enter_valid_username_and_password() {
		WebElement fe = dr.findElement(By.xpath("//*[contains(text(),'Cookies Policy')]"));
		fe.sendKeys(Keys.ENTER);
		// fe.sendKeys(Keys.ENTER);
		System.out.println(dr.getCurrentUrl());
		dr.getWindowHandle();
	}

	@Then("User navigate into dashboard")
	public void user_navigate_into_dashboard() {
		dr.findElement(By.xpath(
				"//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span"))
				.click();
		Set<String> cw1 = dr.getWindowHandles();
		Iterator<String> it = cw1.iterator();
		String pw = it.next();
		String cw = it.next();
		dr.switchTo().window(cw);
		dr.findElement(By.xpath("//*[contains(text(),'₹34,019.00 with 42 percent savings')]"));
		System.out.println("Text name is : " + dr.getTitle());

	}

	@Then("User gets welcome message")
	public void user_gets_welcome_message() {

	}

}
