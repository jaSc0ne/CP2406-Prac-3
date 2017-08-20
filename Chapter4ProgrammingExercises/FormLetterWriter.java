public class FormLetterWriter {
    public static void main(String args[]){

        displaySalutation("Paix");
        displayLetter();
        displaySalutation("Jason", "Paix");
        displayLetter();
    }
    public static void displaySalutation(String lastName){
        System.out.println("Dear Mr. or Mrs. "+lastName+",");
    }
    public static void displaySalutation(String firstName, String lastName){
        System.out.println("Dear "+firstName+" "+lastName+",");
    }
    public static void displayLetter(){
        System.out.println("\tThank you for your recent order.\n");
    }
}
