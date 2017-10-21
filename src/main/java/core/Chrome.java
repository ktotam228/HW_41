package core;

//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.*;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

//import java.util.concurrent.TimeUnit;
import java.util.logging.*;

public class Chrome {

	static WebDriver driver;
	
	public static boolean isPresent(final By by) {
		//driver.manage().timeout().implicitlyWait(15, TimeUnit.SECONDS);
		if (!driver.findElements(by).isEmpty()) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) throws InterruptedException {

		Logger logger = Logger.getLogger("");
		logger.setLevel(Level.OFF);

		String driverPath = "";
		String browser = "Chrome";

		String url = "http://www.logitech.com/en-us/product/craft?buy=1";

		if (System.getProperty("os.name").toUpperCase().contains("MAC"))
			driverPath = "./resources/webdrivers/mac/chromedriver";
		else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS"))
			driverPath = "./resources/webdrivers/pc/chromedriver.exe";
		else
			throw new IllegalArgumentException("Unknown OS");

		System.setProperty("webdriver.chrome.driver", driverPath);
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-infobars");
		option.addArguments("--disable-notifications");
		if (System.getProperty("os.name").toUpperCase().contains("MAC"))
			option.addArguments("-start-fullscreen");
		else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS"))
			option.addArguments("--start-maximized");
		else
			throw new IllegalArgumentException("Unknown OS");
		//driver = new ChromeDriver(option);
		//WebDriverWait wait = new WebDriverWait(driver, 15);
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get(url);
		
		String companyLogo = "//*[@id='hero-logo-ani']";
		String copyRights = "//div/div[2]/p";
		String productName = "//div[4]/div/div[1]/h1";
		String productMainPicture = "//div/div/li[1]/img";
		String productDescription = "//div[1]/div[4]/div/div[1]/p[1]";
		String price = "//div[4]/div/div[1]/p[2]";
		String termsOfShipping = "//div[4]/div/div[1]/p[3]";
		String preOrderButton = "//div[4]/div/div[2]/a[1]";
		String specification = "//div[1]/div[4]/div/ul";
		String addPicture2 = "//div[2]/ul/li[2]/a/img";
		String addPicture3 = "//div[2]/ul/li[3]/a/img";
		String overview = "//div/ul/ol/li[1]/a/span";
		String exterience = "//div/ul/ol/li[2]/a";
		String learn = "//div/div/ul/ol/li[3]/a";
		String rearch = "//div[4]/div/a[2]/span";
		String language = "//div/ul[2]/li[1]/a";
		String loginField = "//div/ul[2]/li[2]/a";
		String myCraft = "//div/div/ul[2]/li[3]/a";
		String newLetterSubscr = "//div[1]/div/form/label";
		String emailField = "//form/div/input[1]";
		String sendEmailButton = "//div/input[2]";
		String country = "//div[2]/div/div[2]/div/div/a";
		String facebookLink = "//div/div[2]/div/div[1]/ul/li[1]/a/img";
		String twitterLink = "//div/div[2]/div/div[1]/ul/li[2]/a/img";
		String instaLink = "//div/div[2]/div/div[1]/ul/li[3]/a/img";
			

		System.out.printf("Browser: %s;\nPage URL: %s; \n",browser, driver.getCurrentUrl());
		System.out.printf("01 Element [companyLogo]: %s \n",isPresent(By.xpath(companyLogo))?"Exist":"Not Exist");
		System.out.printf("02 Element [copyRights]: %s \n",isPresent(By.xpath(copyRights))?"Exist":"Not Exist");
		System.out.printf("03 Element [productName]: %s \n",isPresent(By.xpath(productName))?"Exist":"Not Exist");
		System.out.printf("04 Element [productMainPicture]: %s \n",isPresent(By.xpath(productMainPicture))?"Exist":"Not Exist");
		System.out.printf("05 Element [productDescription]: %s \n",isPresent(By.xpath(productDescription))?"Exist":"Not Exist");
		System.out.printf("06 Element [price]: %s \n",isPresent(By.xpath(price))?"Exist":"Not Exist");
		System.out.printf("07 Element [termsOfShipping]: %s \n",isPresent(By.xpath(termsOfShipping))?"Exist":"Not Exist");
		System.out.printf("08 Element [preOrderButton]: %s \n",isPresent(By.xpath(preOrderButton))?"Exist":"Not Exist");
		System.out.printf("09 Element [specification]: %s \n",isPresent(By.xpath(specification))?"Exist":"Not Exist");
		System.out.printf("10 Element [addPicture2]: %s \n",isPresent(By.xpath(addPicture2))?"Exist":"Not Exist");
		System.out.printf("11 Element [addPicture3]: %s \n",isPresent(By.xpath(addPicture3))?"Exist":"Not Exist");
		System.out.printf("12 Element [overview]: %s \n",isPresent(By.xpath(overview))?"Exist":"Not Exist");
		System.out.printf("13 Element [exterience]: %s \n",isPresent(By.xpath(exterience))?"Exist":"Not Exist");
		System.out.printf("14 Element [learn]: %s \n",isPresent(By.xpath(learn))?"Exist":"Not Exist");
		System.out.printf("15 Element [rearch]: %s \n",isPresent(By.xpath(rearch))?"Exist":"Not Exist");
		System.out.printf("16 Element [language]: %s \n",isPresent(By.xpath(language))?"Exist":"Not Exist");
		System.out.printf("17 Element [loginField]: %s \n",isPresent(By.xpath(loginField))?"Exist":"Not Exist");
		System.out.printf("18 Element [myCraft]: %s \n",isPresent(By.xpath(myCraft))?"Exist":"Not Exist");
		System.out.printf("19 Element [newLetterSubscr]: %s \n",isPresent(By.xpath(newLetterSubscr))?"Exist":"Not Exist");
		System.out.printf("20 Element [emailField]: %s \n",isPresent(By.xpath(emailField))?"Exist":"Not Exist");
		System.out.printf("21 Element [sendEmailButton]: %s \n",isPresent(By.xpath(sendEmailButton))?"Exist":"Not Exist");
		System.out.printf("22 Element [country]: %s \n",isPresent(By.xpath(country))?"Exist":"Not Exist");
		System.out.printf("23 Element [facebookLink]: %s \n",isPresent(By.xpath(facebookLink))?"Exist":"Not Exist");
		System.out.printf("24 Element [twitterLink]: %s \n",isPresent(By.xpath(twitterLink))?"Exist":"Not Exist");
		System.out.printf("25 Element [instaLink]: %s \n",isPresent(By.xpath(instaLink))?"Exist":"Not Exist");
		
		driver.quit();

	
	}
}