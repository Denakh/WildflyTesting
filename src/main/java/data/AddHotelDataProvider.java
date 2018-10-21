package data;

import org.testng.annotations.DataProvider;

public class AddHotelDataProvider {

    public static final String testCountry = "UK";
    public static final String testCity = "Chester";

    @DataProvider
    public Object[][] addHotelPositiveTestData() {
        return new Object[][]{
                {"Hotel 500", "3", "01.01.1975", "USA", "Dallas", "Short description 777", "Long description 777", "Some notes 777"},
                {"Hotel 700", "3", "01.01.1975", "USA", "Dallas", "Short description 777", "Long description 777", ""},
                {"Hotel 1", "4", "01.01.2001", "UK", "Chester", "Short description", "Long description", "Some notes"},
        };
    }

    @DataProvider
    public Object[][] addHotelNegativeTestData() {
        return new Object[][]{
                {"", "4", "01.01.2001", "UK", "Chester", "Short description", "Long description", "Some notes",
                        "Name: Validation Error: Value is required."},
                {"Hotel", "4", "01012001", "UK", "Chester", "Short description", "Long description", "Some notes",
                        "Date of Construction: '01012001' could not be understood as a date."},
                {"Hotel", "4", "", "UK", "Chester", "Short description", "Long description", "Some notes",
                        "Date of Construction: Validation Error: Value is required."},
                {"Hotel", "4", "01.01.2001", "Select one", "Chester", "Short description", "Long description", "Some notes",
                        "Country: Validation Error: Value is required."},
                {"Hotel", "4", "01.01.2001", "UK", "Select one", "Short description", "Long description", "Some notes",
                        "City: Validation Error: Value is required."},
                {"Hotel", "4", "01.01.2001", "UK", "Chester", "", "Long description", "Some notes",
                        "Short Description: Validation Error: Value is required."},
                {"Hotel", "4", "01.01.2001", "UK", "Chester", "Short description", "", "Some notes",
                        "Description: Validation Error: Value is required."},
        };
    }

}
