package test1;

import java.util.ArrayList;

import org.openqa.selenium.*;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class AmazonWeb {
	
	public void amazonWebTest() throws Exception {
		
	CommonFunctions c = new CommonFunctions();
	Locators l = new Locators();
		
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver_83.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.amazon.in");
    Actions actions = new Actions(driver);
    
    WebElement hover_signin = driver.findElement(By.xpath("//div[@id='nav-tools']/a[@id='nav-link-accountList']/div/span"));
    actions.moveToElement(hover_signin);
    WebElement btn_signin = driver.findElement(By.xpath("//div[@id='nav-al-signin']/div/a[@data-nav-role='signin']/span"));
    actions.moveToElement(btn_signin);
    actions.click().build().perform();
    
    driver.findElement(By.xpath(l.txt_Email)).click();
    driver.findElement(By.xpath(l.txt_Email)).sendKeys(l.Email);
    driver.findElement(By.xpath(l.btn_Continue)).click();
    driver.findElement(By.xpath(l.txt_Psw)).sendKeys(l.Psw);
    driver.findElement(By.xpath(l.btn_Signin)).click();
    c.sleep(20); //Manually Entering the OTP and Captcha
    driver.findElement(By.xpath(l.btn_SigninCont)).click();
    driver.findElement(By.xpath(l.txt_Searchbox)).sendKeys(l.Item1);
    driver.findElement(By.xpath(l.btn_SearchGo)).click();
    driver.findElement(By.xpath(l.link_Item1)).click();
    c.sleep(5);
    ArrayList tabs = new ArrayList (driver.getWindowHandles());
    System.out.println(tabs);
    String passcntr = (String) tabs.get(1);
    System.out.println(passcntr);
    driver.switchTo().window(passcntr);
    
    driver.findElement(By.xpath(l.btn_AddToCart)).click();    
    c.sleep(2);
    driver.findElement(By.xpath(l.txt_Searchbox2)).sendKeys(l.Item2);
    c.sleep(2);
    driver.findElement(By.xpath(l.btn_SearchGo2)).click();
    c.sleep(2);
    driver.findElement(By.xpath(l.link_Item2)).click();
    
    ArrayList tabs2 = new ArrayList(driver.getWindowHandles());
    System.out.println(tabs2);
    String passcntr2 = (String) tabs2.get(2);
    System.out.println(passcntr2);
    c.sleep(2);
    driver.switchTo().window(passcntr2);
    driver.findElement(By.xpath(l.btn_AddToCart)).click();
    c.sleep(5);
    Actions actions2 = new Actions(driver);
    WebElement hover_signout = driver.findElement(By.xpath("//*/div[@class='nav-right']/div[@id='nav-tools']/a/div/span[contains(text(),'Hello,')]"));
    actions.moveToElement(hover_signout);
    WebElement btn_signout = driver.findElement(By.xpath("//div[@id='nav-al-your-account']/a[@id='nav-item-signout']/span"));
    actions.moveToElement(btn_signout);
    actions.click().build().perform();
    c.sleep(5);
    driver.quit();	
	}
}