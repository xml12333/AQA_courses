public class ExceptionEx4 {

    public static void main(String args[]){
        try{
            int d = 0;
            int n =20;
            int fraction = n/d;

        }
        catch(ArithmeticException | OutOfMemoryError e){
            System.out.println("In the catch clock due to Exception = ");
        }
        catch(Exception e){
            System.out.println("In the catch clock due to Exception = "+e);
        }

        finally{
            System.out.println("Inside the finally block");
            System.err.println("CLOSE all connections");
        }
    }
}
