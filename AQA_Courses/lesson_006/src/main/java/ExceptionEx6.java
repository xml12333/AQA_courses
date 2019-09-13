import java.io.File;
import java.io.FileReader;

public class ExceptionEx6 {

    public static void main(String args[]) {

        try {
            throw new NullPointerException("demo");
            //throw new Error();
        } catch (NullPointerException e) {
            System.out.println("Caught inside fun().");
         /*   while (true){

            }*/
            throw e; // rethrowing the exception
           // System.exit(0);

        }
        finally {
            System.out.println("FINALLY");
        }
    }
}

