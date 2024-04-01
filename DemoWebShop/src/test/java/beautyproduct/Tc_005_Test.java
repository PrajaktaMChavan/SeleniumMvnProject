package beautyproduct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_005_Test {
	@Test
	public  void run() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://ponds.in/");
		driver.quit();
		
	}


}
