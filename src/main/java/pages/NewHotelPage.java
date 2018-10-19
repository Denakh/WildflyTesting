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

    @FindBy(css = "label[for='add_hotel:name']")
    private WebElement addHotelNameLabel;

    @FindBy(xpath = "//label[@for='add_hotel:name']/span")
    private WebElement addHotelNameLabelSpan;

    @FindBy(css = "input[id='add_hotel:name']")
    private WebElement addHotelNameInput;

    @FindBy(css = "span[class='ui-message-error-detail']")
    private WebElement messageErrorDetail;




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

    public String getAddHotelNameLabelText() {
        return addHotelNameLabel.getText();
    }

    public String getAddHotelNameLabelSpanText() {
        return addHotelNameLabelSpan.getText();
    }

    public String getMessageErrorDetailText() {
        return messageErrorDetail.getText();
    }

}
