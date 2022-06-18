package Delta_PageObject_TravelRequire;

import ReusableClassess.Reusable_Actions_POM_Loggers;
import ReusableClassess.Reusable_Annotations_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AI07_Delta_TravelRequire extends Reusable_Annotations_Class {
    //Declare the ExtentTest for each object class
    ExtentTest logger;

    //Create a constructor method that will reference the same name as your class, you can make your
    //page object class methods static when you call it in your test class
    public AI07_Delta_TravelRequire(WebDriver driver){
        //page factory function for page object
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations_Class.logger;
    }//end of constructor

    //define all the webElements using @find by concept


    @FindBy(xpath = "//*[@class='list-inline-item ng-star-inserted']")
    WebElement helpCenter;
    public void HelpCenter(){
        Reusable_Actions_POM_Loggers.clickAction(driver, helpCenter, logger, "Click Help Center");
    }//end of Click Help Center

    @FindBy(xpath = "//*[@class='card-descriptiontxt pr-sm-4 pr-md-0']")
    WebElement travelRequire;
    public void TravelRequire(){
        Reusable_Actions_POM_Loggers.clickAction(driver, travelRequire, logger, "Click Travel Requirement Guide");
    }//end of Click Travel Requirement Guide

    @FindBy(xpath = "//*[@id='maincontent']")
    WebElement travelRequirementInfo;
    public void TravelRequirementInfo(){
        String printTravelRequirementInfo = Reusable_Actions_POM_Loggers.getTextAction(driver, travelRequirementInfo, logger, "Print Travel Requirement Info");
        System.out.println("Travel Requirement is " + printTravelRequirementInfo);
    }//end of print Flight info



    public void switchTab(int index){
        Reusable_Actions_POM_Loggers.switchtotabByIndex(driver,index);
    }//end of switch tab method


    public void scrollDown(String scrollValue){
        Reusable_Actions_POM_Loggers.scrollAction(driver,scrollValue);
    }//end of scroll method



}//end of java class
