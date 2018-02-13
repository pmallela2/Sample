package basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class File_folder {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
           /*File obj = new File("C:\\");
           File[] f1 = obj.listFiles();
           for(File x:f1)
           {
        	   if(x.isFile())
        	   {
        	       //System.out.println(x.getName());
        	   }else if(x.isDirectory()){
        		   //System.out.println(x);
        		   String fldrname = x.getName();
        		   if (fldrname.equalsIgnoreCase("Users"))
        		   {
        			   File[] f2 = x.listFiles();
        	        		      for(File y:f2)
        	        		      {
        	        		    	  System.out.println(y.getName());
        	        		      } 
        		   }
        	   }
           }*/
		//IOUtils contains utility methods dealing with reading, writing and copying. The methods work on InputStream, OutputStream, Reader and Writer. 
		/*FileInputStream inputStream = new FileInputStream("C:\\Users\\pmallela2\\Desktop\\selenium_xpath.txt");
		try {
		    String everything = IOUtils.toString(inputStream);
		    System.out.println(everything);
		} finally {
		    inputStream.close();
		}*/
		
/*		 The FileUtils class contains utility methods for working with File objects. These include reading, writing, copying and comparing files.

		 For example to read an entire file line by line you could use: */
		
		 File file = new File("C:\\Users\\pmallela2\\Desktop\\selenium_xpath.txt");
		 List lines = FileUtils.readLines(file, "UTF-8");
		  System.out.println(lines);
	}

}
