import org.testng.Assert;
import org.testng.annotations.Test;

public class OpeningNewHotelPageTest extends BaseTestStat {

    private String expectedPageHeader = "Register new Hotel";
    private String expectedDataSectionHeader = "Data:";
    private String expectedSaveButtonText = "Save";

    @Test
    public void testRegisterNewHotelPageIsDisplayedWhenUserSelectsArticleNewHotel() {
        String actualPageHeader = newHotelPage.getNewHotelPageHeaderText();
        Assert.assertTrue(actualPageHeader.equals(expectedPageHeader),
                "Error with new hotel page header text");
    }

    @Test
    public void testDataSectionIsDisplayedOnRegisterNewHotel() {
        String actualDataSectionHeader = newHotelPage.getDataSectionHeaderText();
        Assert.assertTrue(actualDataSectionHeader.equals(expectedDataSectionHeader),
                "Error with data section on register new hotel");
    }

    @Test
    public void testSaveButtonIsDisplayedOnRegisterNewHotel() {
        String actualSaveButtonText = newHotelPage.getSaveButtonText();
        Assert.assertTrue(actualSaveButtonText.equals(expectedSaveButtonText),
                "Error with save button on register new hotel");
    }

}
