// This program assigns values to two variables and performs mathematical operations with them
public class FixDebugFour1 {
    public static void main(String args[]){
        int x = 5;
        int y = 8;
        System.out.println("Adding "+x+" and "+y+" equals "+(x+y));

        int z = 19;
        System.out.println("Subtracting "+y+" from "+z+" equals "+(z-y));

        System.out.println("Dividing "+z+" by "+x+ " equals "+(z/x)+" remainder "+(z%x));
        System.out.println("Multiplying "+x+" by "+z+" equals "+(x*z));
    }
}
