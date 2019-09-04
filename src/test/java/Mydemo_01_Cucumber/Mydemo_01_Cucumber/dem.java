package Mydemo_01_Cucumber.Mydemo_01_Cucumber;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;

	public class dem {
			public static WebDriver ConfigureDriver(String browserName) {
			WebDriver driver = null;
			if(browserName.equals("explorer")){
					System.setProperty("webdriver.ie.driver","C:\\Users\\s.arul.mozhi.udaiyar\\Downloads\\eclipse-java-oxygen-3a-win32-x86_64 (1)\\eclipse\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
	else if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\s.arul.mozhi.udaiyar\\Downloads\\eclipse-java-oxygen-3a-win32-x86_64 (1)\\eclipse\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browserName.equals("firefox")) {
		System.setProperty("webdriver.firefox.driver","C:\\Users\\s.arul.mozhi.udaiyar\\Downloads\\eclipse-java-oxygen-3a-win32-x86_64 (1)\\eclipse\\geckodriver.exe");
	driver=new FirefoxDriver();
	}
			return driver;

	}
	}

