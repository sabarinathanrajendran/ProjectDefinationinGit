package tartcosmetic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CartPage {
	
	@Test
	public void  launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R SABRINATHAN\\Desktop\\eclipse-project\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("tartecosmetics.com");
		WebElement nav = driver.findElement(By.className("js-menu-nav--link\""));
		nav.click();
		WebElement selectOne = driver.findElement(By.xpath("(//span[@class=\"product-name-desktop\"])[1]"));
		selectOne.click();
		WebElement add = driver.findElement(By.id("add-to-cart"));
		add.click();
	driver.navigate().back();
	Thread.sleep(2000);
	
	
		
		WebElement selectTwo = driver.findElement(By.xpath("(//span[@class=\"product-name-desktop\"])[3]"));
		selectTwo.click();
		WebElement addOne = driver.findElement(By.id("add-to-cart"));
		addOne.click();
		driver.navigate().back();
		Thread.sleep(2000);

	
	
	
		
		WebElement selectThird = driver.findElement(By.xpath("(//span[@class=\"product-name-desktop\"])[4]"));
		selectThird.click();
		WebElement addTwo = driver.findElement(By.id("add-to-cart"));
		addTwo.click();
		driver.navigate().back();
		Thread.sleep(2000);

		WebElement bag = driver.findElement(By.className("class=\"mini-cart-link\""));
		bag.click();
		WebElement removeItem = driver.findElement(By.id("close-large-icon"));
		removeItem.click();
		
		
		
	}
		

}
	


