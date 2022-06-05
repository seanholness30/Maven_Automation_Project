package Day12_060422;

import ReusableClassess.Reusable_Actions_Loggers;
import ReusableClassess.Reusable_Annotations_Class;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Boolean_With_Yahoo_Checkbox extends Reusable_Annotations_Class {


    @Test(priority = 1)
    public void Yahoo_Stay_Signed_In_Checkbox_Verification(){
        //navigate to usps
        driver.navigate().to("https://www.yahoo.com");
        //click on Sign in
        Reusable_Actions_Loggers.clickAction(driver,"//*[text()='Sign in']",logger,"Sign In");
        //verify the stay signed in checkbox is selected or not
        WebDriverWait wait = new WebDriverWait(driver,10);
        Boolean elementState = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='checkbox']"))).isSelected();
        System.out.println("Is element checked? " + elementState);
        if(elementState == true){
            logger.log(LogStatus.PASS,"Checkbox is selected as expected");
        } else {
            logger.log(LogStatus.FAIL,"Checkbox is not selected");
        }
    }//end of test

    @Test(priority = 2)
    public void NavigatetoYahooHomepage(){
        //navigate to Yahoo
        logger.log(LogStatus.INFO, "Navigating to Home page");
        driver.navigate().to("https://www.yahoo.com");

    }//End of test


}//end of java class
