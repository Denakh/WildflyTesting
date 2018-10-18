package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigatePage {

    protected WebDriver driver;

    @FindBy(xpath = "//span[text()='Article']")
    protected WebElement articleMenu;

    @FindBy(xpath = "//span[text()='New']")
    protected WebElement newMenu;

    @FindBy(xpath = "//span[text()='Hotel']")
    protected WebElement hotelMenu;

    public NavigatePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void moveCursorToArticleMenu() {
        new Actions(driver).moveToElement(articleMenu).build().perform();
    }

    public void moveCursorToNewMenu() {
        new Actions(driver).moveToElement(newMenu).build().perform();
    }

    public void clickOnHotelMenu() {
        hotelMenu.click();
    }

}
