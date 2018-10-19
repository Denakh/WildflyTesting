import org.testng.Assert;
import org.testng.annotations.Test;

public class EditingNewHotelNameFieldTest extends BaseTest {

    private String expectedAddHotelNameLabelText = "Name:";


    private String expectedDataSectionHeader = "Data:";
    private String expectedSaveButtonText = "Save";

    @Test
    public void testNameFieldIsDisplayedInDataSectionOfRegisterNewHotelPage() {
        String actualAddHotelNameLabelText = newHotelPage.getAddHotelNameLabelText();
        Assert.assertTrue(actualAddHotelNameLabelText.equals(expectedAddHotelNameLabelText),
                "Error with name field displaying in Data section of Register new Hotel page");
    }



/*
1.	Verify that Name field is displayed in Data section of Register new Hotel page
2.	Verify that Name field is marked with asterisk
3.	Verify that Name field is editable
4.	Verify that Name field allows to input alphanumeric characters
5.	Verify that it is not possible to save the empty Name field and a meaningful error message is displayed
6.	Verify that it is possible to save the valid name field
*/


}
