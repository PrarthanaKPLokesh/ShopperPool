package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utility_javascript {
	public static void javascipt(WebDriver driver, WebElement ele)
	{
	utility_object.javascript_obj(driver).executeScript("arguments[0].scrollIntoView()",ele);	
	}

}
