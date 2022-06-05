package ActionItems;

import java.util.ArrayList;

public class Assign_For_Conditions02 {
    public static void main(String[] args) {
        //Use an array in a for loop to print when the city is Brooklyn or Manhattan
        ArrayList<String>cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Manhattan");
        cities.add("Staten Island");

        for (int i =0; i < cities.size(); i++){
            if (cities.get(i) == "Brooklyn"){
                System.out.println("My cities is " + cities.get(i));
            } else if(cities.get(i) == "Manhattan"){
                System.out.println("My cities is " + cities.get(i));
            }


        }//end of for loop

    }//end of main method
}//end of java class
