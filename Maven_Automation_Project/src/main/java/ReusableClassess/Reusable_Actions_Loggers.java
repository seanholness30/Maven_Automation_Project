package ReusableClassess;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class Reusable_Actions_Loggers {

    //set a static timeout variable so i t can cover all explicit for all methods
    public static int timeout = 15;


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
    public static void mouseHover(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        Actions actions = new Actions(driver);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            actions.moveToElement(element).perform();
            logger.log(LogStatus.PASS, "Successfully hovered on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to hover on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to hover on element " + elementName + " " + e);
        }
    }//end of mouseHover


    //create a click method
    public static void clickAction(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            element.click();
            logger.log(LogStatus.PASS, "Successfully clicked on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to click on element " + elementName + " " + e);
        }
    }//end of clickAction

    //create a Submit Method
    public static void submitAction(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            element.submit();
            logger.log(LogStatus.PASS, "Successfully submit on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to submit on element " + elementName + " " + e);
        }
    }//end of SubmitAction


    //create a send keys method
    public static void sendKeysAction(WebDriver driver, String xpath, String userValue, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            element.click();
            element.clear();
            element.sendKeys(userValue);
            logger.log(LogStatus.PASS, "Successfully enter user value on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to enter user value on element " + elementName + " " + e);
        }
    }//end of send keys method


    //create a selectByText method
    public static void selectByTextAction(WebDriver driver, String xpath, String userValue, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            Select select = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))));
            select.selectByVisibleText(userValue);
            logger.log(LogStatus.PASS, "Successfully able to select by text in drop-down " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to select by text in drop-down " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to select by text in drop-down " + elementName + " " + e);
        }
    }//end of selectByTextActions


    //create a getText method
    public static String getTextAction(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        String result = null;
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            result = element.getText();
            logger.log(LogStatus.PASS, "Successfully capture text on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to capture text on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to capture text on element " + elementName + " " + e);
        }
        return result;
    }//end of getTextAction method


    //create a getText method by index
    public static String getTextByIndex(WebDriver driver, String xpath, int indexNumber, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        String result = null;
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath))).get(indexNumber);
            result = element.getText();
            logger.log(LogStatus.PASS, "Successfully able to get text " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to get text " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to get text on element " + elementName + " " + e);
        }
        return result;
    }//end of getText method by index


    //create a click by index method
    public static void clickByIndexAction(WebDriver driver, String xpath, int indexNumber, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath))).get(indexNumber);
            element.click();
            logger.log(LogStatus.PASS, "Successfully able to click by index" + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click by Index " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to click by Index" + elementName + " " + e);
        }
    }//end of clickByIndexAction


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
        WebDriverWait wait = new WebDriverWait(driver, 10);
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


}//end of java class