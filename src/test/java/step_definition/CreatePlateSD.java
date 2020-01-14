package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import page.BasePage;
import utilities.BrowserFactory;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class CreatePlateSD extends BasePage
{
    BasePage basePage=new BasePage();
    String chars="ABCDEFGHIKLMN0QPRSTVXYZ";
    String charss="VXYZ123456789";
    String charsss="nmks";

    @Then("createPlate")
    public void createplate()
    {
        BrowserUtils.wait(2);

        Driver.getDriver().switchTo().frame("s2end");


        for (int i = 0; i < chars.length(); i++)
        {


            for (int j = 0; j < chars.length(); j++)
            {

                basePage.num1.clear();
                basePage.num1.sendKeys(chars.charAt(i) + "");
                basePage.num2.clear();
                basePage.num2.sendKeys(chars.charAt(j) + "");

                basePage.viewPlate.click();
               //BrowserUtils.waitForVisibility(basePage.viewplt,5);
                //BrowserUtils.waitForPageToLoad(5);
              BrowserUtils.wait(5);
                //BrowserUtils.waitForVisibility(basePage.imag,5);
                if (basePage.viewplt.getText().contains("Congratulations"))
                {
                    System.out.println(chars.charAt(i)+" "+ chars.charAt(j));
                }
                //basePage.clearForm.click();
            }

           // BrowserUtils.wait(2);
        }

    }

    @Given("We are on the licencePlate page")
    public void weAreOnTheLicencePlatePage()
    {
        System.out.println("Licence Plate Page");
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
}
