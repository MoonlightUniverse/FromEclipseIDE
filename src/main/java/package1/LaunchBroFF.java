package package1;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;

	public class LaunchBroFF {

	 public static void main(String[] args) {
	  DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	  capabilities.setCapability("marionette", true);
	  System.setProperty("webdriver.gecko.driver", ".\\src\\main\\resources\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://www.toolsqa.com");

	  try {
	   Thread.sleep(5000);
	  } catch (InterruptedException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }
	  //driver.quit();

	 }

}
