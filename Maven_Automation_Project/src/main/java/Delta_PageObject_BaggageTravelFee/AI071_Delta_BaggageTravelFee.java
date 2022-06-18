package Delta_PageObject_BaggageTravelFee;

import ReusableClassess.Reusable_Actions_POM_Loggers;
import ReusableClassess.Reusable_Annotations_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AI071_Delta_BaggageTravelFee extends Reusable_Annotations_Class {
    //Declare the ExtentTest for each object class
    ExtentTest logger;

    //Create a constructor method that will reference the same name as your class, you can make your
    //page object class methods static when you call it in your test class
    public AI071_Delta_BaggageTravelFee(WebDriver driver){
        //page factory function for page object
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations_Class.logger;
    }//end of constructor

    //define all the webElements using @find by concept

    @FindBy(xpath = "//*[text()='Checked Baggage Fees']")
    WebElement checkedBaggageFees;
    public void CheckedBaggageFees(){
        Reusable_Actions_POM_Loggers.clickAction(driver, checkedBaggageFees, logger, "Click Checked Baggage Fees");
    }// end of clicking on Checked Baggage Fees

    @FindBy(xpath = "//*[text()='Travel Changes']")
    WebElement travelChanges;
    public void TravelChanges(){
        Reusable_Actions_POM_Loggers.clickAction(driver, travelChanges, logger, "Click Travel Changes");
    }//end of clicking Travel Changes

    @FindBy(xpath = "//*[text()='Carry-On Baggage']")
    WebElement carryOnBaggage;
    public void CarryOnBaggage(){
        Reusable_Actions_POM_Loggers.clickAction(driver, carryOnBaggage, logger, "Click Carry-ON Baggage");
    }//end of clicking Travel Changes

    @FindBy(xpath = "//*[text()='Travel Services']")
    WebElement travelServices;
    public void TravelServices(){
        Reusable_Actions_POM_Loggers.clickAction(driver, carryOnBaggage, logger, "Click Carry-ON Baggage");
    }//end of clicking Travel Services

    public void scrollUp(String scrollValue){
        Reusable_Actions_POM_Loggers.scrollAction(driver,scrollValue);
    }//end of scroll method


}//end of java class
