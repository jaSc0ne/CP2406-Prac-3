// Converts inches to centimeters and US gallons to litres
import java.util.Scanner;
public class MetricConversion {
    public static void main(String args[]){
        double InchesToCentimeters = 2.54;
        double USGallonsToLitres = 3.7854;
        double NumberToConvert = getNumber();
        displayInchesToCentimetersConversion(NumberToConvert,InchesToCentimeters);
        displayUSGallonsToLitresConversion(NumberToConvert, USGallonsToLitres);
    }
    public static double getNumber(){
        double NumberToConvert;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value you would like to convert: ");
        NumberToConvert = Double.parseDouble(input.next());
        return NumberToConvert;
    }
    public static void displayInchesToCentimetersConversion(double a, double b){
        System.out.println(a +" inches is: "+ a*b+" centimeters.");
    }
    public static void displayUSGallonsToLitresConversion(double a, double b){
        System.out.println(a+ " US Gallons is: "+a*b+" litres.");
    }
}
