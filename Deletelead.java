package week2.day5assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Deletelead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       ChromeDriver driver=new ChromeDriver();
       driver.get("http://leaftaps.com/opentaps/control/main");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       //enter username
       driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
       //enter password 
       driver.findElement(By.id("password")).sendKeys("crmsfa");
       //click login
       driver.findElement(By.className("decorativeSubmit")).click();
       //click CRM/SFA
       driver.findElement(By.linkText("CRM/SFA")).click();
       //click leads 
       driver.findElement(By.linkText("Leads")).click();
       //click find leads 
       driver.findElement(By.linkText("Find Leads")).click();
       //click phone
       driver.findElement(By.linkText("Phone")).click();
       //enter area code 
       driver.findElement(By.name("phoneAreaCode")).sendKeys("044");
       //enter phone number 
       driver.findElement(By.name("phoneNumber")).sendKeys("6282363879");
       //click find leads 
       driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
       //click the lead ID
       driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[contains(text(),'10279')]")).click();
       //click delete 
       driver.findElement(By.linkText("Delete")).click();
       Thread.sleep(4000);
       // click find leads 
       driver.findElement(By.linkText("Find Leads")).click();
       //enter the Lead ID
       driver.findElement(By.name("id")).sendKeys("10243");
       //click find leads 
       driver.findElement(By.linkText("Find Leads")).click();
       Thread.sleep(4000);
       //close tab
       driver.close();
       
       
       
       
	}

}
