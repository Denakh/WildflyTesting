package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utils.Log;

import java.util.List;

public class HotelListPage extends NavigatePage {

    @FindBy(tagName = "h2")
    private WebElement hotelListPageHeader;

    @FindBys(@FindBy(xpath = "//tbody[@id='j_idt40:hotels_data']/tr"))
    private List<WebElement> hotelsList;

    @FindBys(@FindBy(xpath = "//tbody[@id='j_idt40:hotels_data']//td"))
    private List<WebElement> hotelsMainDataList;

    public HotelListPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("Get hotel list page header text")
    public String getHotelListPageHeaderText() {
        Log.LOG.debug("Getting hotel list page header text");
        return hotelListPageHeader.getText();
    }

    /*
    public String getLastAddedHotelName() {
        return hotelsMainDataList.get((hotelsList.size() - 1) * 6).getText();
    }
    */

}
