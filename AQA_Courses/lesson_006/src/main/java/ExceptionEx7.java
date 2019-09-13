import java.io.IOException;

public class ExceptionEx7 {

    public static void main(String args[]){
        try{
            while (true) {
              //  throw new IOException();
            }
        }
        catch(NullPointerException | OutOfMemoryError  e){
            System.out.println("In the catch clock due to Exception = ");
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("In the catch clock due to Exception = ");
        }

       /* catch(IOException | ArrayIndexOutOfBoundsException e){
            System.out.println("In the catch clock due to Exception = ");
        }*/
        catch(Exception  e){
            System.out.println("In the catch clock due to Exception = ");
            throw e;
        }


//        catch(Exception e){
//            System.out.println("In the catch clock due to Exception = "+e);
//        }

        finally{
            System.out.println("Inside the finally block");
            System.err.println("CLOSE all connections");
        }
    }
}
