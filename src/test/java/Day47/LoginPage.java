package Day47;


/*
 Page Object model
-----------------

Test case
----
locators
test methods ----code---validations+Actions

2 approaches to create page object classes
---------------------------
1) without using PageFactory
2) using PageFactory
---------------------------

WebElement usertxt=driver.findElement(By.xpath("//input[@placeholder='Username']"));

By loc=By.xpath("//input[@placeholder='Username']");
driver.findElement(loc).sendKeys("xyz");
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;

    //constructor
    LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //Locators
    By txt_username_loc = By.xpath("//input[@placeholder='Username']");
    By txt_password_loc = By.xpath("//input[@placeholder='Password']");
    By btn_login_loc    = By.xpath("//button[normalize-space()='Login']");

    //Action methods
    
    public void setUserName(String user)
    {
        driver.findElement(txt_username_loc).sendKeys(user);
    }

    public void setPassword(String pwd)
    {
        driver.findElement(txt_password_loc).sendKeys(pwd);
    }

    public void clickLogin()
    {
        driver.findElement(btn_login_loc);
    }
}
