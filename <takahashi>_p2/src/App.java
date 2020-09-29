import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static double getUserHeight(){
        System.out.println("What is your Height? (in inches)");
        Scanner height = new Scanner(System.in);
        return height.nextDouble();
    }

    public static double getUserWeight(){
        System.out.println("What is your Weight? (in inches)");
        Scanner weight = new Scanner(System.in);
        return weight.nextDouble();
    }

    public static boolean moreInput() {
        System.out.println("Do you want to calculate more BMI? (y/n)");
        Scanner response = new Scanner(System.in);
        char resp = response.next().charAt(0);
        if (resp == 'y') {
            return true;
        }
        else {
            return false;
        }

    }

    public static double displayBmiInfo(double bmi){
        System.out.println("Underweight < 18.5");
        System.out.println("Normal weight = 18.5–24.9");
        System.out.println("Overweight = 25–29.9");
        System.out.println("Obesity >= 30");
        System.out.println("Your BMI is: ");
        return bmi;
    }

    public static double displayBmiStatistics(double bmiData){
        System.out.println("Results: ");
        System.out.println(bmiData);
        System.out.println();
        return bmiData;
    }

    public static void main(String[] args) {
        ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

        while (moreInput()) {
            double height = getUserHeight();
            double weight = getUserWeight();

            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);

            displayBmiInfo(bmi);
        }

        displayBmiStatistics(bmiData);
    }
}
