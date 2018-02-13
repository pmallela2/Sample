package guru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {
	static WebDriver driver = null;


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://live.guru99.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
        if (driver.getTitle().contains("Home page"))
        {
        	System.out.println("Home Page of guru99 is opened");
        }else
        {
        	System.out.println("Home Page of guru99 is not opened");
        }
        driver.findElement(By.xpath("//a[text()='Mobile']")).click();
        if (driver.getTitle().contains("Mobile"))
        {
        	System.out.println("Mobile page is opened");
        }else
        {
        	System.out.println("Mobile Page is not opened");
        }
    	System.out.println("before applying the sort by name");
        //driver.findElement(By.xpath("//select[@title='Sort By']")).click();
         String sval2 = null;
         List<String> element11 = new ArrayList<String>();
         List<String> beforeSort = new ArrayList<String>();
         List<String> afterSort = new ArrayList<String>();
	     List<WebElement> element1 = driver.findElements(By.xpath("//ul[@class='products-grid products-grid--max-4-col first last odd']/li[*]/a"));
	     //System.out.println(element1);
	     //Collections.sort(element11);
        for (WebElement myelement11 : element1)
        {
                  element11.add(myelement11.getAttribute("title"));
        }  
        		Collections.sort(element11);
   	 			Iterator itr=element11.iterator(); 
   	 		while(itr.hasNext()){  
   	 			Object objsval = itr.next();
   	 		beforeSort.add(objsval.toString());
   	 				//System.out.println(objsval);  
   	 			}  
        //System.out.println(element.size());
   	 	 List<WebElement> element = driver.findElements(By.xpath("html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select/option"));
        for (WebElement myelement : element)
        {
        	
        	//System.out.println(myelement.getText());
        	Thread.sleep(1000);
        	if(myelement.getText().equalsIgnoreCase("Name"))
        	{
        		myelement.click();
        		break;
        	}
        }
        List<WebElement> element13 = driver.findElements(By.xpath("//ul[@class='products-grid products-grid--max-4-col first last odd']/li[*]/a"));
        System.out.println("after applying the sort by name");
        for (WebElement myelement12 : element13)
        {
        	String sval = myelement12.getAttribute("title");
        	afterSort.add(sval);
        	if(sval.equalsIgnoreCase("Xperia"))
        		{
        				String sprice = driver.findElement(By.xpath("//span[@id='product-price-1']/span")).getText();
        				//System.out.println(sprice);
        				driver.findElement(By.xpath("//a[@title='Xperia']")).click();
        				//span[@class='price']
        				String sval22 = driver.findElement(By.xpath("//span[@class='price']")).getText();
        				//System.out.println(sval22);		
        				 if(sprice == sval22)
        	        		{
        					    System.out.println("Price of the product is equal");
        	        		}
        		}
        }
        
        if(beforeSort.equals(afterSort)){
        	System.out.println("sorting is successfull");
        }
       
}
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		/*for (int i = 0; i < actcounterparties.length; i++)
		{
			String actcounterparties1 = actcounterparties[i]; */
        
        /*System.out.println(myelement11.getAttribute("title"));
    	String sval = myelement11.getAttribute("title");
    	sval2 = sval.concat(sval2);
    	//String val = Arrays.sort
    	if(sval2== "XperiaSamsung GalaxyIPhone"){
    		System.out.println("Verified");
    	}
    	else{
    		System.out.println("NOt Verified");
    	}*/
    	//Thread.sleep(1000);
    	/*if(myelement11.getText().equalsIgnoreCase("IPhone"))
    	{
    		//myelement.click();
    		 //System.out.println("Iphone text got");
    	}*/
    //}
        //Arrays.sort(a)
        //List<WebElement> Select = element.findElements(By.tagName("option"));
        //dropdown("//select[@title='Sort By']/option", "Name", null);
        
      //ul[@class='products-grid products-grid--max-4-col first last odd']
     
        //System.out.println(element1.size());
      // String stval = element1.getAttribute("title");
      // System.out.println(stval);
       //String sval2 ="";
       /*for (WebElement myelement : element21)
        {
    		 ArrayList<String> element12 = new ArrayList<String>();
        	 element12.add(myelement.getAttribute("title"));
        	 Collections.sort(element12);
        	 Iterator itr=element12.iterator();  
        	 while(itr.hasNext()){  
        	 System.out.println(itr.next()); 
        	  }  
        }*/
        	/*System.out.println(myelement.getAttribute("title"));
        	String sval = myelement.getAttribute("title");
        	sval2 = sval.concat(sval2);
        	if(sval2== "XperiaSamsung GalaxyIPhone"){
        		System.out.println("Verified");
        	}
        	else{
        		System.out.println("NOt Verified");
        	}
        	//Thread.sleep(1000);
        	if(myelement.getText().equalsIgnoreCase("IPhone"))
        	{
        		//myelement.click();
        		 //System.out.println("Iphone text got");
        	}
        }*/


/*public static void dropdown(String StrXpath,String Expval,String dropdown)
{
	List<WebElement> elements = driver.findElements(By.xpath(StrXpath));
    //System.out.println(elements.size());
    
    for (WebElement myElement : elements)
      {
    	//System.out.println(myElement.getText());
    if(myElement.getText().equalsIgnoreCase(Expval))
    	{
    	         myElement.click();
    	
    	 if(StrXpath == ".//*[@id='curLocation']/optgroup[*]/option")
    		{
    		        Actions action = new Actions(driver);
    		        action.doubleClick(myElement).perform();
    		}
//                  break;
    	}
        //sval2 = sval.concat(sval2);*/
 /*     }
}*/
/*	}
}*/
