package ActionItems;

import Delta_PageObject_BookARoundTrip.AI07_BaseClass;
import Delta_PageObject_BookARoundTrip.AI07_Delta_HomePage;
import ReusableClassess.Reusable_Actions_Loggers;
import ReusableClassess.Reusable_Annotations_Class;
import org.testng.annotations.Test;

public class Delta_AI_POM extends Reusable_Annotations_Class {

    //Test case 1: Rent a car
    @Test(priority = 1)
    public void RentACar() throws InterruptedException {
        driver.navigate().to("https://www.Delta.com");
        Thread.sleep(1000);
        //Verify Title
        AI07_BaseClass.ai07_delta_rentACar().verifyTitle("Delta Air Lines | Flights & Plane Tickets + Hotels & Rental Cars");
        Thread.sleep(1000);
        //Close pop up
        AI07_BaseClass.ai07_delta_homePage().ClosePopBox();
        Thread.sleep(1000);
        // Click on Rent A Car on Homepage
        AI07_BaseClass.ai07_delta_homePage().RentACar();
        Thread.sleep(1000);
        //Switch to Rent A Car Tab
        AI07_BaseClass.ai07_delta_rentACar().switchTab(1);
        //Click on Pick-up Section
        AI07_BaseClass.ai07_delta_rentACar().ClickPickUp();
        Thread.sleep(1000);
        //Enter a city in Pick-up section
        AI07_BaseClass.ai07_delta_rentACar().LocationSearchField("Brooklyn");
        Thread.sleep(1000);
        //Select Brooklyn from dropdown list
        AI07_BaseClass.ai07_delta_rentACar().BrooklynFromDropdown();
        //Click on Drop-off Section
        AI07_BaseClass.ai07_delta_rentACar().ClickDropOff();
        //Enter city for drop-off
        AI07_BaseClass.ai07_delta_rentACar().BostonFromDropdown("Boston");
        Thread.sleep(1000);
        //Select Boston From dropdown list
        AI07_BaseClass.ai07_delta_rentACar().CityDropOff();
        Thread.sleep(1000);
        //Click on Pick-up Date
        AI07_BaseClass.ai07_delta_rentACar().CarPickUpDate();
        Thread.sleep(1000);
        //Select Pick-Up Dates
        AI07_BaseClass.ai07_delta_rentACar().PickUpDate();
        Thread.sleep(1000);
        //Select Drop-off Dates
        AI07_BaseClass.ai07_delta_rentACar().DropOffDate();
        Thread.sleep(2000);
        //Select Done from dropdown
        AI07_BaseClass.ai07_delta_rentACar().ClickDone();
        Thread.sleep(1000);
        //Click Pick-up Time Dropdown
        AI07_BaseClass.ai07_delta_rentACar().PickUptime();
        Thread.sleep(1000);
        //Select Time from dropdown
        AI07_BaseClass.ai07_delta_rentACar().PickTime("11:00 am");
        Thread.sleep(1000);
        //Click Drop-off Drop
        AI07_BaseClass.ai07_delta_rentACar().DropOffTime();
        Thread.sleep(1000);
        //Select Time from dropdown
        AI07_BaseClass.ai07_delta_rentACar().DropTime("2:00 pm");
        Thread.sleep(1000);
        //Click Search button
        AI07_BaseClass.ai07_delta_rentACar().SearchButton();
        Thread.sleep(3000);
        //Select the 3rd option from the list
        AI07_BaseClass.ai07_delta_rentACar().OptionThree();
        Thread.sleep(3000);
        //Switch to select drop-off location Tab
        AI07_BaseClass.ai07_delta_rentACar().switchTab(2);
        Thread.sleep(1000);
        //Click first drop-off location
        AI07_BaseClass.ai07_delta_rentACar().FirstDropOffLocation();
        Thread.sleep(1000);
        //Click Reserve
        AI07_BaseClass.ai07_delta_rentACar().ClickReserve();
        Thread.sleep(1000);
        //Enter in First & Last name
        AI07_BaseClass.ai07_delta_rentACar().NameInput("Uchiha Itachi");
        Thread.sleep(1000);
        //Enter in Phone Number
        AI07_BaseClass.ai07_delta_rentACar().PhoneNumberInp0ut("34787807854");
        Thread.sleep(2000);
        //Scroll down Page
        AI07_BaseClass.ai07_delta_rentACar().scrollDown("scroll(0,600)");
        Thread.sleep(1000);
        //Enter email address
        AI07_BaseClass.ai07_delta_rentACar().EmailInput("Uchiha.itachi97@gmail.com");
        Thread.sleep(1000);
        //Click/Check terms of use Box
        AI07_BaseClass.ai07_delta_rentACar().CheckTOUBox();
        Thread.sleep(1000);
        //Click Reserve Now
        AI07_BaseClass.ai07_delta_rentACar().ClickReserveBox();
        Thread.sleep(3000);
        //Capture & Print Thank You message & Itinerary number
        AI07_BaseClass.ai07_delta_rentACar().ItineraryNumberInfo();
        Thread.sleep(10000);

    }//end of test


    //Test case 2: Baggage & Travel Fees Section
    @Test(priority = 2)
    public void BaggageTravelfees() throws InterruptedException {
        AI07_BaseClass.ai07_delta_homePage().navigateTo("https://www.Delta.com");
        Thread.sleep(1000);
        //Close pop up
        AI07_BaseClass.ai07_delta_homePage().ClosePopBox();
        Thread.sleep(1000);
        //Click on Updated bag & Travel Fees
        AI07_BaseClass.ai07_delta_homePage().TravelFees();
        Thread.sleep(2000);
        //Confirm when clicking on any 4 modules it scrolls down to the corresponding Section starting with Checked Baggage Fees
        AI07_BaseClass.ai071_delta_baggageTravelFee().CheckedBaggageFees();
        Thread.sleep(3000);
        //Scroll Back Up
        AI07_BaseClass.ai071_delta_baggageTravelFee().scrollUp("scroll(0,-200)");
        Thread.sleep(1000);
        //Click on Travel Changes
        AI07_BaseClass.ai071_delta_baggageTravelFee().TravelChanges();
        Thread.sleep(2000);
        //Scroll Back Up
        AI07_BaseClass.ai071_delta_baggageTravelFee().scrollUp("scroll(0,-300)");
        Thread.sleep(1000);
        //Click on Carry-On Baggage
        AI07_BaseClass.ai071_delta_baggageTravelFee().CarryOnBaggage();
        Thread.sleep(2000);
        //Scroll Back Up
        AI07_BaseClass.ai071_delta_baggageTravelFee().scrollUp("scroll(0,-200)");
        Thread.sleep(1000);
        //Click on Travel Services
        AI07_BaseClass.ai071_delta_baggageTravelFee().TravelServices();
        Thread.sleep(2000);
        //Scroll Back Up
        AI07_BaseClass.ai071_delta_baggageTravelFee().scrollUp("scroll(0,-500)");
        Thread.sleep(1000);

    }//End of Test


    //Test Case 3: Book A round Trip Flight
    @Test(priority = 3)
    public void BookATrip() throws InterruptedException {
        AI07_BaseClass.ai07_delta_homePage().navigateTo("https://www.Delta.com");
        Thread.sleep(1000);
        //Close pop up
        AI07_BaseClass.ai07_delta_homePage().ClosePopBox();
        Thread.sleep(1000);
        //Click on Book
        AI07_BaseClass.ai07_delta_homePage().ClickBook();
        Thread.sleep(1000);
        //Click on Departing Airport
        AI07_BaseClass.ai07_delta_homePage().ClickDepartingAirport();
        Thread.sleep(1000);
        //Enter in JFK in search field
        AI07_BaseClass.ai07_delta_homePage().DepartingAirportName("JFK");
        Thread.sleep(1000);
        //Select JFK from Dropdown
        AI07_BaseClass.ai07_delta_homePage().JFKFromDropdown();
        Thread.sleep(1000);
        //Click on Arrival Airport
        AI07_BaseClass.ai07_delta_homePage().ClickArrivalAirport();
        Thread.sleep(1000);
        //Enter in LAX in search field
        AI07_BaseClass.ai07_delta_homePage().ArrivalAirportName("LAX");
        Thread.sleep(1000);
        //Select LAX from Dropdown
        AI07_BaseClass.ai07_delta_homePage().LAXFromDropdown();
        Thread.sleep(1000);
        //Click Trip Type
        AI07_BaseClass.ai07_delta_homePage().TripType();
        Thread.sleep(1000);
        //Select Round Trip From Dropdown
        AI07_BaseClass.ai07_delta_homePage().RoundTrip();
        Thread.sleep(1000);
        //Click on depart Date
        AI07_BaseClass.ai07_delta_homePage().DepartDate();
        Thread.sleep(1000);
        //Select June 23, 2022. as Departure Date
        AI07_BaseClass.ai07_delta_homePage().SelectDepartDate();
        Thread.sleep(1000);
        //Select June 30, 2022. as Return Date
        AI07_BaseClass.ai07_delta_homePage().ReturnDate();
        Thread.sleep(1000);
        //Click Done Button
        AI07_BaseClass.ai07_delta_homePage().DoneButton();
        Thread.sleep(1000);
        //Click on Passenger Count
        AI07_BaseClass.ai07_delta_homePage().PassengerCount();
        Thread.sleep(1000);
        //Select 1 passenger
        AI07_BaseClass.ai07_delta_homePage().OnePassenger();
        Thread.sleep(1000);
        //Click on Best Fare For
        AI07_BaseClass.ai07_delta_homePage().BestFare();
        Thread.sleep(1000);
        //Select First Class From Dropdown
        AI07_BaseClass.ai07_delta_homePage().FirstClass();
        Thread.sleep(1000);
        //Click Submit Button
        AI07_BaseClass.ai07_delta_homePage().SubmitButton();

    }//End of Test


    //Test Case 4: Check Flight Status
    @Test(priority = 4)
    public void CheckFlightStatus() throws InterruptedException {
        AI07_BaseClass.ai07_delta_homePage().navigateTo("https://www.Delta.com");
        Thread.sleep(1000);
        //Close pop up
        AI07_BaseClass.ai07_delta_homePage().ClosePopBox();
        Thread.sleep(1000);
        //Click on Flight Status
        AI07_BaseClass.ai07_delta_flightStatus().FlightStatus();
        Thread.sleep(1000);
        //Click on Search By Date
        AI07_BaseClass.ai07_delta_flightStatus().SearchByDate();
        Thread.sleep(1000);
        //Choose 6/16/22
        AI07_BaseClass.ai07_delta_flightStatus().SelectDate();
        Thread.sleep(1000);
        //Click Done from Dropdown
        AI07_BaseClass.ai07_delta_flightStatus().DoneClick();
        Thread.sleep(1000);
        //Click on Flight # field
        AI07_BaseClass.ai07_delta_flightStatus().FlightNumField();
        Thread.sleep(1000);
        //Enter Flight # [Googled Delta Flights from NYC to Lax - 0543]
        AI07_BaseClass.ai07_delta_flightStatus().FlightNum("0543");
        Thread.sleep(1000);
        //Click Submit Button
        AI07_BaseClass.ai07_delta_flightStatus().SubmitButton();
        Thread.sleep(1000);
        //Capture & Print Flight Status
        AI07_BaseClass.ai07_delta_flightStatus().FlightInfo();
        Thread.sleep(2000);

    }//End of Test




    //Test Case 5: Travel Requirement Guide
    @Test(priority = 5)
    public void TravelRequirementGuide() throws InterruptedException {
        AI07_BaseClass.ai07_delta_homePage().navigateTo("https://www.Delta.com");
        Thread.sleep(1000);
        //Close pop up
        AI07_BaseClass.ai07_delta_homePage().ClosePopBox();
        Thread.sleep(1000);
        //Scroll down Page
       AI07_BaseClass.ai07_delta_travelRequire().scrollDown("scroll(0,2000)");
        Thread.sleep(1000);
        //Click Help center
        AI07_BaseClass.ai07_delta_travelRequire().HelpCenter();
        Thread.sleep(1000);
        //Click Travel Requirements Guide
        AI07_BaseClass.ai07_delta_travelRequire().TravelRequire();
        Thread.sleep(1000);
        //Switch to Travel Requirements Guide Tab
        AI07_BaseClass.ai07_delta_travelRequire().switchTab(0);
        Thread.sleep(1000);
        //Capture & Print Travel Requirements Guide Header
        AI07_BaseClass.ai07_delta_travelRequire().TravelRequirementInfo();
        Thread.sleep(2000);

    }//End of Test

}//end of java class
