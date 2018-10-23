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
import utils.Log;

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
        Log.LOG.debug("Getting new hotel page header text");
        return newHotelPageHeader.getText();
    }

    @Step("Get data section header text")
    public String getDataSectionHeaderText() {
        Log.LOG.debug("Getting data section header text");
        waitingVisibilityOfWebElementByTimeInS(uiPanelTitle, 5);
        return uiPanelTitle.getText();
    }

    @Step("Get save button label text")
    public String getSaveButtonText() {
        Log.LOG.debug("Getting save button label text");
        return addHotelButtone.getText();
    }

    @Step("Get add hotel name label text")
    public String getAddHotelNameLabelText() {
        Log.LOG.debug("Getting add hotel name label text");
        return addHotelNameLabel.getText();
    }

    @Step("Get add hotel rating label text")
    public String getAddHotelRatingLabelText() {
        Log.LOG.debug("Getting add hotel rating label text");
        return addHotelRatingLabel.getText();
    }

    @Step("Get add hotel date of construction label text")
    public String getAddHotelDateOfConstructionLabelText() {
        Log.LOG.debug("Getting add hotel date of construction label text");
        return addHotelDateOfConstructionLabel.getText();
    }

    @Step("Get add hotel country label text")
    public String getAddHotelCountryLabelText() {
        Log.LOG.debug("Getting add hotel country label text");
        return addHotelCountryLabel.getText();
    }

    @Step("Get add hotel city label text")
    public String getAddHotelCityLabelText() {
        Log.LOG.debug("Getting add hotel city label text");
        return addHotelCityLabel.getText();
    }

    @Step("Get add hotel short description label text")
    public String getAddHotelShortDescriptionLabelText() {
        Log.LOG.debug("Getting add hotel short description label text");
        return addHotelShortDescriptionLabel.getText();
    }

    @Step("Get add hotel description label text")
    public String getAddHotelDescriptionLabelText() {
        Log.LOG.debug("Getting add hotel description label text");
        return addHotelDescriptionLabel.getText();
    }

    @Step("Get add hotel notes label text")
    public String getAddHotelNotesLabelText() {
        Log.LOG.debug("Getting add hotel notes label text");
        return addHotelNotesLabel.getText();
    }

    @Step("Get error message detail text")
    public String getMessageErrorDetailText() {
        Log.LOG.debug("Getting error message detail text");
        return messageErrorDetail.getText();
    }

    @Step("Type new hotel name by value: {name}")
    public NewHotelPage typeNewHotelName(String name) {
        waitingVisibilityOfWebElementByTimeInS(addHotelNameInput, 5);
        Log.LOG.debug("Typing new hotel name by value: " + name);
        addHotelNameInput.sendKeys(name);
        return this;
    }

    @Step("Type new hotel date of construction by value: {dateOfConstruction}")
    public NewHotelPage typeNewHotelDateOfConstruction(String dateOfConstruction) {
        Log.LOG.debug("Typing new hotel date of construction by value: " + dateOfConstruction);
        dateOfConstructionInput.sendKeys(dateOfConstruction);
        return this;
    }

    @Step("Select new hotel rating by value: {ratingString}")
    public NewHotelPage selectNewHotelRatingStars(String ratingString) {
        int rating = getIntFromString(ratingString);
        waitingVisibilityOfWebElementByTimeInS(ratingStars.get(rating - 1), 5);
        Log.LOG.debug("Selecting new hotel rating by value: " + ratingString);
        ratingStars.get(rating - 1).click();
        return this;
    }

    @Step("Select new hotel country by value: {country}")
    public NewHotelPage selectNewHotelCountry(String country) {
        Log.LOG.debug("Selecting new hotel country by value: " + country);
        countryLabel.click();
        waitingVisibilityOfWebElementByTimeInS(countryList.get(0), 5);
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
        Log.LOG.debug("Selecting new hotel city by value: " + city);
        waitingClickAbilityOfWebElementByTimeInS(cityLabel, 5);
        cityLabel.click();
        waitingVisibilityOfWebElementByTimeInS(cityList.get(0), 5);
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
        Log.LOG.debug("Typing new hotel short description by value: " + shortDescription);
        addHotelShortDescriptionInput.sendKeys(shortDescription);
        return this;
    }

    @Step("Type new hotel description by value: {description}")
    public NewHotelPage typeNewHotelDescription(String description) {
        Log.LOG.debug("Typing new hotel description by value: " + description);
        addHotelDescriptionInput.sendKeys(description);
        return this;
    }

    @Step("Type new hotel notes by value: {notes}")
    public NewHotelPage typeNewHotelNotes(String notes) {
        Log.LOG.debug("Typing new hotel notes by value: " + notes);
        addHotelNotesInput.sendKeys(notes);
        return this;
    }

    @Step("Click save hotel button")
    public NewHotelPage clickSaveHotelButton() {
        Log.LOG.debug("Clicking save hotel button");
        waitingClickAbilityOfWebElementByTimeInS(addHotelButtone, 5);
        addHotelButtone.click();
        return this;
    }

    @Step("Get typed name value")
    public String getTypedNameValue() {
        Log.LOG.debug("Getting typed name value");
        return addHotelNameInput.getAttribute("value");
    }

    @Step("Get typed date of construction value")
    public String getTypedDateOfConstructionValue() {
        Log.LOG.debug("Getting typed date of construction value");
        return dateOfConstructionInput.getAttribute("value");
    }

    @Step("Get selected country value")
    public String getSelectedCountryValue() {
        Log.LOG.debug("Getting selected country value");
        return countryLabel.getText();
    }

    @Step("Get selected city value")
    public String getSelectedCityValue() {
        Log.LOG.debug("Getting selected city value");
        return cityLabel.getText();
    }

    @Step("Get typed short description value")
    public String getTypedShortDescriptionValue() {
        Log.LOG.debug("Getting typed short description value");
        return addHotelShortDescriptionInput.getAttribute("value");
    }

    @Step("Get typed description value")
    public String getTypedDescriptionValue() {
        Log.LOG.debug("Getting typed description value");
        return addHotelDescriptionInput.getAttribute("value");
    }

    @Step("Get typed notes value")
    public String getTypedNotesValue() {
        Log.LOG.debug("Getting typed notes value");
        return addHotelNotesInput.getAttribute("value");
    }

    @Step("Fill and send new hotel data")
    public NewHotelPage fillAndSendNewHotelData(Hotel hotel) {
        Log.LOG.debug("Filling and sending new hotel data");
        fillNewHotelData(hotel);
        clickSaveHotelButton();
        return this;
    }

    @Step("Fill new hotel data")
    public NewHotelPage fillNewHotelData(Hotel hotel) {
        Log.LOG.debug("Filling new hotel data");
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
        Log.LOG.debug("Getting int number from string by value: " + string);
        int amount = 0;
        try {
            amount = Integer.parseInt(string);
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
        return amount;
    }

    private void waitingVisibilityOfWebElementByTimeInS(WebElement we, int waitingTime) {
        Log.LOG.debug("Waiting visibility of web element '" + we + "' by time in sec.: " + waitingTime);
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        new WebDriverWait(driver, waitingTime).
                until(ExpectedConditions.visibilityOf(we));
        driver.manage().timeouts().implicitlyWait(waitingTime, TimeUnit.SECONDS);
    }

    private void waitingClickAbilityOfWebElementByTimeInS(WebElement we, int waitingTime) {
        Log.LOG.debug("Waiting click ability of web element '" + we + "' by time in sec.: " + waitingTime);
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        new WebDriverWait(driver, waitingTime).
                until(ExpectedConditions.elementToBeClickable(we));
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
