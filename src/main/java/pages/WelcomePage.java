package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage extends NavigatePage {


    public WelcomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
