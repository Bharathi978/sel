package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.sun.corba.se.spi.orbutil.fsm.Action;
import com.sun.glass.ui.Robot;
import com.sun.javafx.geom.Edge;


public class table {


	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\sel\\dr\\chromedriver.exe");

		WebDriver p = new  EdgeDriver();

		//p.get("https://www.w3schools.com/html/html_tables.asp");




		//	       WebElement table = p.findElement(By.xpath("//table[@id='customers']"));
		//				List<WebElement> alldate = table.findElements(By.tagName("tr"));			
		//				for (WebElement txt : alldate) {
		//					List<WebElement> alldatta = txt.findElements(By.tagName("td"));
		//					for (WebElement d : alldatta) {
		//						String text = d.getText();
		//						System.out.println(text);
		//					}
		//				}
		//	}
		//		




		//	// 1.all datas get without heading
		//	
		//
		//	WebElement table = p.findElement(By.xpath("//table[@id='customers']"));
		//	List<WebElement> allRow = table.findElements(By.tagName("tr"));
		//	
		//	for (int i = 0; i <allRow.size(); i++) {
		//		WebElement row = allRow.get(i);
		//		List<WebElement> data = row.findElements(By.tagName("td"));
		//	
		//		for (int j = 0; j < data.size(); j++) {
		//			WebElement datas = data.get(j);
		//			System.out.println(datas.getText());
		//		}
		//	}
		//}



		//		// 2.all datas get With heading 
		//		p.get("https://www.w3schools.com/html/html_tables.asp");
		//		WebElement table = p.findElement(By.xpath("//table[@id='customers']"));
		//		List<WebElement> allRow = table.findElements(By.tagName("tr"));
		//		WebElement heads = allRow.get(0);
		//		List<WebElement> allheads = heads.findElements(By.tagName("th"));
		//		for (int i = 0; i < allheads.size(); i++) {
		//			WebElement headd = allheads.get(i);
		//			System.out.println(headd.getText());
		//		}
		//		
		//		for (int i = 0; i <allRow.size(); i++) {
		//			WebElement row = allRow.get(i);
		//			List<WebElement> data = row.findElements(By.tagName("td"));
		//		
		//			for (int j = 0; j < data.size(); j++) {
		//				WebElement datas = data.get(j);
		//				System.out.println(datas.getText());
		//			}
		//		}
		//	}
		//		












		//	// 3.get the only heading print in console

		//	p.get("https://www.w3schools.com/html/html_tables.asp");
		//	WebElement table = p.findElement(By.xpath("//table[@id='customers']"));
		//	List<WebElement> allRow = table.findElements(By.tagName("tr"));
		//	WebElement row = allRow.get(2);
		//	List<WebElement> heads = row.findElements(By.tagName("td"));
		//	for (int i = 0; i < heads.size(); i++) {
		//		WebElement heading = heads.get(i);
		//		String text = heading.getText();
		//		System.out.println(text);
		//		
		//	}}}
		//	










		//4.To Print last row and Last cell (data)

		//	p.get("https://www.w3schools.com/html/html_tables.asp");
		//	WebElement table = p.findElement(By.xpath("//table[@id='customers']"));
		//	List<WebElement> allRow = table.findElements(By.tagName("tr"));
		//	WebElement lastrow = allRow.get(allRow.size()-5);
		//	List<WebElement> data = lastrow.findElements(By.tagName("td"));
		//	WebElement lastdata = data.get(data.size()-3);
		//	System.out.println(lastdata.getText());
		//	
		//	




		// 5.To Print middle row and middle (data)

		//	p.get("https://www.w3schools.com/html/html_tables.asp");
		//	WebElement table = p.findElement(By.xpath("//table[@id='customers']"));
		//	List<WebElement> allRow = table.findElements(By.tagName("tr"));
		//	WebElement midrow = allRow.get(allRow.size()/2);
		//    List<WebElement> middata = midrow.findElements(By.tagName("td"));
		//    WebElement data = middata.get(middata.size()/2);
		//    System.out.println(data.getText());
		//}}





		p.get("https://www.airindia.com/");

		WebElement element = p.findElement(By.xpath("(//span[@class=\"mat-radio-label-content\"])[1]"));

		element.click();


		WebElement first = p.findElement(By.xpath("(//input[@class=\"form-control px-0\"])[1]"));

		first.click();
		WebElement element2 = p.findElement(By.xpath("(//input[@id=\"From\"])[2]"));

        element2.sendKeys("chennai");












	}

}









