package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BasePage
{
    @FindBy(css="[name='Let1']")
    public WebElement num1;

    @FindBy(css="[name='Let2']")
    public WebElement num2;

    @FindBy(css="[value='View Plate']")
    public WebElement viewPlate;

    @FindBy(xpath="/html/body/table/tbody/tr/td/table[1]/tbody/tr[1]/td[1]/font")
    public WebElement viewplt;

    public BasePage() {
        //this method requires to provide webdriver object for @FindBy
        //and page class
        //this means this page class
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
