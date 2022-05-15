package week2.day5assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createcontact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//usename
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		//click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click contacts
		driver.findElement(By.linkText("Contacts")).click();
		//click create contact
		driver.findElement(By.linkText("Create Contact")).click();
		//enter first name 
		driver.findElement(By.id("firstNameField")).sendKeys("Aadvik");
		//enter last name 
		driver.findElement(By.id("lastNameField")).sendKeys("Ajith");
		//enter first local name
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Aadvik");
		//enter last local name 
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Ajith");
		//enter department 
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Mechanical");
		//enter description
		driver.findElement(By.id("createContactForm_description")).sendKeys("Mechanical department works");
		//enter email ID
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Aadvikajith123@gmail.com");
		// Select drop down -state 
	    WebElement dropdown1 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select d1=new Select(dropdown1);
		d1.selectByVisibleText("New York");
		//click create 
		driver.findElement(By.className("smallSubmit")).click();
		//click edit
		driver.findElement(By.linkText("Edit")).click();
		//update description
		driver.findElement(By.id("updateContactForm_description")).clear();
		//update important note 
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("contact for works");
		//click update 
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		// get title
		System.out.println(driver.getTitle());
		
		
	}

}
