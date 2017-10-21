package core; 

//import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.*;
//import java.util.concurrent.TimeUnit;
import java.util.logging.*;

public class FirefoxAlex {

      static WebDriver driver;
      By by;
      
      public static boolean isPresent(final By by) { 
      //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
      if (!driver.findElements(by).isEmpty()) return true;
      else return false;
    }
    
    public static void main(String[] args) throws InterruptedException {
    Logger.getLogger("").setLevel(Level.OFF);
    
    String driverPath = "";
String url = "https://www.macys.com/shop/product/apple-watch-series-3-gps-cellular-42mm-space-black-stainless-steel-case-with-black-sport-band?ID=5302660&CategoryID=55285";

         if (System.getProperty("os.name").toUpperCase().contains("MAC"))
                 driverPath = "./resources/webdrivers/mac/geckodriver.sh";
        else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS"))
                 driverPath = "./resources/webdrivers/pc/geckodriver.exe";
        else throw new IllegalArgumentException("Unknown OS");
        
        
        System.setProperty("webdriver.gecko.driver", driverPath);
        driver = new FirefoxDriver();
        
        //driver.manage().window().maximize();
        driver.get(url);
        
//       //*[@id='productHeaderBox']/div/[1]/div/div/div/div/a

//      /html/body/div[3]/div[2]/selection/div[2]/div/div/div[1]/div[1]/div/div[1]/div/div/div/div/a

        By brandNameLink = By.id("//div[1]/div/div[1]/div/div/div/div/a");
        By brandbrandName = By.id("//div[1]/div/div[1]/div/div/div/div/h1"); 
        By singlePrice = By.id("//div[1]/div/section[2]/div/div[1]/span");
        
System.out.println("01.Element[brandNameLink]:" + (isPresent(brandNameLink) ? "Exists":"Not exist"));
System.out.println("02.Element[brandbrandName]:" + (isPresent(brandbrandName) ? "Exists":"Not exist")); 
System.out.println("03.Element[singlePrice]:" + (isPresent(singlePrice) ? "Exists":"Not exist")); 
               driver.quit();
               }
 }                   