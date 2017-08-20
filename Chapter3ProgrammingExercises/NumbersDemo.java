public class NumbersDemo {
    public static void main(String args[]){
        int a = 2, b = 3;
        displayTwiceTheNumber(a);
        displayTwiceTheNumber(b);
        displayNumberPlusFive(a);
        displayNumberPlusFive(b);
        displayNumberSquared(a);
        displayNumberSquared(b);
    }
    public static void displayTwiceTheNumber(int a){
        System.out.println("Twice the number of "+a+" is: "+(2*a));
    }
    public static void displayNumberPlusFive(int a){
        System.out.println(a+" plus 5 is " + (a+5));
    }
    public static void displayNumberSquared(int a){
        System.out.println(a+" squared is "+(a*a));
    }
}
