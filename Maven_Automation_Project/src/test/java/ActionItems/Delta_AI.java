package ActionItems;

import ReusableLibraries.Reusable_Actions;
import ReusableClassess.Reusable_Actions_Loggers;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Delta_AI {

    //declare the local driver outside so that it can be reusable with other annotation methods
    WebDriver driver;
    ExtentReports reports;
    ExtentTest logger;

    //Before suite will set the driver you are using
    @BeforeSuite
    public void SetChromeDriver() {
        driver = Reusable_Actions.setDriver();
        //define the path to the report
        reports = new ExtentReports("src/main/java/HTML_Report/Delta.html", true);
    }//end of before suite annotation


    //Test case 1: Rent a car
    @Test(priority = 1)
    public void RentACar() throws InterruptedException {
        logger = reports.startTest("Rent A Car");
        driver.navigate().to("https://www.Delta.com");
        Thread.sleep(1000);
        //Verify Title
        Reusable_Actions_Loggers.verifyTitle(driver, logger, "Delta Air Lines | Flights & Plane Tickets + Hotels & Rental Cars");
        //Close pop up
        Reusable_Actions_Loggers.clickAction(driver, "//*[@class='advisory-close-icon float-right circle-outline icon-moreoptionsclose']", logger, "Close pop pup ");
        Thread.sleep(1000);
        // Click on Rent A Car on Homepage
        Reusable_Actions_Loggers.clickAction(driver, "//*[text()='Rent A Car']", logger, "Click on Rent A Car");
        //Switch to Rent A Car Tab
        Reusable_Actions_Loggers.switchtotabByIndex(driver, 1);
        //Click on Pick-up Section
        Reusable_Actions_Loggers.clickAction(driver, "//*[@aria-label='Pick-up']", logger, "Click on Pick-up section");
        //Enter a city in Pick-up section
        Reusable_Actions_Loggers.sendKeysAction(driver, "//*[@id='location-field-locn']", "Brooklyn", logger, "Location");
        Thread.sleep(1000);
        //Select Brooklyn from dropdown list
        Reusable_Actions_Loggers.clickByIndexAction(driver, "//*[@data-stid='location-field-locn-result-item']", 0, logger, "Location Select");
        //Click on Drop-off Section
        Reusable_Actions_Loggers.clickAction(driver, "//*[@data-stid='location-field-loc2-menu-trigger']", logger, "Click on Drop-off");
        //Enter city for drop-off
        Reusable_Actions_Loggers.sendKeysAction(driver, "//*[@id='location-field-loc2']", "Boston", logger, "Location");
        Thread.sleep(1000);
        //Select Edison From dropdown list
        Reusable_Actions_Loggers.clickByIndexAction(driver, "//*[@data-stid='location-field-loc2-result-item-button']", 1, logger, "Location Select");
        Thread.sleep(1000);
        //Click on Pick-up Date
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='d1-btn']", logger, "Click Pick-up Date");
        Thread.sleep(1000);
        //Select Pick-Up Dates
        Reusable_Actions_Loggers.clickAction(driver, "//*[@aria-label='Jun 19, 2022']", logger, "Pick-Up Date");
        Thread.sleep(1000);
        //Select Drop-off Dates
        Reusable_Actions_Loggers.clickAction(driver, "//*[@aria-label='Jun 30, 2022']", logger, "Drop-off Date");
        Thread.sleep(2000);
        //Select Done from dropdown
        Reusable_Actions_Loggers.clickAction(driver, "//*[@data-stid='apply-date-picker']", logger, "Select Done");
        Thread.sleep(1000);
        //Click Pick-up Time Dropdown
        Reusable_Actions_Loggers.clickAction(driver, "//*[@aria-label='Pick-up time']", logger, "Click Pick-up time");
        Thread.sleep(1000);
        //Select Time from dropdown
        Reusable_Actions_Loggers.selectByTextAction(driver, "//*[@aria-label='Pick-up time']", "11:00", logger, "Select 10am");
        Thread.sleep(1000);
        //Click Drop-off Drop
        Reusable_Actions_Loggers.clickAction(driver, "//*[@aria-label='Drop-off time']", logger, "Click Drop-off time");
        Thread.sleep(1000);
        //Select Time from dropdown
        Reusable_Actions_Loggers.selectByTextAction(driver, "//*[@aria-label='Drop-off time']", "14:00", logger, "Select 2pm");
        Thread.sleep(1000);
        //Click Search button
        Reusable_Actions_Loggers.clickAction(driver, "//*[@data-testid='submit-button']", logger, " Click Search Button");
        Thread.sleep(3000);
        //Select the 3rd option from the list
        Reusable_Actions_Loggers.clickByIndexAction(driver, "//*[@name='textonly']", 2, logger, "Pick 3rd option ");
        Thread.sleep(3000);
        //Switch to select drop-off location Tab
        Reusable_Actions_Loggers.switchtotabByIndex(driver, 2);
        Thread.sleep(1000);
        //Click first drop-off location
        Reusable_Actions_Loggers.clickByIndexAction(driver, "//*[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary']", 0, logger, "Pick First option");
        Thread.sleep(1000);
        //Click Reserve
        Reusable_Actions_Loggers.clickAction(driver, "//*[@name='reserve-btn']", logger, "Click Reserve");
        Thread.sleep(1000);
        //Enter in First & Last name
        Reusable_Actions_Loggers.sendKeysAction(driver, "//*[@name='tripPreferencesRequests[0].carTripPreferencesRequest.driverName']", "Uchiha Itachi", logger, "First & last names");
        Thread.sleep(1000);
        //Enter in Phone Number
        Reusable_Actions_Loggers.sendKeysAction(driver, "//*[@name='tripPreferencesRequests[0].carTripPreferencesRequest.phoneNumber']", "34787807854", logger, "Phone number");
        Thread.sleep(2000);
        //Scroll down Page
        Reusable_Actions_Loggers.scrollAction(driver, "scroll(0,600)");
        Thread.sleep(1000);
        //Enter email address
        Reusable_Actions_Loggers.sendKeysAction(driver, "//*[@name='email']", "Uchiha.itachi97@gmail.com", logger, "Email");
        Thread.sleep(1000);
        //Click/Check terms of use Box
        Reusable_Actions_Loggers.clickAction(driver, "//*[@name='TCCheckbox']", logger, "Terms of Use");
        Thread.sleep(1000);
        //Click Reserve Now
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='complete-booking']", logger, "Reserve Now");
        Thread.sleep(1000);
        //Capture & Print Thank You message & Itinerary number
        String itineraryNumber = Reusable_Actions_Loggers.getTextAction(driver, "//*[@class='box  confirmation-detail']", logger, "Itinerary Number");
        System.out.println("Itinerary number is " + itineraryNumber);
        Thread.sleep(10000);

        //end the logger per test
        reports.endTest(logger);
    }//end of test


    //Test case 2: Baggage & Travel Fees Section
    @Test(priority = 2)
    public void BaggageTravelfees() throws InterruptedException {
        logger = reports.startTest("Baggage & Travel Fees ");
        driver.navigate().to("https://www.Delta.com");
        Thread.sleep(1000);
        //Close pop up
        Reusable_Actions_Loggers.clickAction(driver, "//*[@class='advisory-close-icon float-right circle-outline icon-moreoptionsclose']", logger, "Close pop pup ");
        Thread.sleep(1000);
        //Click on Updated bag & Travel Fees
        Reusable_Actions_Loggers.clickAction(driver, "//*[@data-analytics-id='home-shop-5']", logger, "Click Updated Baggage Fees");
        Thread.sleep(2000);
        //Confirm when clicking on any 4 modules it scrolls down to the corresponding Section.
        Reusable_Actions_Loggers.clickAction(driver, "//*[text()='Checked Baggage Fees']", logger, "Click Checked Baggage Fees");
        Thread.sleep(3000);
        //Scroll Back Up
        Reusable_Actions_Loggers.scrollAction(driver, "scroll(0,-200)");
        Thread.sleep(1000);
        //Click on Travel Changes
        Reusable_Actions_Loggers.clickAction(driver, "//*[text()='Travel Changes']", logger, "Click Travel Changes");
        Thread.sleep(2000);
        //Scroll Back Up
        Reusable_Actions_Loggers.scrollAction(driver, "scroll(0,-300)");
        Thread.sleep(1000);
        //Click on Carry-On Baggage
        Reusable_Actions_Loggers.clickAction(driver, "//*[text()='Carry-On Baggage']", logger, "Click Carry-On Baggage");
        Thread.sleep(2000);
        //Scroll Back Up
        Reusable_Actions_Loggers.scrollAction(driver, "scroll(0,-200)");
        Thread.sleep(1000);
        //Click on Travel Services
        Reusable_Actions_Loggers.clickAction(driver, "//*[text()='Travel Services']", logger, "Click Travel Services");
        Thread.sleep(2000);
        //Scroll Back Up
        Reusable_Actions_Loggers.scrollAction(driver, "scroll(0,-500)");
        Thread.sleep(1000);

        //end the logger per test
        reports.endTest(logger);
    }//End of Test


    //Test Case 3: Book A round Trip Flight
    @Test(priority = 3)
    public void BookATrip() throws InterruptedException {
        logger = reports.startTest("Book a Round Trip");
        driver.navigate().to("https://www.Delta.com");
        Thread.sleep(1000);
        //Close pop up
        Reusable_Actions_Loggers.clickAction(driver, "//*[@class='advisory-close-icon float-right circle-outline icon-moreoptionsclose']", logger, "Close pop pup ");
        Thread.sleep(1000);
        //Click on Book
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='headPrimary1']", logger, "Click on Book");
        Thread.sleep(1000);
        //Click on Departing Airport
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='fromAirportName']", logger, "Click Departing Airport");
        Thread.sleep(1000);
        //Enter in JFK in search field
        Reusable_Actions_Loggers.sendKeysAction(driver, "//*[@id='search_input']", "JFK", logger, "Enter JFK in search field");
        Thread.sleep(1000);
        //Select JFK from Dropdown
        Reusable_Actions_Loggers.clickByIndexAction(driver, "//*[@class='airport-list ng-star-inserted']", 0, logger, "Select JFK from dropdown list");
        Thread.sleep(1000);
        //Click on Arrival Airport
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='toAirportName']", logger, "Click Arrival Airport");
        Thread.sleep(1000);
        //Enter in LAX in search field
        Reusable_Actions_Loggers.sendKeysAction(driver, "//*[@id='search_input']", "LAX", logger, "Enter LAX in search field");
        Thread.sleep(1000);
        //Select LAX from Dropdown
        Reusable_Actions_Loggers.clickByIndexAction(driver, "//*[@class='airport-list ng-star-inserted']", 0, logger, "Select LAX from dropdown list");
        Thread.sleep(1000);
        //Click Trip Type
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='selectTripType-val']", logger, "Select Round Trip Type");
        Thread.sleep(1000);
        //Select Round Trip From Dropdown
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='ui-list-selectTripType0']", logger, "Select LAX from dropdown list");
        Thread.sleep(1000);
        //Click on depart Date
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='calDepartLabelCont']", logger, "Click on Depart Date");
        Thread.sleep(1000);
        //Select Departure Date
        Reusable_Actions_Loggers.clickAction(driver, "//*[@aria-label='16 June 2022, Thursday']", logger, "Select June 16, 2022");
        Thread.sleep(1000);
        //Select Departure Date
        Reusable_Actions_Loggers.clickAction(driver, "//*[@aria-label='30 June 2022, Thursday']", logger, "Select June 30, 2022");
        Thread.sleep(1000);
        //Click Done from Dropdown
        Reusable_Actions_Loggers.clickAction(driver, "//*[@aria-label='done']", logger, "Click Done from Dropdown");
        Thread.sleep(1000);
        //Click on Passenger count
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='passengers-val']", logger, "Click on Passenger count");
        Thread.sleep(1000);
        //Select 1 passenger
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='ui-list-passengers0']", logger, "Select 1 passenger");
        Thread.sleep(1000);
        //Click on Best Fare For
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='faresFor-val']", logger, "Click on Best Fare for");
        Thread.sleep(1000);
        //Select First Class From Dropdown
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='ui-list-faresFor3']", logger, "Select First Class");
        Thread.sleep(1000);
        //Click Submit Button
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='btnSubmit']", logger, "Click Submit Button");

        //end the logger per test
        reports.endTest(logger);
    }//End of Test


    //Test Case 4: Check Flight Status
    @Test(priority = 4)
    public void CheckFlightStatus() throws InterruptedException {
        logger = reports.startTest("Check Flight Status");
        driver.navigate().to("https://www.Delta.com");
        Thread.sleep(1000);
        //Close pop up
        Reusable_Actions_Loggers.clickAction(driver, "//*[@class='advisory-close-icon float-right circle-outline icon-moreoptionsclose']", logger, "Close pop pup ");
        Thread.sleep(1000);
        //Click on Flight Status
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='headPrimary4']", logger, "Click on Flight Status");
        Thread.sleep(1000);
        //Click on Search By Date
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='calDepartLabelCont']", logger, "Click on Search By Date");
        Thread.sleep(1000);
        //Choose Current Date to Check Flight Status [6/2/22 is current date]
        Reusable_Actions_Loggers.clickAction(driver, "//*[@aria-label='3 June 2022, Friday']", logger, "Select June 02, 2022");
        Thread.sleep(1000);
        //Click Done from Dropdown
        Reusable_Actions_Loggers.clickAction(driver, "//*[@aria-label='done']", logger, "Click Done from Dropdown");
        Thread.sleep(1000);
        //Click on Flight # field
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='flightNo']", logger, "Click Flight # field");
        Thread.sleep(1000);
        //Enter Flight # [Googled Delta Flights from NYC to Lax - 1057]
        Reusable_Actions_Loggers.sendKeysAction(driver, "//*[@name='flightNumber']", "1057", logger, "Flight #");
        Thread.sleep(1000);
        //Click Submit Button
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='btn-flight-sts-submit']", logger, " Click Submit Button");
        Thread.sleep(1000);
        //Capture & Print Flight Status
        String flightStatus = Reusable_Actions_Loggers.getTextAction(driver, "//*[@class='col-xl-4 col-lg-4 col-md-12 col-sm-12 col-12 datapanel inverse-white first datapanelfont']", logger, "Capture Flight Status");
        System.out.println("Flight is " + flightStatus);
        Thread.sleep(2000);

        //end the logger per test
        reports.endTest(logger);
    }//End of Test


    //Test Case 5: Shop Hotels
    @Test(priority = 5)
    public void ShopHotels() throws InterruptedException {
        logger = reports.startTest("Shop Hotels");
        driver.navigate().to("https://www.Delta.com");
        Thread.sleep(1000);
        //Close pop up
        Reusable_Actions_Loggers.clickAction(driver, "//*[@class='advisory-close-icon float-right circle-outline icon-moreoptionsclose']", logger, "Close pop pup ");
        Thread.sleep(1000);
        //Click on Shop Hotels
        Reusable_Actions_Loggers.clickAction(driver, "//*[@data-analytics-id='home-shop-2']", logger, "Shop Hotels");
        Thread.sleep(1000);
        //Switch to Hotel Tabs
        Reusable_Actions_Loggers.switchtotabByIndex(driver, 1);
        Thread.sleep(1000);
        //Click Destination Field
        Reusable_Actions_Loggers.submitAction(driver, "//*[@name='q-destination']", logger, "Destination Field");
        Thread.sleep(1000);
        //Enter Dubai into Search Field
        Reusable_Actions_Loggers.sendKeysAction(driver, "//*[@name='q-destination']", "Downtown Dubai, Dubai, Dubai, United Arab Emirates", logger, "Enter Dubai");
        Thread.sleep(2000);
        //Select 1st Option from dropdown list
        Reusable_Actions_Loggers.clickByIndexAction(driver, "//*[@class='autosuggest-category-result']", 0, logger, "1st Option ");
        Thread.sleep(1000);
        //Click Check-in Date
        Reusable_Actions_Loggers.clickAction(driver, "//*[@name='q-localised-check-in']", logger, "Check-In Date");
        Thread.sleep(1000);
        //Select June242022
        Reusable_Actions_Loggers.clickAction(driver, "//*[@data-date='2022-5-24']", logger, "June 24 2022");
        Thread.sleep(1000);
        //Click Check-out Date
        Reusable_Actions_Loggers.clickAction(driver, "//*[@name='q-localised-check-out']", logger, "Check-out Date");
        Thread.sleep(1000);
        //Select June302022
        Reusable_Actions_Loggers.clickAction(driver, "//*[@data-date='2022-5-30']", logger, "June 30 2022");
        Thread.sleep(1000);
        //Click Rooms
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='qf-0q-compact-occupancy']", logger, "Click Rooms");
        Thread.sleep(1000);
        //Select More Options
        Reusable_Actions_Loggers.clickAction(driver, "//*[@data-more-options='true']", logger, "Rooms Selection");
        Thread.sleep(1000);
        //Click Rooms
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='qf-0q-rooms']", logger, "Click Rooms");
        Thread.sleep(1000);
        //Select 1 Rooms
        Reusable_Actions_Loggers.selectByTextAction(driver, "//*[@id='qf-0q-rooms']", "1", logger, "Select 1");
        Thread.sleep(1000);
        //Click on Adults Dropdown
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='qf-0q-room-0-adults']", logger, "Adults Dropdown");
        Thread.sleep(1000);
        //Select 3 Adults
        Reusable_Actions_Loggers.selectByTextAction(driver, "//*[@id='qf-0q-room-0-adults']", "3", logger, "Select 3");
        Thread.sleep(1000);
        //Click Search
        Reusable_Actions_Loggers.clickAction(driver, "//*[@type='submit']", logger, "Click Search");
        Thread.sleep(1000);
        //Select 3rd Option
        Reusable_Actions_Loggers.clickByIndexAction(driver, "//*[@class='p-name']", 2, logger, "Select 3rd Option ");
        Thread.sleep(1000);
        //Switch to Hotel Tabs
        Reusable_Actions_Loggers.switchtotabByIndex(driver, 2);
        Thread.sleep(1000);
        //Click Reserve
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='book-now-button']", logger, "Click Reserve");
        Thread.sleep(4000);
        //Click First Name
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='room-details-room-0-first-name']", logger, "First Name");
        Thread.sleep(1000);
        //Enter First Name
        Reusable_Actions_Loggers.sendKeysAction(driver, "//*[@id='room-details-room-0-first-name']", "Itachi", logger, "First Name");
        Thread.sleep(1000);
        //Click Last Name
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='room-details-room-0-last-name']", logger, "Last Name");
        Thread.sleep(1000);
        //Enter Last Name
        Reusable_Actions_Loggers.sendKeysAction(driver, "//*[@id='room-details-room-0-last-name']", "Uchiha", logger, "Last Name");
        Thread.sleep(1000);
        //Click Email Address
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='contact-details-email']", logger, "Email Address");
        Thread.sleep(1000);
        //Enter Email Address
        Reusable_Actions_Loggers.sendKeysAction(driver, "//*[@id='contact-details-email']", "Uchiha.itachi99@gmail.com", logger, "Email Address");
        Thread.sleep(1000);
        //Click Cell Phone #
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='contact-details-phone']", logger, "Cell Phone #");
        Thread.sleep(1000);
        //Enter Cell Phone #
        Reusable_Actions_Loggers.sendKeysAction(driver, "//*[@id='contact-details-phone']", "34787804754", logger, "Cell Phone #");
        Thread.sleep(1000);
        //Scroll down Page
        Reusable_Actions_Loggers.scrollAction(driver, "scroll(0,1300)");
        Thread.sleep(1000);
        //Click Credit Card Info
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='payment-details-card-number']", logger, "Credit Card Info");
        Thread.sleep(1000);
        //Enter Credit Card Info
        Reusable_Actions_Loggers.sendKeysAction(driver, "//*[@id='payment-details-card-number']", "4207670197497378", logger, "Credit Card Info");
        Thread.sleep(1000);
        //Click Expir. Month
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='expiry-month']", logger, "Credit Card Month");
        Thread.sleep(1000);
        //Enter Expir. Month
        Reusable_Actions_Loggers.sendKeysAction(driver, "//*[@id='expiry-month']", "08", logger, "Credit Card Month");
        Thread.sleep(1000);
        //Click Expir. Yr
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='expiry-year']", logger, "Credit Card Yr");
        Thread.sleep(1000);
        //Enter Expir. Yr
        Reusable_Actions_Loggers.sendKeysAction(driver, "//*[@id='expiry-year']", "25", logger, "Credit Card Yr");
        Thread.sleep(1000);
        //Click Security Code
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='payment-details-cvv']", logger, "Security Code");
        Thread.sleep(1000);
        //Enter Security Code
        Reusable_Actions_Loggers.sendKeysAction(driver, "//*[@id='payment-details-cvv']", "009", logger, "Security Code");
        Thread.sleep(1000);
        //Click Zipcode
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='billing-details-post-code']", logger, "Zipcode");
        Thread.sleep(1000);
        //Enter Zipcode
        Reusable_Actions_Loggers.sendKeysAction(driver, "//*[@id='billing-details-post-code']", "07204", logger, "Zipcode");
        Thread.sleep(1000);
        //Click Book Button
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='book-button']", logger, "Book Button");

        //Wont let you Book Unless you enter a valid CC

        //end the logger per test
        reports.endTest(logger);
    }//End of Test




    //Test Case 6: Travel Requirement Guide
    @Test(priority = 6)
    public void TravelrequirementGuide() throws InterruptedException {
        logger = reports.startTest("Travel Requirement Guide");
        driver.navigate().to("https://www.Delta.com");
        Thread.sleep(1000);
        //Close pop up
       // Reusable_Actions_Loggers.clickAction(driver, "//*[@class='advisory-close-icon float-right circle-outline icon-moreoptionsclose']", logger, "Close pop pup ");
        //Thread.sleep(1000);
        //Scroll down Page
        Reusable_Actions_Loggers.scrollAction(driver, "scroll(0,2000)");
        Thread.sleep(1000);
        //Click Help center
        Reusable_Actions_Loggers.clickByIndexAction(driver, "//*[@class='list-inline-item ng-star-inserted']", 0, logger, "Click Help Center");
        Thread.sleep(1000);
        //Click Travel Requirements Guide
        Reusable_Actions_Loggers.clickAction(driver, "//*[@class='card-descriptiontxt pr-sm-4 pr-md-0']", logger, "Travel Requirements Guide");
        Thread.sleep(1000);
        //Switch to Travel Requirements Guide Tab
        Reusable_Actions_Loggers.switchtotabByIndex(driver, 1);
        Thread.sleep(1000);
        //Capture & Print Travel Requirements Guide Header
        String travelRequirementsGuide = Reusable_Actions_Loggers.getTextAction(driver, "//*[@class='content-block']", logger, "Capture Flight Status");
        System.out.println("Travel Requirement is " + travelRequirementsGuide);
        Thread.sleep(2000);

        //end the logger per test
        reports.endTest(logger);
    }//End of Test


    @AfterSuite
    public void quitSession() {
        driver.quit();
        reports.flush();
    }//end of after suite


}//end of java class
