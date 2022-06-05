package ActionItems;

import java.util.ArrayList;

public class Assign_While_Conditions02 {
    public static void main(String[] args) {
        //Use an array in a while loop to print when the city is Brooklyn or Manhattan
        String[] cities = new String[]{"Brooklyn" , "Queens" , "Manhattan" , "Staten Island"};

        //initialize your starting point
        int i = 0;
        //define end of while loop.
        while (i < cities.length) {

            if (cities[i] == "Brooklyn"|| cities[i] == "Manhattan") {
                System.out.println("My cities is " + cities[i]);
            }





            //Selection of cities
            i = i + 1;
        }

    }//end of main method
}//end of Java class
