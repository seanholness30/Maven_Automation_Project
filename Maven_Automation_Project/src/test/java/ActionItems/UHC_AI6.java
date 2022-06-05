package ActionItems;

import ReusableLibraries.Reusable_Actions;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class UHC_AI6 {
    public static void main(String[] args) throws InterruptedException {
        //setting the local driver to reusable setDriver method
        WebDriver driver = Reusable_Actions.setDriver();

        //First Name ArrayList
        ArrayList<String> firstNames = new ArrayList<>();
        firstNames.add("Sean");
        firstNames.add("Tommy");
        firstNames.add("Itachi");

        //Last name Arraylist
        ArrayList<String> lastNames = new ArrayList<>();
        lastNames.add("Thompson");
        lastNames.add("Traumen");
        lastNames.add("Uchiha");

        //Birth month Arraylist
        ArrayList<String> birthMonth = new ArrayList<>();
        birthMonth.add("November");
        birthMonth.add("July");
        birthMonth.add("June");

        //Birthday Arraylist
        ArrayList<String> birthDay = new ArrayList<>();
        birthDay.add("30");
        birthDay.add("15");
        birthDay.add("9");

        //Birth year Arraylist
        ArrayList<String> birthYear = new ArrayList<>();
        birthYear.add("1988");
        birthYear.add("1987");
        birthYear.add("1985");

        //Zipcode Arraylist
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11210");
        zipCode.add("07204");
        zipCode.add("33136");

        //MemberId Arraylist
        ArrayList<String> memberID = new ArrayList<>();
        memberID.add("468201844");
        memberID.add("895944567");
        memberID.add("785214588");


        //initiate for loop
        for (int i = 0; i < firstNames.size(); i++) {

            //navigate to UHC webpage
            driver.navigate().to("https://www.uhc.com/");

            //Verify the home page title contains Health Insurance Plans
            Reusable_Actions.verifyTitle(driver, "Health insurance plans for individuals & families, employers, medicare | UnitedHealthcare");
            Thread.sleep(2000);

            //Click on Find a Doctor link
            Reusable_Actions.clickAction(driver, "//*[@aria-label='Find a doctor']", "Find a doctor");
            Thread.sleep(2000);

            //Click on Sign In
            Reusable_Actions.clickAction(driver, "//*[@aria-label='Sign in menu']", "Sign In");
            Thread.sleep(2000);

            //Click on Medicare Plan
            Reusable_Actions.clickAction(driver, "//*[text()='Medicare plan?']", "Medicare Plan");
            Thread.sleep(2000);

            //Switch to new tab
            Reusable_Actions.switchtotabByIndex(driver, 1);
            Thread.sleep(2000);

            //Click on Register Now
            Reusable_Actions.clickAction(driver, "//*[@class='uhc-tempo-link uhc-tempo-link--medium registerBtn ng-scope']", "Register Now");
            Thread.sleep(2000);

            //Enter First Name
            Reusable_Actions.sendKeysAction(driver, "//*[@id='firstName']", firstNames.get(i), "First Name");

            //Enter Last Name
            Reusable_Actions.sendKeysAction(driver,"//*[@id='lastName']", lastNames.get(i), "Last Name" );

            //Select Birth Month
            Reusable_Actions.selectbytextAction(driver, "//*[@id='dob_month_input']", birthMonth.get(i),"Birth Month");

            //Enter Birth Date
            Reusable_Actions.sendKeysAction(driver,"//*[@id='dob_day']", birthDay.get(i), "Select Day");

            //Enter Birth Year
            Reusable_Actions.sendKeysAction(driver, "//*[@id='dob_year']", birthYear.get(i), "Birth Year");

            //Enter Zip Code
            Reusable_Actions.sendKeysAction(driver, "//*[@id='zipCode']", zipCode.get(i), "Zip Code");

            //Enter Member ID
            Reusable_Actions.sendKeysAction(driver, "//*[@id='memberId']", memberID.get(i), "Member ID");
            Thread.sleep(2000);

            //Click Continue
            Reusable_Actions.clickAction(driver, "//*[@id='submitBtn']","Click Continue");

            //Capture Error Message
            String errorMessage = Reusable_Actions.getTextAction(driver, "//*[@id='plainText_error']", "Error Message");
            System.out.println("The error message is " + errorMessage);

            //Close the Driver
            driver.close();

            //Switch back to default tab
            Reusable_Actions.switchtotabByIndex(driver, 0);


        }//End of for loop

        //Quit the driver
        driver.quit();


    }//end of main method

}//end of java class
