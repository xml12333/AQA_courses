package company;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class _0_ISTest {
    public static void main(String[] args) throws IOException {

        // Three different Streams  -> IS
        InputStream inFile = new FileInputStream("/Users/romantyshchenko/Course_QA_Auto/AQA_Courses/IO/src/main/resources/text.txt");
        readFullyByByte(inFile);
        System.out.print("\n\n\n"  );

        InputStream inUrl = new URL("http://google.com").openStream();
        readFullyByByte(inUrl);
        System.out.print("\n\n\n");

        InputStream inArray = new ByteArrayInputStream(new byte[]{65, 66, 67, 68});
        readFullyByByte(inArray);
        System.out.print("\n\n\n");
    }
                                       // Methods
    public static void readFullyByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }
}
