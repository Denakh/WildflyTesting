package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Log;

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
        Log.LOG.debug("Moving cursor to article menu");
        new Actions(driver).moveToElement(articleMenu).build().perform();
        return this;
    }

    @Step("Move cursor to new menu")
    public NavigatePage moveCursorToNewMenu() {
        Log.LOG.debug("Moving cursor to new menu");
        new Actions(driver).moveToElement(newMenu).build().perform();
        return this;
    }

    @Step("Click on hotel menu")
    public NavigatePage clickOnHotelMenu() {
        Log.LOG.debug("Clicking on hotel menu");
        hotelMenu.click();
        return this;
    }

}
