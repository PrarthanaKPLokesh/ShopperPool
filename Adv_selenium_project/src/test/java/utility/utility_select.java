package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class utility_select {
public static void sele_opt(WebElement ele,Object data)
{
	Select sel = utility_object.Select_object(ele);
	if(data instanceof Integer)
	{
		sel.selectByIndex((Integer)data);
	}
	else if (data instanceof String) {
	try {	
		sel.selectByVisibleText((String)data);
	}
	catch (Exception e) {
	sel.selectByValue((String)data);
	}
	}
}
}
