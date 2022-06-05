package ActionItems;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        //Create a Arraylist for country & countryCode with for Loop
        ArrayList<String> country = new ArrayList<>();
        country.add("USA");
        country.add("Brazil");
        country.add("France");
        country.add("Bangladesh");

        ArrayList<Integer> countryCode = new ArrayList<>();
        countryCode.add(1);
        countryCode.add(55);
        countryCode.add(33);
        countryCode.add(880);

        for (int i = 0; i < countryCode.size();i++){
            System.out.println("My country is " + country.get(i) + " and my country code is " + countryCode.get(i));
        }

    }//end of main method


}//end of java class
