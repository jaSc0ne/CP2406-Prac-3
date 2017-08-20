public class Billing {
    final static double TAX = 1.08;
    public static void main(String args[]){
       double photoBookPrice1 = 20.50;
       double photoBookPrice2 = 15.80;
       int booksQuantity = 6;
       double totalDue;
       final double couponValue = 14.60;

       totalDue = computeBill(photoBookPrice1);
       System.out.println("The total for a photobook that costs $"+photoBookPrice1+" is $"+totalDue);
       totalDue = computeBill(photoBookPrice2, booksQuantity);
       System.out.println("The total for "+booksQuantity+" photobooks that cost $"+photoBookPrice1+" each is $"+totalDue);
       totalDue = computeBill(photoBookPrice2, booksQuantity, couponValue);
       System.out.println("The total for "+booksQuantity+" photobooks that costs $"+photoBookPrice1+" each with a $"+couponValue+" coupon" +
               " is $"+totalDue);
    }
    public static double computeBill(double i){
        double totalDue = i*TAX;
        return totalDue;
    }
    public static double computeBill(double i, int b){
        double totalDue = (i*b)*TAX;
        return totalDue;
    }
    public static double computeBill(double i, int b, double x){
        double totalDue = ((i*b)-x)*TAX;
        return totalDue;
    }
}
