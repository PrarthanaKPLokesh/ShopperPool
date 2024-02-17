package runner;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genric.base_class;
import pom_classes.Pom_studuent;
import utility.utility_actions;
import utility.utility_select;

public class runner1 extends base_class {
@Test
public void run() throws InterruptedException
{
Pom_studuent p=new  Pom_studuent(driver);
//class.method------>ddt--->ref
p.getUn().sendKeys("API");
Thread.sleep(5000);
p.getdob().click();
WebElement month = p.getmonth();
utility_select.sele_opt(month, 6);
//utility_javascri
WebElement un=p.getUn();
//un
utility_actions.mouseHoverAction(driver, un);
}}
//@Test(dependsOnMethods = "run")
}
