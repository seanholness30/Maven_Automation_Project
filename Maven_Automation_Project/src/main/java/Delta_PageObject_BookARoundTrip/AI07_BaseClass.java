package Delta_PageObject_BookARoundTrip;

import Delta_PageObject_BaggageTravelFee.AI071_Delta_BaggageTravelFee;
import Delta_PageObject_BookARoundTrip.AI07_Delta_HomePage;
import Delta_PageObject_FlightStatus.AI07_Delta_FlightStatus;
import Delta_PageObject_RentACar.AI07_Delta_RentACar;
import Delta_PageObject_TravelRequire.AI07_Delta_TravelRequire;
import ReusableClassess.Reusable_Annotations_Class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AI07_BaseClass extends Reusable_Annotations_Class {

    public AI07_BaseClass(WebDriver diver) {
        PageFactory.initElements(driver, this);
    }//end of constructor class

    //create static reference for Book A Round Trip From Homepage
    public static AI07_Delta_HomePage ai07_delta_homePage() {
        AI07_Delta_HomePage ai07_delta_homePage = new AI07_Delta_HomePage(driver);
        return ai07_delta_homePage;
    }//end of AI07 Book A Round Trip From Delta Home Page

    //create a static reference for Delta Baggage & Travel Fees
    public static AI071_Delta_BaggageTravelFee ai071_delta_baggageTravelFee(){
        AI071_Delta_BaggageTravelFee ai071_delta_baggageTravelFee = new AI071_Delta_BaggageTravelFee(driver);
        return ai071_delta_baggageTravelFee;
    }//end of AI07 Delta Baggage & Travel Fees

    //create a static reference for Delta Flight Status
    public static AI07_Delta_FlightStatus ai07_delta_flightStatus(){
        AI07_Delta_FlightStatus ai07_delta_flightStatus = new AI07_Delta_FlightStatus(driver);
        return ai07_delta_flightStatus;
    }//end of AI07 Delta Flight Status

    public static AI07_Delta_RentACar ai07_delta_rentACar(){
        AI07_Delta_RentACar ai07_delta_rentACar = new AI07_Delta_RentACar(driver);
        return ai07_delta_rentACar;
    }//end of AI07 Delta Rent A car


    public static AI07_Delta_TravelRequire ai07_delta_travelRequire(){
        AI07_Delta_TravelRequire ai07_delta_travelRequire = new AI07_Delta_TravelRequire(driver);
        return ai07_delta_travelRequire;
    }//end of AI07 Delta Travel Requirements Guide


}//end of java class
