package company;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.SortedMap;

public class _5_Charset {
    public static void main(String[] args) throws UnsupportedEncodingException {
        SortedMap<String, Charset> charsetMap = Charset.availableCharsets();
        for (String name: charsetMap.keySet()) {
            System.out.println(name);
        }
    }
}
