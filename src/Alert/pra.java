package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class pra {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.diver", "C:\\Users\\Bharathi\\eclipse-workspace\\sel\\dr\\chromedriver.exe");
		
		
		 // css selector
		WebDriver p = new ChromeDriver();
		p.get("https://www.facebook.com/");
		
		

		WebElement element = p.findElement(By.cssSelector("input[id=\"email\"]"));
		element.sendKeys("bharathi");
		
		WebElement element2 = p.findElement(By.cssSelector("input[name='pass']"));
		
		element2.sendKeys("9887654262");
		
		
		

		
		// drop down
//		String baseURL = "https://demo.guru99.com/test/newtours/register.php";
//	    WebDriver p = new ChromeDriver();
//		p.get(baseURL);
//
//		Select drpCountry = new Select(p.findElement(By.name("country")));
//		drpCountry.selectByVisibleText("ANTARCTICA");
//
//		//Selecting Items in a Multiple SELECT elements
//		p.get("http://jsbin.com/osebed/2");
//		Select fruits = new Select(p.findElement(By.id("fruits")));
//		fruits.selectByVisibleText("Banana");
//		fruits.selectByIndex(2);
		
		
		
		 // moveto element
//		String baseUrl = "http://www.facebook.com/"; 
//		WebDriver driver = new ChromeDriver();
//
//		driver.get(baseUrl);
//		WebElement txtUsername = driver.findElement(By.id("email"));
//
//		Actions builder = new Actions(driver);
//		Action seriesOfActions = builder.moveToElement(txtUsername).click()
//			.keyDown(txtUsername, Keys.SHIFT)
//			.sendKeys(txtUsername, "hello")
//			.keyUp(txtUsername, Keys.SHIFT)
//			.doubleClick(txtUsername)
//			.contextClick()
//			.build();
//			
//		seriesOfActions.perform() ;
//		
		
		
		
		 // Alert Message handling
//		
//        p.get("https://demo.guru99.com/test/delete_customer.php");			
//                            		
//     	      	
//        p.findElement(By.name("cusid")).sendKeys("53920");					
//        p.findElement(By.name("submit")).submit();			
//        		
//        // Switching to Alert        
//        Alert alert = p.switchTo().alert();	
//		
// 		
//        // Capturing alert message.    
//        String alertMessage= p.switchTo().alert().getText();		
//        		
//		
//        // Displaying alert message		
//        System.out.println(alertMessage);	
//        Thread.sleep(5000);
//        		
//        // Accepting alert		
//        alert.accept();
		
		 
        
		
		
		
		//p.get("https://www.tamilanguide.in/2023/08/18/latest-govt-jobs-2017-2018-182340/");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
    }	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


