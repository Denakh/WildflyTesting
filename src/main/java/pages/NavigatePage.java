package pages;

import io.qameta.allure.Step;
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

    @Step("Move cursor to article menu")
    public NavigatePage moveCursorToArticleMenu() {
        new Actions(driver).moveToElement(articleMenu).build().perform();
        return this;
    }

    @Step("Move cursor to new menu")
    public NavigatePage moveCursorToNewMenu() {
        new Actions(driver).moveToElement(newMenu).build().perform();
        return this;
    }

    @Step("Click on hotel menu")
    public NavigatePage clickOnHotelMenu() {
        hotelMenu.click();
        return this;
    }

}
