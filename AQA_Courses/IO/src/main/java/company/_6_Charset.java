package company;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

// NIO

public class _6_Charset {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte [] rawData = new byte[256];
        for (int k = 0; k < 256; k++) {
            rawData[k] = (byte) (k-128);
        }
        for (String name: Charset.availableCharsets().keySet()){
            System.out.println(new String (rawData, name));
            System.out.println("\n\n\n");
        }
    }
}
