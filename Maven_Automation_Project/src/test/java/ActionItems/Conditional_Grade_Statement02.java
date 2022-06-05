package ActionItems;

import java.util.ArrayList;

public class Conditional_Grade_Statement02 {
    public static void main(String[] args) {
        // Create a Conditional Statement using grades as the value
        int grade = 85;

        if (grade >= 90 && grade <= 110) {
            System.out.println("Grade is A");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("Grade is a B");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("Grade is a C");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("Grade is a D");
        } else if (grade < 60){
            System.out.println("Grade is a F");
        }
        //end of conditions

    }//end of main method
}//end of Java class
