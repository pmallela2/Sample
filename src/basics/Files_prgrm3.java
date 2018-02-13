package basics;

import java.io.File;

public class Files_prgrm3 {

	public static void main(String[] args) {
		      String directoryname = "C:\\Users\\pmallela2\\Desktop\\Selenium_Tutorials";
	          File directory=new File(directoryname);
	          File[] fl = directory.listFiles();
	          for(File file:fl)
	          {
	        	 if(file.isFile())
	        	 {
	        	     System.out.println(file.getName());
	        	 }else if(file.isDirectory()){
	        		 //System.out.println(file.getName());
	        	 }
	          }
	          
	}

}



