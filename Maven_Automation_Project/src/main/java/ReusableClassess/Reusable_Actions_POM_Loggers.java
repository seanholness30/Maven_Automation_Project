package ReusableClassess;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.ArrayList;

public class Reusable_Actions_POM_Loggers {

    //set a static timeout variable so i t can cover all explicit for all methods
    public static int timeout = 10;


    //resuable function for webdriver as a return method
    public static WebDriver setDriver() {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximize/fullscreen your driver
        options.addArguments("start-maximized");
        //for mac use full screen
        //options.addArguments("start-fullscreen");
        //define the webdriver I am going to use
        WebDriver driver = new ChromeDriver(options);
        return driver;
    }//end of setDriver method


    //create a mouse hover method
    public static void mouseHover(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        Actions actions = new Actions(driver);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            actions.moveToElement(element).perform();
            logger.log(LogStatus.PASS, "Successfully hovered on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to hover on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to hover on element " + elementName + " " + e);
            getScreenShot(driver,elementName,logger);
        }
    }//end of mouseHover


    //create a click method
    public static void clickAction(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            element.click();
            logger.log(LogStatus.PASS, "Successfully clicked on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to click on element " + elementName + " " + e);
            getScreenShot(driver,elementName,logger);
        }
    }//end of clickAction

    //create a Submit Method
    public static void submitAction(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            element.submit();
            logger.log(LogStatus.PASS, "Successfully submit on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to submit on element " + elementName + " " + e);
            getScreenShot(driver,elementName,logger);
        }
    }//end of SubmitAction


    //create a send keys method
    public static void sendKeysAction(WebDriver driver, WebElement xpath, String userValue, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            element.click();
            element.clear();
            element.sendKeys(userValue);
            logger.log(LogStatus.PASS, "Successfully enter user value on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to enter user value on element " + elementName + " " + e);
            getScreenShot(driver,elementName,logger);
        }
    }//end of send keys method


    //create a selectByText method
    public static void selectByTextAction(WebDriver driver, WebElement xpath, String userValue, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            Select select = new Select(wait.until(ExpectedConditions.visibilityOf(xpath)));
            select.selectByVisibleText(userValue);
            logger.log(LogStatus.PASS, "Successfully able to select by text in drop-down " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to select by text in drop-down " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to select by text in drop-down " + elementName + " " + e);
            getScreenShot(driver,elementName,logger);
        }
    }//end of selectByTextActions


    //create a getText method
    public static String getTextAction(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        String result = null;
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            result = element.getText();
            logger.log(LogStatus.PASS, "Successfully capture text on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to capture text on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to capture text on element " + elementName + " " + e);
            getScreenShot(driver,elementName,logger);
        }
        return result;
    }//end of getTextAction method


    //create a Scroll pixel Method
    public static void scrollAction(WebDriver driver, String scrollValue) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript(scrollValue);
    }//end of scroll Action


    //create a Verify Title Method
    public static void verifyTitle(WebDriver driver, ExtentTest logger, String actualTitle) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        String Title = driver.getTitle();
        if (Title.equals(actualTitle)) {
            System.out.println("Titles Matches. Title is " + Title);
            logger.log(LogStatus.PASS, "Title Matches. Title is " + actualTitle);
        } else {
            System.out.println("Title does not match. Actual title is " + Title);
            logger.log(LogStatus.FAIL, "Title does not match. Actual title is " + actualTitle);
        }//end of conditions
    }//end of verifying title method


    //create a Switch to Tab By Index
    public static void switchtotabByIndex(WebDriver driver, int indexNumber) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(indexNumber));
    }//End of Switch to Tab By Index


    //Create Verify the Status of Element
    public static void verifyStatusOfElement(WebDriver driver, String xpath, Boolean expectedStatus, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        try {
            Boolean actualStatus = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='checkbox']"))).isSelected();
            if (expectedStatus == actualStatus) {
                logger.log(LogStatus.PASS, "Element is selected as expected");
            } else {
                logger.log(LogStatus.FAIL, "Element is not selected");
            }
        } catch (Exception e) {
            System.out.println("Element  " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Element" + elementName + " " + e);
        }
    }//End of Verify the Status of Element

    //method to capture screenshot when logger fails
    public static void getScreenShot(WebDriver driver,String imageName,ExtentTest logger) {
        try {
            String fileName = imageName + ".png";
            String directory = null;
            String snPath = null;
            directory = "src/main/java/HTML_Report/Screenshots/";
            snPath = "Screenshots//";
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File(directory + fileName));
            //String imgPath = directory + fileName;
            String image = logger.addScreenCapture(snPath + fileName);
            logger.log(LogStatus.FAIL, "", image);
        } catch (Exception e) {
            logger.log(LogStatus.FAIL, "Error Occured while taking SCREENSHOT!!!");
            e.printStackTrace();
        }
    }//end of getScreenshot method


}//end of java class