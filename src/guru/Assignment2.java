package guru;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
            WebDriver driver = null;
            driver = new FirefoxDriver();
            driver.get("http://live.guru99.com");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//a[text()='Mobile']")).click();
            List<WebElement> phonenames = driver.findElements(By.xpath("//ul[@class='products-grid products-grid--max-4-col first last odd']/li/a"));
            int size = phonenames.size();
            int i = 1;
            for(WebElement element1 : phonenames)
            {
            	 String name = element1.getAttribute("title");
            	 System.out.println(name);
            	 boolean isTrue = false;
            	switch(name){
            	    case "Xperia":
            	    	String cart = String.format("//li[%d]//button[@title='Add to Cart']", i);
            	    	driver.findElement(By.xpath(cart)).click();
            	    	isTrue = true;
            	    	 //System.out.println("//ul[@class='products-grid products-grid--max-4-col first last odd']");
            	     break;
				case "Samsung Galaxy": 
            	        break;
            	}
            	if(isTrue)
            	{
            		break;
            	}
            	i++;
            }
          driver.findElement(By.xpath("//input[@title='Qty']")).sendKeys("1000");
          //Thread.sleep(1000);
          driver.findElement(By.xpath("//button[@class='button btn-update']")).click();
          String Errormsg = driver.findElement(By.xpath("//table[@id='shopping-cart-table']//p")).getText();
          String msgQty = ("* The maximum quantity allowed for purchase is 500.");
          if(Errormsg.equalsIgnoreCase(msgQty))
          {
                System.out.println(Errormsg);
          }
          else{
        	  System.out.println("it is failed to show error message");
          }
            //input[@title='Qty']
          driver.findElement(By.id("empty_cart_button")).click();
         String cartempty = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[1]/h1")).getText();
         String actualmsg = "Shopping Cart is Empty";
         if(cartempty.equalsIgnoreCase(actualmsg))
         {
               System.out.println(cartempty);
         }
         else{
       	  System.out.println("it is failed to show error message");
         }
         //System.out.println(cartempty);
	}

	
}
