package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_studuent {
@FindBy(id = "firstName")
private WebElement un_txt;
@FindBy(id = "dateOfBirthInput")
private WebElement dob;
@FindBy(xpath = "(//select)[1]")
private WebElement month;
public Pom_studuent(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement getUn()
{
	return un_txt;
}
public WebElement getdob()
{
	return dob;
}
public WebElement getmonth()
{
	return month;
}
}
