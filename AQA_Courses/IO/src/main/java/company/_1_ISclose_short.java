package company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class _1_ISclose_short {

    public static void main(String[] args) throws IOException {
        String fileName  = "/Users/romantyshchenko/Course_QA_Auto/AQA_Courses/IO/src/main/resources/text.txt";
        // out of try
        InputStream inFile =  null;

        try {
            inFile = new FileInputStream(fileName);
            readFullyByByte(inFile);
        } catch (IOException e) {
            // add exception message
            throw new IOException("Exception when open and read file" + fileName);
        } finally {
            if (inFile != null ) {
                try {
                    inFile.close();
                } catch (IOException ignore){
                }
            }
        }


    }
    public static void readFullyByByte (InputStream in) throws IOException {
        int oneByte;
        while ((oneByte = in.read()) != -1) {
            System.out.print((char) oneByte);
        }
    }

    private static void closeFile(InputStream inFile) {
        if (inFile != null ) {
            try {
                inFile.close();
            } catch (IOException ignore){
            }
        }
    }
}
