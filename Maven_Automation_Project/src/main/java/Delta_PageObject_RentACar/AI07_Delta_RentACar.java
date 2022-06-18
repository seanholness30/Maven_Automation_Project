package Delta_PageObject_RentACar;

import ReusableClassess.Reusable_Actions_POM_Loggers;
import ReusableClassess.Reusable_Annotations_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AI07_Delta_RentACar extends Reusable_Annotations_Class {
    //Declare the ExtentTest for each object class
    ExtentTest logger;

    //Create a constructor method that will reference the same name as your class, you can make your
    //page object class methods static when you call it in your test class
    public AI07_Delta_RentACar(WebDriver driver){
        //page factory function for page object
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations_Class.logger;
    }//end of constructor

    //define all the webElements using @find by concept

    @FindBy(xpath = "//*[@aria-label='Pick-up']")
    WebElement clickPickUp;
    public void ClickPickUp(){
        Reusable_Actions_POM_Loggers.clickAction(driver, clickPickUp, logger, "Click Pick Up Section");
    }//end of clicking on pick up

    @FindBy(xpath = "//*[@id='location-field-locn']")
    WebElement locationSearchField;
    public void LocationSearchField(String userValue){
        Reusable_Actions_POM_Loggers.sendKeysAction(driver, locationSearchField, userValue, logger, "Enter in Brooklyn" );
    }//end of entering Brooklyn

    @FindBy(xpath = "//*[@data-stid='location-field-locn-result-item']")
    List<WebElement> cityLocationList;
    public void BrooklynFromDropdown(){
        Reusable_Actions_POM_Loggers.clickAction(driver, cityLocationList.get(0), logger, "Select Brooklyn From Dropdown");
    }//end of selecting Brooklyn form list

    @FindBy(xpath = "//*[@data-stid='location-field-loc2-menu-trigger']")
    WebElement clickDropOff;
    public void ClickDropOff(){
        Reusable_Actions_POM_Loggers.clickAction(driver, clickDropOff, logger, "Click Drop Off");
    }//end of clicking

    @FindBy(xpath = "//*[@id='location-field-loc2']")
    WebElement dropOffSearchField;
    public void BostonFromDropdown(String userValue){
        Reusable_Actions_POM_Loggers.sendKeysAction(driver, dropOffSearchField, userValue, logger, "Entering in Boston"  );
    }//end of entering Boston

    @FindBy(xpath = "//*[@data-stid='location-field-loc2-result-item-button']")
    List<WebElement> cityDropOff;
    public void CityDropOff(){
        Reusable_Actions_POM_Loggers.clickAction(driver, cityDropOff.get(1), logger, "Select Boston From Dropdown");
    }//end of Selecting Boston from list

    @FindBy(xpath = "//*[@id='d1-btn']")
    WebElement carPickUpDate;
    public void CarPickUpDate(){
        Reusable_Actions_POM_Loggers.clickAction(driver, carPickUpDate, logger, "Select Car Pick Up Date");
    }// end of Car Pick Up Date

    @FindBy(xpath = "//*[@aria-label='Jul 19, 2022']")
    WebElement pickUpDate;
    public void PickUpDate(){
        Reusable_Actions_POM_Loggers.clickAction(driver, pickUpDate, logger, "Select Pick Up Date");
    }//end of Selecting June 19, 2022

    @FindBy(xpath = "//*[@aria-label='Jul 30, 2022']")
    WebElement dropOffDate;
    public void DropOffDate(){
        Reusable_Actions_POM_Loggers.clickAction(driver, dropOffDate, logger, "Select Drop Off Date");
    }//end of Selecting June 30, 2022

    @FindBy(xpath = "//*[@data-stid='apply-date-picker']")
    WebElement clickDone;
    public void ClickDone(){
        Reusable_Actions_POM_Loggers.clickAction(driver, clickDone, logger, "Click Done from dropdown");
    }//end of clicking Done button

    @FindBy(xpath = "//*[@aria-label='Pick-up time']")
    WebElement pickUpTime;
    public void PickUptime(){
        Reusable_Actions_POM_Loggers.clickAction(driver, pickUpTime, logger, "Click Pick-up Time Dropdown");
    }//end of clicking on Pick-up Time dropdown

    @FindBy(xpath = "//*[@aria-label='Pick-up time']")
    WebElement pickTime;
    public void PickTime(String userValue){
        Reusable_Actions_POM_Loggers.selectByTextAction(driver, pickTime, userValue, logger, "Pick 11am" );
    }//end of selecting 11am

    @FindBy(xpath = "//*[@aria-label='Drop-off time']")
    WebElement dropOffTime;
    public void DropOffTime(){
        Reusable_Actions_POM_Loggers.clickAction(driver, dropOffTime, logger, "Click Drop-off Time");
    }//end of Drop-off Time

    @FindBy(xpath = "//*[@aria-label='Drop-off time']")
    WebElement dropTime;
    public void DropTime(String userValue){
        Reusable_Actions_POM_Loggers.selectByTextAction(driver, dropTime, userValue, logger, "Select 2pm");
    }//end of selecting 2pm

    @FindBy(xpath = "//*[@data-testid='submit-button']")
    WebElement searchButton;
    public void SearchButton(){
        Reusable_Actions_POM_Loggers.clickAction(driver, searchButton, logger, "Click Search Button");
    }//end of Clicking on Search Button

    @FindBy(xpath = "//*[@name='textonly']")
    List<WebElement> optionThree;
    public void OptionThree(){
        Reusable_Actions_POM_Loggers.clickAction(driver, optionThree.get(2), logger, "Pick 3rd Option");
    }//end of Clicking on 3rd Option

    @FindBy(xpath = "//*[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary']")
    List<WebElement> firstDropOffLocation ;
    public void FirstDropOffLocation(){
        Reusable_Actions_POM_Loggers.clickAction(driver, firstDropOffLocation.get(0), logger, "Select Boston From Dropdown");
    }//end of clicking on First Drop-off Location

    @FindBy(xpath = "//*[@name='reserve-btn']")
    WebElement clickReserve;
    public void ClickReserve(){
        Reusable_Actions_POM_Loggers.clickAction(driver, clickReserve, logger, "Click Reserve");
    }//end of clicking Reserve

    @FindBy(xpath = "//*[@name='tripPreferencesRequests[0].carTripPreferencesRequest.driverName']")
    WebElement nameInput;
    public void NameInput(String userValue){
        Reusable_Actions_POM_Loggers.sendKeysAction(driver, nameInput, userValue, logger, "First & Last Name");
    }//end of First & Last Name Input

    @FindBy(xpath = "//*[@name='tripPreferencesRequests[0].carTripPreferencesRequest.phoneNumber']")
    WebElement phoneNumberInput;
    public void PhoneNumberInp0ut(String userValue){
        Reusable_Actions_POM_Loggers.sendKeysAction(driver, phoneNumberInput, userValue, logger, "Phone Number");
    }//end of Phone Number Input

    @FindBy(xpath = "//*[@name='email']")
    WebElement emailInput;
    public void EmailInput(String userValue){
        Reusable_Actions_POM_Loggers.sendKeysAction(driver, emailInput, userValue, logger, "Email");
    }//end of Email input

    @FindBy(xpath = "//*[@name='TCCheckbox']")
    WebElement checkTOUBox;
    public void CheckTOUBox(){
        Reusable_Actions_POM_Loggers.clickAction(driver, checkTOUBox, logger, "Check Terms Of Use Box");
    }//end of Click On Terms Of Use Box

    @FindBy(xpath = "//*[@id='complete-booking']")
    WebElement clickReserveBox;
    public void ClickReserveBox(){
        Reusable_Actions_POM_Loggers.clickAction(driver, clickReserveBox, logger, "Click Reserve Box");
    }//end of Click on Reserve

    @FindBy(xpath = "//*[@class='box  confirmation-detail']")
    WebElement itineraryNumberInfo;
    public void ItineraryNumberInfo(){
        String printItineraryInfo = Reusable_Actions_POM_Loggers.getTextAction(driver, itineraryNumberInfo, logger, "Print Thank You Message & Itinerary #");
        System.out.println("Itinerary number is " + printItineraryInfo);
    }//end of print Thank You & Itinerary # Info



    public void scrollDown(String scrollValue){
        Reusable_Actions_POM_Loggers.scrollAction(driver,scrollValue);
    }//end of scroll method


    public void switchTab(int index){
        Reusable_Actions_POM_Loggers.switchtotabByIndex(driver, index);
    }//end of switch tab method

    public void verifyTitle(String actualTitle){
        Reusable_Actions_POM_Loggers.verifyTitle(driver, logger, actualTitle);
    }//end of verifyTitle method


}//end of java class
