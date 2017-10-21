package core;

//import java.util.concurrent.TimeUnit;
import java.util.logging.*;

public class Firefox {

	static WebDriver driver;
	By by;

	public static boolean isPresent(final By by) {
		
		if (!driver.findElements(by).isEmpty())
			return true;
		else
			return false;
	}

	public static void main(String[] args) throws InterruptedException {
		Logger.getLogger("").setLevel(Level.OFF);

		String driverPath = "";
		String url = "http://www.logitech.com/en-us/product/craft?buy=1";
		String browser = "Firefox";

		if (System.getProperty("os.name").toUpperCase().contains("MAC"))
			driverPath = "./resources/webdrivers/mac/geckodriver.sh";
		else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS"))
			driverPath = "./resources/webdrivers/pc/geckodriver.exe";
		else
			throw new IllegalArgumentException("Unknown OS");

		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();

		
		driver.get(url);

		// //*[@id='productHeaderBox']/div[1]/div/div/div/div/a
		// //*[@id='productHeaderBox']/div[1]/div/div/div/div/h1
		// //*[@id='productHeaderBox']/section[2]/div/div[1]/span

		By companyLogo = By.xpath("//*[@id='hero-logo-ani']");
		By copyRights = By.xpath("//div/div[2]/p");
		By productName = By.xpath("//div[4]/div/div[1]/h1");
		By productMainPicture = By.xpath("//div/div/li[1]/img");
		By productDescription = By.xpath("//div[1]/div[4]/div/div[1]/p[1]");
		By price = By.xpath("//div[4]/div/div[1]/p[2]");
		By termsOfShipping = By.xpath("//div[4]/div/div[1]/p[3]");
		By preOrderButton = By.xpath("//div[4]/div/div[2]/a[1]");
		By specification = By.xpath("//div[1]/div[4]/div/ul");
		By addPicture2 = By.xpath("//div[2]/ul/li[2]/a/img");
		By addPicture3 = By.xpath("//div[2]/ul/li[3]/a/img");
		By overview = By.xpath("//div/ul/ol/li[1]/a/span");
		By exterience = By.xpath("//div/ul/ol/li[2]/a");
		By learn = By.xpath("//div/div/ul/ol/li[3]/a");
		By rearch = By.xpath("//div[4]/div/a[2]/span");
		By language = By.xpath("//div/ul[2]/li[1]/a");
		By loginField = By.xpath("//div/ul[2]/li[2]/a");
		By myCraft = By.xpath("//div/div/ul[2]/li[3]/a");
		By newLetterSubscr = By.xpath("//div[1]/div/form/label");
		By emailField = By.xpath("//form/div/input[1]");
		By sendEmailButton = By.xpath("//div/input[2]");
		By country = By.xpath("//div[2]/div/div[2]/div/div/a");
		By facebookLink = By.xpath("//div/div[2]/div/div[1]/ul/li[1]/a/img");
		By twitterLink = By.xpath("//div/div[2]/div/div[1]/ul/li[2]/a/img");
		By instaLink = By.xpath("//div/div[2]/div/div[1]/ul/li[3]/a/img");
		
		

		System.out.printf("Browser: %s;\nPage URL: %s; \n",browser, driver.getCurrentUrl());
		System.out.printf("01 Element [companyLogo]: %s \n",isPresent((companyLogo))?"Exist":"Not Exist");
		System.out.printf("02 Element [copyRights]: %s \n",isPresent((copyRights))?"Exist":"Not Exist");
		System.out.printf("03 Element [productName]: %s \n",isPresent((productName))?"Exist":"Not Exist");
		System.out.printf("04 Element [productMainPicture]: %s \n",isPresent((productMainPicture))?"Exist":"Not Exist");
		System.out.printf("05 Element [productDescription]: %s \n",isPresent((productDescription))?"Exist":"Not Exist");
		System.out.printf("06 Element [price]: %s \n",isPresent((price))?"Exist":"Not Exist");
		System.out.printf("07 Element [termsOfShipping]: %s \n",isPresent((termsOfShipping))?"Exist":"Not Exist");
		System.out.printf("08 Element [preOrderButton]: %s \n",isPresent((preOrderButton))?"Exist":"Not Exist");
		System.out.printf("09 Element [specification]: %s \n",isPresent((specification))?"Exist":"Not Exist");
		System.out.printf("10 Element [addPicture2]: %s \n",isPresent((addPicture2))?"Exist":"Not Exist");
		System.out.printf("11 Element [addPicture3]: %s \n",isPresent((addPicture3))?"Exist":"Not Exist");
		System.out.printf("12 Element [overview]: %s \n",isPresent((overview))?"Exist":"Not Exist");
		System.out.printf("13 Element [exterience]: %s \n",isPresent((exterience))?"Exist":"Not Exist");
		System.out.printf("14 Element [learn]: %s \n",isPresent((learn))?"Exist":"Not Exist");
		System.out.printf("15 Element [rearch]: %s \n",isPresent((rearch))?"Exist":"Not Exist");
		System.out.printf("16 Element [language]: %s \n",isPresent((language))?"Exist":"Not Exist");
		System.out.printf("17 Element [loginField]: %s \n",isPresent((loginField))?"Exist":"Not Exist");
		System.out.printf("18 Element [myCraft]: %s \n",isPresent((myCraft))?"Exist":"Not Exist");
		System.out.printf("19 Element [newLetterSubscr]: %s \n",isPresent((newLetterSubscr))?"Exist":"Not Exist");
		System.out.printf("20 Element [emailField]: %s \n",isPresent((emailField))?"Exist":"Not Exist");
		System.out.printf("21 Element [sendEmailButton]: %s \n",isPresent((sendEmailButton))?"Exist":"Not Exist");
		System.out.printf("22 Element [country]: %s \n",isPresent((country))?"Exist":"Not Exist");
		System.out.printf("23 Element [facebookLink]: %s \n",isPresent((facebookLink))?"Exist":"Not Exist");
		System.out.printf("24 Element [twitterLink]: %s \n",isPresent((twitterLink))?"Exist":"Not Exist");
		System.out.printf("25 Element [instaLink]: %s \n",isPresent((instaLink))?"Exist":"Not Exist");
		
	}
}