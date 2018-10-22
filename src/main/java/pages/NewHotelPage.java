package pages;

import io.qameta.allure.Step;
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

    @Step("Get new hotel page header text")
    public String getNewHotelPageHeaderText() {
        return newHotelPageHeader.getText();
    }

    @Step("Get data section header text")
    public String getDataSectionHeaderText() {
        waitingVisibilityOfWebElementByTimeInS(uiPanelTitle, 11);
        return uiPanelTitle.getText();
    }

    @Step("Get save button label text")
    public String getSaveButtonText() {
        return addHotelButtone.getText();
    }

    @Step("Get add hotel name label text")
    public String getAddHotelNameLabelText() {
        return addHotelNameLabel.getText();
    }

    @Step("Get add hotel rating label text")
    public String getAddHotelRatingLabelText() {
        return addHotelRatingLabel.getText();
    }

    @Step("Get add hotel date of construction label text")
    public String getAddHotelDateOfConstructionLabelText() {
        return addHotelDateOfConstructionLabel.getText();
    }

    @Step("Get add hotel country label text")
    public String getAddHotelCountryLabelText() {
        return addHotelCountryLabel.getText();
    }

    @Step("Get add hotel city label text")
    public String getAddHotelCityLabelText() {
        return addHotelCityLabel.getText();
    }

    @Step("Get add hotel short description label text")
    public String getAddHotelShortDescriptionLabelText() {
        return addHotelShortDescriptionLabel.getText();
    }

    @Step("Get add hotel description label text")
    public String getAddHotelDescriptionLabelText() {
        return addHotelDescriptionLabel.getText();
    }

    @Step("Get add hotel notes label text")
    public String getAddHotelNotesLabelText() {
        return addHotelNotesLabel.getText();
    }

    @Step("Get error message detail text")
    public String getMessageErrorDetailText() {
        return messageErrorDetail.getText();
    }

    @Step("Type new hotel name by value: {name}")
    public NewHotelPage typeNewHotelName(String name) {
        waitingVisibilityOfWebElementByTimeInS(addHotelNameInput, 11);
        addHotelNameInput.sendKeys(name);
        return this;
    }

    @Step("Type new hotel date of construction by value: {dateOfConstruction}")
    public NewHotelPage typeNewHotelDateOfConstruction(String dateOfConstruction) {
        dateOfConstructionInput.sendKeys(dateOfConstruction);
        return this;
    }

    @Step("Select new hotel rating by value: {ratingString}")
    public NewHotelPage selectNewHotelRatingStars(String ratingString) {
        int rating = getIntFromString(ratingString);
        waitingVisibilityOfWebElementByTimeInS(ratingStars.get(rating - 1), 11);
        ratingStars.get(rating - 1).click();
        return this;
    }

    @Step("Select new hotel country by value: {country}")
    public NewHotelPage selectNewHotelCountry(String country) {
        countryLabel.click();
        waitingVisibilityOfWebElementByTimeInS(countryList.get(0), 11);
        for (WebElement we : countryList) {
            if (we.getText().equals(country)) {
                we.click();
                break;
            }
        }
        return this;
    }

    @Step("Select new hotel city by value: {city}")
    public NewHotelPage selectNewHotelCity(String city) {
        cityLabel.click();
        waitingVisibilityOfWebElementByTimeInS(cityList.get(0), 11);
        for (WebElement we : cityList) {
            if (we.getText().equals(city)) {
                we.click();
                break;
            }
        }
        return this;
    }

    @Step("Type new hotel short description by value: {shortDescription}")
    public NewHotelPage typeNewHotelShortDescription(String shortDescription) {
        addHotelShortDescriptionInput.sendKeys(shortDescription);
        return this;
    }

    @Step("Type new hotel description by value: {description}")
    public NewHotelPage typeNewHotelDescription(String description) {
        addHotelDescriptionInput.sendKeys(description);
        return this;
    }

    @Step("Type new hotel notes by value: {notes}")
    public NewHotelPage typeNewHotelNotes(String notes) {
        addHotelNotesInput.sendKeys(notes);
        return this;
    }

    @Step("Click save hotel button")
    public NewHotelPage clickSaveHotelButton() {
        addHotelButtone.click();
        return this;
    }

    @Step("Get typed name value")
    public String getTypedNameValue() {
        return addHotelNameInput.getAttribute("value");
    }

    @Step("Get typed date of construction value")
    public String getTypedDateOfConstructionValue() {
        return dateOfConstructionInput.getAttribute("value");
    }

    @Step("Get selected country value")
    public String getSelectedCountryValue() {
        return countryLabel.getText();
    }

    @Step("Get selected city value")
    public String getSelectedCityValue() {
        return cityLabel.getText();
    }

    @Step("Get typed short description value")
    public String getTypedShortDescriptionValue() {
        return addHotelShortDescriptionInput.getAttribute("value");
    }

    @Step("Get typed description value")
    public String getTypedDescriptionValue() {
        return addHotelDescriptionInput.getAttribute("value");
    }

    @Step("Get typed notes value")
    public String getTypedNotesValue() {
        return addHotelNotesInput.getAttribute("value");
    }

    @Step("Fill and send new hotel data")
    public NewHotelPage fillAndSendNewHotelData(Hotel hotel) {
        fillNewHotelData(hotel);
        clickSaveHotelButton();
        return this;
    }

    @Step("Fill new hotel data")
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

    private void waitingVisibilityOfWebElementByTimeInS(WebElement we, int waitingTime) {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        new WebDriverWait(driver, waitingTime).
                until(ExpectedConditions.visibilityOf(we));
        driver.manage().timeouts().implicitlyWait(waitingTime, TimeUnit.SECONDS);
    }

/*
    private void waitingByTimeInMS(long waitingTime) {
        try {
            Thread.sleep(waitingTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
*/
}
