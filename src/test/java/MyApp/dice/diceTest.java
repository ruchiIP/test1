package MyApp.dice;

import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class diceTest {

	@Test
	public void test1(){
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
        Assert.assertTrue(2>1);	
	
	}
}
