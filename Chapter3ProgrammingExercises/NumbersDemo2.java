import java.util.Scanner;
public class NumbersDemo2 {
    public static void main(String args[]){
        int a = getNumber(), b = getNumber();
        displayTwiceTheNumber(a);
        displayTwiceTheNumber(b);
        displayNumberPlusFive(a);
        displayNumberPlusFive(b);
        displayNumberSquared(a);
        displayNumberSquared(b);
    }
    public static int getNumber(){
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer value ");
        number = Integer.parseInt(input.next());
        return number;
    }
    public static void displayTwiceTheNumber(int a){
        System.out.println("Twice the number of "+a+" is: "+ (2*a));
    }
    public static void displayNumberPlusFive(int a){
        System.out.println(a+" plus 5 is: "+(a+5));
    }
    public static void displayNumberSquared(int a){
        System.out.println(a+" squared is: "+(a*a));
    }
}
