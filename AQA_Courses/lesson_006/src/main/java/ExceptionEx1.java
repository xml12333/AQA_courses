
public class ExceptionEx1 {

    public static void main(String args[])
    {
        try {
            String a = null; //null value
            System.out.println(a.charAt(0));
        } catch(NullPointerException e) {
            System.out.println("NullPointerException..");
            e.printStackTrace();
            System.out.println("sdfghjkl;");
        }
    }
}
