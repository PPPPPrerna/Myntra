package stepdefination;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objects.Base;


@CucumberOptions
public class LoginPage extends Base {
	
	WebDriver driver;

	
	
	Actions a1 ;
	
	
	
	@Given("^User should be able to Login the Myntra Application$")
    public void user_should_be_able_to_login_the_myntra_application() throws Throwable {
		
		this.driver=initialize();
		
		driver.get(prop.getProperty("url"));
        
    }
	
	
    @When("^User clicks on the Women button$")
    public void user_clicks_on_the_women_button() throws Throwable {
      
		a1=new Actions(driver);
		
		a1.moveToElement(driver.findElement(By.xpath("//*[@id='desktop-header-cnt']/div[2]/nav/div/div[2]/div/a"))).build().perform();
    	
    }
	
    @When("^User clicks on Dresses under Western Dresses$")
    public void user_clicks_on_dresses_under_western_dresses() throws Throwable {
        
		driver.findElement(By.xpath("//a[text()='Jumpsuits']")).click();
		
    }

	
    @Then("^User should be able to view the link$")
    public void user_should_be_able_to_view_the_link() throws Throwable {
        
		System.out.println("passed");
    }

	
    @Then("^User should be able to navigate to list of Dresses$")
    public void user_should_be_able_to_navigate_to_list_of_dresses() throws Throwable {
       
    	System.out.println("cool");
    	
    }

    @When("^Validate that user is able to move on the image$")
    public void validate_that_user_is_able_to_move_on_the_image() throws Throwable {
        
    	driver.findElement(By.xpath("//*[@id='desktopSearchResults']/div[2]/section/ul/li[1]/a")).click();
 
    
    }
    
    @When("^Validate that user is able to view the Amount$")
    public void validate_that_user_is_able_to_view_the_amount() throws Throwable {
        
    	Set<String> s1=driver.getWindowHandles();
    	
    	Iterator<String> it=s1.iterator();
    	
    	String a=it.next();
    	String b=it.next();
    	
    	driver.switchTo().window(b);
    	
    	String x=driver.findElement(By.xpath("//*[@id='mountRoot']/div/div/div/main/div[2]/div[2]/div[1]/p[1]/span[1]/strong")).getText();
    	
    	System.out.println(x);
    }

    @Then("^User should be able to view the correct Amount$")
    public void user_should_be_able_to_view_the_correct_amount() throws Throwable {
        System.out.println("yeah");
    }

    @Then("^User should be able to see the wishlist option$")
    public void user_should_be_able_to_see_the_wishlist_option() throws Throwable {
       
    	System.out.println("passed");
    	
    }
    
    @When("^Validate that user should be able to click on the size$")
    public void validate_that_user_should_be_able_to_click_on_the_size() throws Throwable {
       
    	driver.findElement(By.xpath("//*[@id='sizeButtonsContainer']/div[2]/div[3]/div[1]/button")).click();
    }

    @Then("^User should be able to view the selected size$")
    public void user_should_be_able_to_view_the_selected_size() throws Throwable {
        
    	System.out.println("Passed");
    	
    	
    }
    
    
    @When("^Validate that user should be able to click on the ADD TO CART BUTTON$")
    public void validate_that_user_should_be_able_to_click_on_the_add_to_cart_button() throws Throwable {
        
    	driver.findElement(By.xpath("//*[@id='mountRoot']/div/div/div/main/div[2]/div[2]/div[3]/div/div[1]")).click();
    	
    }

    @Then("^User should be able to click on the ADD TO CART BUTTON$")
    public void user_should_be_able_to_click_on_the_add_to_cart_button() throws Throwable {
      
    	System.out.println("passed");
    	
    }

    @When("^Validate that user should be able to click on the Bag tag$")
    public void validate_that_user_should_be_able_to_click_on_the_bag_tag() throws Throwable {
       
    	driver.findElement(By.xpath("//*[@id='desktop-header-cnt']/div[2]/div[2]/a[2]/span[1]")).click();
    	
    }

    @Then("^User should be able to click on the Bag Tag$")
    public void user_should_be_able_to_click_on_the_bag_tag() throws Throwable {
        
    	System.out.println("Element clicked");
    	
    }

	
	
	}
