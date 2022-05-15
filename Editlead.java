package week2.day5assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editlead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter user name
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		//click crmsfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click leads 
		driver.findElement(By.linkText("Leads")).click();
		//click find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//enter first name
		driver.findElement(By.xpath("//div[@id='x-form-el-ext-gen248']//input")).sendKeys("Aadvik");
		//click find leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//click the lead ID
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[contains(text(),'10257')]")).click();
		//get title
		System.out.println(driver.getTitle());
		//click edit
		driver.findElement(By.linkText("Edit")).click();
		//clear company name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		//enter company name/update 
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("tech");
		//click update
		driver.findElement(By.className("smallSubmit")).click();
		//verify the change of company name
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		//close tab
		driver.close();
		
		
		

	}

}
