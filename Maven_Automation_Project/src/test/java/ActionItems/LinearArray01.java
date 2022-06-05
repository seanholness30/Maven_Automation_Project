package ActionItems;

public class LinearArray01 {
    public static void main(String[] args) {
        //Create a Linear Array for Region & Area Code using while loop
        String[] region = new String[] {"Brooklyn", "Boston", "Dallas", "Fairfax"};
        int [] areaCode = new int[]{718,617,570,703};

        int i = 0;
        while (i < areaCode.length){
            System.out.println("My region is " + region[i] + " and my area code is " + areaCode[i]);

           //incrementing
            i = i +1;

        }

    }//end of main method
}//end of java class
