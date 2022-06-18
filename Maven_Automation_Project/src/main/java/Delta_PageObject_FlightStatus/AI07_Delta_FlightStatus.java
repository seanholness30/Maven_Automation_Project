package Delta_PageObject_FlightStatus;

import ReusableClassess.Reusable_Actions_POM_Loggers;
import ReusableClassess.Reusable_Annotations_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AI07_Delta_FlightStatus extends Reusable_Annotations_Class {
    //Declare the ExtentTest for each object class
    ExtentTest logger;

    //Create a constructor method that will reference the same name as your class, you can make your
    //page object class methods static when you call it in your test class
    public AI07_Delta_FlightStatus(WebDriver driver){
        //page factory function for page object
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations_Class.logger;
    }//end of constructor

    //define all the webElements using @find by concept

    @FindBy(xpath = "//*[@id='headPrimary4']")
    WebElement flightStatus;
    public void FlightStatus(){
        Reusable_Actions_POM_Loggers.clickAction(driver, flightStatus, logger, "Click on Flight Status");
    }//end of clicking on flight status

    @FindBy(xpath = "//*[@id='calDepartLabelCont']")
    WebElement searchByDate;
    public void SearchByDate(){
        Reusable_Actions_POM_Loggers.clickAction(driver,searchByDate,logger, "Click Search Date");
    }//end of clicking Search Date

    @FindBy(xpath = "//*[@aria-label='16 June 2022, Thursday']")
    WebElement selectDate;
    public void SelectDate(){
        Reusable_Actions_POM_Loggers.clickAction(driver, selectDate, logger, "Select June 16, 2022");
    }//end of date selection

    @FindBy(xpath = "//*[@aria-label='done']")
    WebElement doneClick;
    public void DoneClick(){
        Reusable_Actions_POM_Loggers.clickAction(driver, doneClick, logger, "Click Done Button");
    }//end of clicking on done Button

    @FindBy(xpath = "//*[@id='flightNo']")
    WebElement flightNumField;
    public void FlightNumField(){
        Reusable_Actions_POM_Loggers.clickAction(driver, flightNumField, logger, "Click Flight # Field");
    }//end of clicking Flight # field

    @FindBy(xpath = "//*[@name='flightNumber']")
    WebElement flightNum;
    public void FlightNum(String userValue){
        Reusable_Actions_POM_Loggers.sendKeysAction(driver, flightNum, userValue, logger, "Enter Flight #");
    }//end of send keys action

    @FindBy(xpath = "//*[@id='btn-flight-sts-submit']")
    WebElement submitButton;
    public void SubmitButton(){
        Reusable_Actions_POM_Loggers.clickAction(driver, submitButton, logger, "Click submit");
    }//end of Submit Button

    @FindBy(xpath = "//*[@class='col-xl-4 col-lg-4 col-md-12 col-sm-12 col-12 datapanel inverse-white first datapanelfont']")
    WebElement flightInfo;
    public void FlightInfo(){
    String printFlightInfo = Reusable_Actions_POM_Loggers.getTextAction(driver, flightInfo,logger, "Print Flight Info");
    System.out.println("Flight is " + printFlightInfo);
    }//end of print Flight Info











}//end of java  class
