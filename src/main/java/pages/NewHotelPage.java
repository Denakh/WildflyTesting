package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewHotelPage extends NavigatePage {

    @FindBy(tagName = "h2")
    private WebElement newHotelPageHeader;

    @FindBy(css = "span[class='ui-panel-title']")
    private WebElement uiPanelTitle;

    @FindBy(css = "button[id*='add_hotel']")
    private WebElement addHotelButtone;

    public NewHotelPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getNewHotelPageHeaderText() {
        return newHotelPageHeader.getText();
    }

    public String getDataSectionHeaderText() {
        return uiPanelTitle.getText();
    }

    public String getSaveButtonText() {
        return addHotelButtone.getText();
    }

}
