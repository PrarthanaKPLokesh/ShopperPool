package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utility_actions {
public static void mouseHoverAction(WebDriver driver,WebElement ele)
{
	utility_object.Actions_object(driver).moveToElement(ele).perform();
}
}
