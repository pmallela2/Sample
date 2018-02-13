package basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.Reader;  
public class Files_prgrm {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
	              try{    
	                //FileInputStream fin=new FileInputStream("C:\\Users\\pmallela2\\Desktop\\selenium_xpath.txt"); 
	            	  //File objfile = new File("C:\\Users\\pmallela2\\Desktop\\selenium_xpath.txt");
	            FileReader obj1 = new FileReader("C:\\Users\\pmallela2\\Desktop\\selenium_xpath.txt");
	            BufferedReader onj = new BufferedReader(obj1);
	            StringBuffer stringbuffer = new StringBuffer();
	            String i=null;
	                while((i=onj.readLine())!=null){    
	                	stringbuffer.append(i);
	                	stringbuffer.append("\n");
	                }
                          obj1.close();
	                    System.out.println("Contents of file");
	                    System.out.println(stringbuffer.toString());
	              }catch(Exception e){System.out.println(e);}    
	             }
	}

//Phani Program

/*FileInputStream inputStream = new FileInputStream("C:\\Users\\sphanim\\Desktop\\DocumentRegardingSwaggerRelationShipBetweenElements.txt");
try {
    String everything = IOUtils.toString(inputStream);
    System.out.println(everything);
} finally {
    inputStream.close();
}*/


//**********************StringBuffer and String**********************

/*StringBuffer i1=new StringBuffer("Praveen");
   i1.append("Phani");*/
/*String i="Praveen";
String j="";i="Phani";
System.out.println(i);       
// int l=obj1.read();
//System.out.println(l);
// System.out.println(obj1.);
//int i=0;

//System.out.println(i1);

      //fin.read(b)
    /*for(int i=0;i<=fin.read();i++)
    {*/
//System.out.print((char)i);
//j=j+i+"\n";
//j=j.concat(i)+"\n";
//System.out.println(j);


/*String demo = "hello";
//demo = "bye";
//demo.concat("bye");
demo.concat("bye");
System.out.println(demo);

StringBuffer objstr = new StringBuffer("world");
objstr.append("hii");
System.out.println(objstr)*/;
