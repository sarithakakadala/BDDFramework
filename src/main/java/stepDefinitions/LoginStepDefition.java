package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefition {
	WebDriver driver;
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {
		WebDriverManager.chromedriver().setup();
		 
        //Create driver object for Chrome
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
		String title = driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", title);
	}

	//@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	//public void user_enters_and
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials){
		 try {
				Thread.sleep(3000);
				List<List<String>> data = credentials.raw();
				Actions a=new Actions(driver);
				 WebElement signin=driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"));
				 a.moveToElement(signin).build().perform();
				 signin.click();
				 driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
				 Thread.sleep(3000);
				 driver.findElement(By.id("continue")).click();
				 driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()  {
		WebElement loginBtn =driver.findElement(By.id("signInSubmit"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", loginBtn);
		
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page()  {
		try {
			Thread.sleep(3000);
			String title = driver.getTitle();
			 System.out.println("Home Page title ::"+ title);
			 Assert.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", title);
			 driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 
	}

}
