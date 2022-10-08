//ID : 21CE141
//Name : Priyanshi Talaviya 
// WAP to demonstrate methods of wrapper class.
public class Pr6 {
    public static void main(String[] args) {

        // create primitive types
        int a = 5;
        double b = 5.65;

        // converts into wrapper objects
        Integer aObj = Integer.valueOf(a);
        Double bObj = Double.valueOf(b);

        if (aObj instanceof Integer) {
            System.out.println("An object of Integer is created.");
        }

        if (bObj instanceof Double) {
            System.out.println("An object of Double is created.");
        }
    }// Prepared by Priyanshi Talaviya 21CE141
}
