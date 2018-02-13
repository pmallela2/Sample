package basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filesprgrm2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader objfile = new FileReader("C:\\Users\\pmallela2\\Desktop\\selenium_xpath.txt");
        BufferedReader obj = new BufferedReader(objfile);
        StringBuffer objbuffer = new StringBuffer();
        String i = null;  
        while((i=obj.readLine())!=null)
          {
        	  objbuffer.append(i);
        	  objbuffer.append("\n");
          }
     String val = objbuffer.toString();
     int lngth = val.length();
     for(int j=0;j<lngth;j++)
     {
    	 System.out.println(); 
     }
	}

}
