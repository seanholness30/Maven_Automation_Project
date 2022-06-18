package Delta_PageObject_BookARoundTrip;

import ReusableClassess.Reusable_Actions_POM_Loggers;
import ReusableClassess.Reusable_Annotations_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AI07_Delta_HomePage extends Reusable_Annotations_Class {
    //Declare the ExtentTest for each object class
    ExtentTest logger;

    //Create a constructor method that will reference the same name as your class, you can make your
    //page object class methods static when you call it in your test class
    public AI07_Delta_HomePage(WebDriver driver){
        //page factory function for page object
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations_Class.logger;
    }//end of constructor

    //define all the webElements using @find by concept
    @FindBy(xpath = "//*[@class='advisory-close-icon float-right circle-outline icon-moreoptionsclose']")
    WebElement closePopup;
    public void ClosePopBox(){
        Reusable_Actions_POM_Loggers.clickAction(driver, closePopup, logger, "Close pop Up Box");
    }//end of close pop up

    @FindBy(xpath = "//*[text()='Rent A Car']")
    WebElement rentACar;
    public void RentACar(){
        Reusable_Actions_POM_Loggers.clickAction(driver, rentACar, logger, "Click Rent A Car" );
    }//end of clicking Rent A Car

    @FindBy(xpath = "//*[@id='headPrimary1']")
    WebElement bookAroundTrip;
    public void BookARoundTrip(){
        Reusable_Actions_POM_Loggers.clickAction(driver, bookAroundTrip, logger, "Book A round Trip");
    }//end of booking round trip

    @FindBy(xpath = "//*[@id='headPrimary1']")
    WebElement clickBook;
    public void ClickBook(){
        Reusable_Actions_POM_Loggers.clickAction(driver, clickBook, logger,"Click On Book");
    }//end of Click on Book

    @FindBy(xpath = "//*[@id='fromAirportName']")
    WebElement clickDepartingAirport;
    public void ClickDepartingAirport(){
        Reusable_Actions_POM_Loggers.clickAction(driver,clickDepartingAirport, logger, "Click Departing Airport");
    }//end of clicking departing airport

    @FindBy(xpath = "//*[@id='search_input']")
    WebElement departingSearchField;
    public void DepartingAirportName(String userValue){
        Reusable_Actions_POM_Loggers.sendKeysAction(driver, departingSearchField, userValue , logger, "Enter JFK In Search Field");
    }//end of send keys action

    @FindBy(xpath = "//*[@class='airport-list ng-star-inserted']")
    List<WebElement> airportsList;
    public void JFKFromDropdown(){
        Reusable_Actions_POM_Loggers.clickAction(driver, airportsList.get(0), logger,"Select JFK from List");
    }//end of selecting JFK from list

    @FindBy(xpath = "//*[@id='toAirportName']")
    WebElement clickArrivalAirport;
    public void ClickArrivalAirport(){
        Reusable_Actions_POM_Loggers.clickAction(driver, clickArrivalAirport, logger, "Click on Arrival Airport");
    }//end of clicking arrival airport

    @FindBy(xpath = "//*[@id='search_input']")
    WebElement arrivalSearchField;
    public void ArrivalAirportName(String userValue){
        Reusable_Actions_POM_Loggers.sendKeysAction(driver, arrivalSearchField, userValue, logger, "Enter LAX In Search Field");
    }//end of send keys action

    @FindBy(xpath = "//*[@class='airport-list ng-star-inserted']")
    List<WebElement> airportList;
    public void LAXFromDropdown(){
        Reusable_Actions_POM_Loggers.clickAction(driver, airportList.get(0), logger, "Select Lax from List");
    }//end of selecting LAX from list

    @FindBy(xpath = "//*[@id='selectTripType-val']")
    WebElement tripType;
    public void TripType(){
        Reusable_Actions_POM_Loggers.clickAction(driver, tripType, logger, "Click Trip Type");
    }//end of click trip type

    @FindBy(xpath = "//*[@id='ui-list-selectTripType0']")
    WebElement roundTrip;
    public void RoundTrip(){
        Reusable_Actions_POM_Loggers.clickAction(driver, roundTrip, logger, "Select Round Trip");
    }//end of Selecting Round Trip

    @FindBy(xpath = "//*[@id='calDepartLabelCont']")
    WebElement departDate;
    public void DepartDate(){
        Reusable_Actions_POM_Loggers.clickAction(driver, departDate, logger,"Click on Depart Date");
    }//end of clicking on depart date

    @FindBy(xpath = "//*[@aria-label='23 June 2022, Thursday']")
    WebElement selectDepartDate;
    public void SelectDepartDate(){
        Reusable_Actions_POM_Loggers.clickAction(driver,selectDepartDate,logger, "Select June 23,2022");
    }//end of selecting departing date

    @FindBy(xpath = "//*[@aria-label='30 June 2022, Thursday']")
    WebElement returnDate;
    public void ReturnDate(){
        Reusable_Actions_POM_Loggers.clickAction(driver, returnDate, logger, "Select June 30,2022");
    }//end of selecting return date

    @FindBy(xpath = "//*[@aria-label='done']")
    WebElement doneButton;
    public void DoneButton(){
        Reusable_Actions_POM_Loggers.clickAction(driver, doneButton,logger, "Click Done Button");
    }//end of clicking on done Button

    @FindBy(xpath = "//*[@id='passengers-val']")
    WebElement passengerCount;
    public void PassengerCount(){
        Reusable_Actions_POM_Loggers.clickAction(driver, passengerCount, logger, "Click Passenger Count");
    }//end of Passenger Count

    @FindBy(xpath = "//*[@id='ui-list-passengers0']")
    WebElement onePassenger;
    public void OnePassenger(){
        Reusable_Actions_POM_Loggers.clickAction(driver, onePassenger, logger, "Select 1 Passenger");
    }//end of selecting passenger

    @FindBy(xpath = "//*[@id='faresFor-val']")
    WebElement bestFareFor;
    public void BestFare(){
        Reusable_Actions_POM_Loggers.clickAction(driver, bestFareFor, logger, "Click Best Fare For");
    }//end of clicking Best Fare for

    @FindBy(xpath = "//*[@id='ui-list-faresFor3']")
    WebElement firstClass;
    public void FirstClass(){
        Reusable_Actions_POM_Loggers.clickAction(driver, firstClass, logger, "Select First Class");
    }//end of selecting First Class

    @FindBy(xpath = "//*[@id='btnSubmit']")
    WebElement submitButton;
    public void SubmitButton(){
        Reusable_Actions_POM_Loggers.clickAction(driver, submitButton, logger, "Click Submit Button");
    }//end of clicking Submit Button



    public void navigateTo(String website){
        Reusable_Actions_POM_Loggers.navigateWebPage(driver, website);
    }//end of navigateTo method


    @FindBy(xpath = "//*[@id='headPrimary4']")
    WebElement flightStatus;
    public  void FlightStatus(){
        Reusable_Actions_POM_Loggers.clickAction(driver,flightStatus, logger, "Click Flight Status");
    }//end of clicking flight status

    @FindBy(xpath = "//*[@data-analytics-id='home-shop-5']")
    WebElement baggageTravelFees;
    public void TravelFees(){
        Reusable_Actions_POM_Loggers.clickAction(driver, baggageTravelFees, logger, "Baggage & Travel Fees");
    }//end of Baggage & Travel Fees

    @FindBy(xpath = "//*[@class='list-inline-item ng-star-inserted']")
    List<WebElement> travelRequire;
    public void TravelRequire(){
        Reusable_Actions_POM_Loggers.clickAction(driver, travelRequire.get(0), logger, "Travel Requirements Guide ");
    }//end of Travel Requirement Guide



}//end of java class
