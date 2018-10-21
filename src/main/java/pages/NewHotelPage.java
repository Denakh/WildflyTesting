package pages;

import model.Hotel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

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

    @FindBys(@FindBy(css = "div[class='ui-rating-star']"))
    private List<WebElement> ratingStars;

    @FindBy(css = "label[for='add_hotel:rate']")
    private WebElement addHotelRatingLabel;


    @FindBy(css = "input[id='add_hotel:dateOfConstruction_input']")
    private WebElement dateOfConstructionInput;

    @FindBy(css = "label[for='add_hotel:dateOfConstruction_input']")
    private WebElement addHotelDateOfConstructionLabel;


    @FindBy(css = "label[id='add_hotel:country_label']")
    private WebElement countryLabel;

    @FindBys(@FindBy(xpath = "//div[@id='add_hotel:country_panel']//li"))
    private List<WebElement> countryList;

    @FindBy(css = "label[for='add_hotel:country_input']")
    private WebElement addHotelCountryLabel;


    @FindBy(css = "label[id='add_hotel:city_label']")
    private WebElement cityLabel;

    @FindBys(@FindBy(xpath = "//div[@id='add_hotel:city_panel']//li"))
    private List<WebElement> cityList;

    @FindBy(css = "label[for='add_hotel:city_input']")
    private WebElement addHotelCityLabel;


    @FindBy(css = "input[id='add_hotel:short_description']")
    private WebElement addHotelShortDescriptionInput;

    @FindBy(css = "label[for='add_hotel:short_description']")
    private WebElement addHotelShortDescriptionLabel;


    @FindBy(css = "textarea[id='add_hotel:description']")
    private WebElement addHotelDescriptionInput;

    @FindBy(css = "label[for='add_hotel:description']")
    private WebElement addHotelDescriptionLabel;


    @FindBy(css = "textarea[id='add_hotel:notes']")
    private WebElement addHotelNotesInput;

    @FindBy(css = "label[for='add_hotel:notes']")
    private WebElement addHotelNotesLabel;


    public NewHotelPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        driver.navigate().refresh();
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

    public String getAddHotelRatingLabelText() {
        return addHotelRatingLabel.getText();
    }

    public String getAddHotelDateOfConstructionLabelText() {
        return addHotelDateOfConstructionLabel.getText();
    }

    public String getAddHotelCountryLabelText() {
        return addHotelCountryLabel.getText();
    }

    public String getAddHotelCityLabelText() {
        return addHotelCityLabel.getText();
    }

    public String getAddHotelShortDescriptionLabelText() {
        return addHotelShortDescriptionLabel.getText();
    }

    public String getAddHotelDescriptionLabelText() {
        return addHotelDescriptionLabel.getText();
    }

    public String getAddHotelNotesLabelText() {
        return addHotelNotesLabel.getText();
    }


    public String getAddHotelNameLabelSpanText() {
        return addHotelNameLabelSpan.getText();
    }

    public String getMessageErrorDetailText() {
        return messageErrorDetail.getText();
    }

    public NewHotelPage typeNewHotelName(String name) {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        new WebDriverWait(driver, 11).
                until(ExpectedConditions.visibilityOf(addHotelNameInput));
        addHotelNameInput.sendKeys(name);
        driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
        return this;
    }

    public NewHotelPage typeNewHotelDateOfConstruction(String dateOfConstruction) {
        dateOfConstructionInput.sendKeys(dateOfConstruction);
        return this;
    }

    public NewHotelPage selectNewHotelRatingStars(String ratingString) {
        waitingByTimeInMS(1000);
        int rating = getIntFromString(ratingString);
        ratingStars.get(rating - 1).click();
        return this;
    }

    public NewHotelPage selectNewHotelCountry(String country) {
        countryLabel.click();
        for (WebElement we : countryList) {
            if (we.getText().equals(country)) {
                we.click();
                break;
            }
        }
        return this;
    }

    public NewHotelPage selectNewHotelCity(String city) {
        cityLabel.click();
        for (WebElement we : cityList) {
            if (we.getText().equals(city)) {
                we.click();
                break;
            }
        }
        return this;
    }

    public NewHotelPage typeNewHotelShortDescription(String shortDescription) {
        addHotelShortDescriptionInput.sendKeys(shortDescription);
        return this;
    }

    public NewHotelPage typeNewHotelDescription(String description) {
        addHotelDescriptionInput.sendKeys(description);
        return this;
    }

    public NewHotelPage typeNewHotelNotes(String notes) {
        addHotelNotesInput.sendKeys(notes);
        return this;
    }

    public NewHotelPage clickSaveHotelButton() {
        addHotelButtone.click();
        return this;
    }

    public String getTypedNameValue() {
        return addHotelNameInput.getAttribute("value");
    }

    public String getTypedDateOfConstructionValue() {
        return dateOfConstructionInput.getAttribute("value");
    }

    public String getSelectedCountryValue() {
        return countryLabel.getText();
    }

    public String getSelectedCityValue() {
        return cityLabel.getText();
    }

    public String getTypedShortDescriptionValue() {
        return addHotelShortDescriptionInput.getAttribute("value");
    }

    public String getTypedDescriptionValue() {
        return addHotelDescriptionInput.getAttribute("value");
    }

    public String getTypedNotesValue() {
        return addHotelNotesInput.getAttribute("value");
    }

    public NewHotelPage fillAndSendNewHotelData(Hotel hotel) {
        fillNewHotelData(hotel);
        clickSaveHotelButton();
        return this;
    }

    public NewHotelPage fillNewHotelData(Hotel hotel) {
        typeNewHotelName(hotel.getName());
        typeNewHotelDateOfConstruction(hotel.getDateOfConstruction());
        selectNewHotelCountry(hotel.getCountry());
        typeNewHotelShortDescription(hotel.getShortDescription());
        typeNewHotelDescription(hotel.getDescription());
        typeNewHotelNotes(hotel.getNotes());
        selectNewHotelCity(hotel.getCity());
        selectNewHotelRatingStars(hotel.getGlobalRating());
        return this;
    }

    private int getIntFromString(String string) {
        int amount = 0;
        try {
            amount = Integer.parseInt(string);
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
        return amount;
    }

    private void waitingByTimeInMS(long waitingTime) {
        try {
            Thread.sleep(waitingTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
