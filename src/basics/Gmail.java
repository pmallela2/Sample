package basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail {
	static WebDriver driver = null;    
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			driver = new FirefoxDriver();
			driver.get("http://www.timesjobs.com");
			WebElement element = null;
			WebDriverWait wait = new WebDriverWait(driver, 100);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/a[text()='Register']")));
		     register();
	        //element = driver.findElement(By.xpath("//select[@class='fnt11 pad2']"));
	        //List<WebElement> elements = element.findElements(By.tagName("option"));
	        
	       // driver.findElement(By.xpath(".//*[@id='curLocation']")).click();
	       // List<WebElement> selectElement = driver.findElements(By.xpath(strXpath));

	        //List<WebElement> webElement = driver.findElements(By.xpath(".//*[@id='curLocation']/optgroup/option"));
	        
	        //List<WebElement> webElement=driver.findElements(By.xpath(".//*[@id='curLocation']/optgroup[contains(@label,'Metros')]/option"));
	        
	       /* WebElement elem = driver.findElement(By.xpath("//select[@name='curLocation']"));
	        List<WebElement> selectElement = elem.findElements(By.tagName("option"));
	       
	        //List<WebElement> selectElement = driver.findElements(By.xpath("//select[@name='curLocation']"));
	        //System.out.println(selectElement.size());
	         
	        for (WebElement reqElement : selectElement)
	          {
	        if(reqElement.getText().equalsIgnoreCase("guntakal"))
	        	{
	        		Actions action = new Actions(driver);
	        		action.doubleClick(reqElement).perform();
	        	}
	          }*/
	        
	}
	public static void dropdown(String StrXpath,String Expval,String dropdown)
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
//                      break;
        	}
            
          }
	}
	public static void register() throws InterruptedException
	  {
		    driver.findElement(By.xpath("//li/a[text()='Register']")).click();
            driver.findElement(By.id("emailAdd")).sendKeys("Praveen Ram");
            driver.findElement(By.id("passwordField")).sendKeys("Praveen433");
            driver.findElement(By.id("retypePassword")).sendKeys( "Praveen433");
            driver.findElement(By.id("mobNumber")).sendKeys("7207283130");
            driver.findElement(By.xpath("//*[@id='jobfuncDiv']")).click();
            dropdown(".//*[@id='funcAreaMultiId']/ul/li[*]", "Retail Services", null);
            driver.findElement(By.xpath(".//*[@id='curLocation']")).click();
           dropdown(".//*[@id='curLocation']/optgroup[*]/option", "guntakal", null);
           Thread.sleep(2000);
          //WebElement element = driver.findElement(By.xpath(".//fieldset/div/span[@id='uploadResume_basic']/input[@id='resumeFile_basic']"));
           WebElement element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/section/form/div[6]/div[7]/fieldset/div[1]/span[1]/input"));
           //html/body/div[1]/div[1]/div/section/form/div[6]/div[7]/fieldset/div[1]/span[1]/input
           Actions act = new Actions(driver);
          //act.moveToElement(element).doubleClick().build().perform();
           act.doubleClick(element).perform();
           //driver.findElement(By.xpath(".//*[@id='basicUploadDiv']/fieldset/div[1]/span/input[@id='resumeFile_basic']")).click();
           //driver.findElement(By.xpath("(//html/body/div[3]/input")).click();
          //WebElement element = driver.findElement(By.xpath("//input[@id='resumeFile_basic']"));
          //element.click();
           //driver.findElement(By.id("html/body/div[3]")).click();
           //.sendKeys("C:\\Users\\pmallela2\\Desktop\\teamsw.docx");
          /* Actions actions = new Actions(driver);
          actions.moveToElement(element).perform();*/
          //Thread.sleep(3000);
           //C:\Users\pmallela2\Desktop
      
          /*((Locatable) element).getCoordinates().inViewPort();
          try {
              element.click();
          } catch (Exception e) {
              new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
              element.click();
          }*/
          
          //JavascriptExecutor jse = (JavascriptExecutor)driver;

          //jse.executeScript("arguments[0].scrollIntoView()", element);
          
          //JavascriptExecutor js = (JavascriptExecutor) driver;
          //js.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);", findElement(element));
          
             /*Actions action = new Actions(driver);
	         action.doubleClick(elem).perform();*/
	   }
}


