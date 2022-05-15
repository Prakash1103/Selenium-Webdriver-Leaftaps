package week2.day5assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Duplicateleads {

	public static void main(String[] args) {
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
	//click email
	driver.findElement(By.linkText("Email")).click();
	//enter email address
	driver.findElement(By.name("emailAddress")).sendKeys("aadvik@gmail.com");
	//click find leads 
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	//click the lead ID
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[contains(text(),'10257')]")).click();
    //click duplicate lead
	driver.findElement(By.linkText("Duplicate Lead")).click();
    //get title 
	driver.getTitle();
	//click create lead
    driver.findElement(By.className("smallSubmit")).click();
    //verify the lead name
	String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
    System.out.println(text);
    //close tab
    driver.close();
	}

}
