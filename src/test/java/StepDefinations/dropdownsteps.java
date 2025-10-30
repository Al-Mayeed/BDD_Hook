package StepDefinations;

import PageClass.DropDownPage;
import PageClass.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class dropdownsteps {
    HomePage homePage;
    DropDownPage dropDownPage;
    WebDriver driver = Hooks.driver;

    @Given("I lunch the browser")
    public void i_lunch_the_browser() {
        homePage=new HomePage(driver);
        dropDownPage=new DropDownPage(driver);
        driver.get("https://the-internet.herokuapp.com/");

    }
    @When("I click on DropdownLink")
    public void i_click_on_dropdown_link() {
        homePage.clickDropDownLink();

    }
    @When("I  click on the dropdown bar")
    public void i_click_on_the_dropdown_bar() {
        dropDownPage.clickOnDropdown();

    }
    @When("I Select Option_2")
    public void i_select_option() {
        dropDownPage.selectOptions();

    }
    @Then("Option_2 has  selected")
    public void option_has_selected() {
        Assert.assertTrue(driver.findElement(By.cssSelector("option[value='2']")).isSelected());

    }
}
