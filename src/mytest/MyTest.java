package mytest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;





public class MyTest {
  public static void main(String[] args) throws IOException {
   File file = new File("D:/test.txt");
   InputStream in = new FileInputStream(file);
   InputStreamReader inReader = new InputStreamReader(in,"gbk");
   BufferedReader bReader = new BufferedReader(inReader);
   
   File outFile = new File("D:/test1.txt");
   OutputStream out = new FileOutputStream(outFile);
   
   String str = null;
   byte[] rn = "\r\n".getBytes("utf-8");
   while ((str = bReader.readLine()) != null) {
    byte[] b = str.getBytes("utf-8");
    out.write(b);
    out.write(rn);
  }
   
   bReader.close();
   inReader.close();
   in.close();
   out.close();
  }
}
