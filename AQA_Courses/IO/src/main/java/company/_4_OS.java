package company;

import java.io.*;

public class _4_OS {

    public static void main(String[] args) throws IOException {
        String fileFromName = "/Users/romantyshchenko/Course_QA_Auto/AQA_Courses/IO/src/main/resources/file_io.png";
        String fileToName = "/Users/romantyshchenko/Course_QA_Auto/AQA_Courses/IO/src/main/resources/file_io2.png";

        InputStream in = null;
        OutputStream out = null;

        try {
            in = new FileInputStream(fileFromName);
            out = new FileOutputStream(fileToName);
            long startTime  = System.currentTimeMillis();
            copy(in, out);
            long stopTime = System.currentTimeMillis();
            System.out.println("Result time is: " + (stopTime - startTime));
        } catch (IOException e) {
            throw new IOException("Exception when copy from " + fileFromName + " to " + fileToName);
        } finally {
            closeQuitly(in);
            closeAndFlushQuitly(out);
        }
    }
                                // flush()
    public static void copy(InputStream in, OutputStream out) throws IOException {
        byte[] buff = new byte[1024];
       // byte[] buff = new byte[1];
        int count;
        while ((count = in.read(buff)) != -1) {
            out.write(buff, 0, count);
        }
    }

    private static void closeAndFlushQuitly(OutputStream out) throws IOException {
        if (out != null) {
            try {
                out.flush();

            } catch (IOException ignore) { /*NOP*/ }

            try {
                out.close();
            } catch (IOException ignore) { /*NOP*/ }
        }
    }

    private static void closeQuitly(InputStream in) {
        if (in != null) {
            try {
                in.close();
            } catch (IOException ignore) { /*NOP*/ }
        }
    }
}
