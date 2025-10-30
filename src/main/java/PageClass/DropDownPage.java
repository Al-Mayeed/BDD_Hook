package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {
    WebDriver driver;

    public DropDownPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "dropdown")
    WebElement dropDown;

    public void clickOnDropdown(){
        dropDown.click();
    }

    public void selectOptions() {
        WebElement staticDropdown = dropDown;
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByVisibleText("Option 2");

    }


}
