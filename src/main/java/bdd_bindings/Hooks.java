package bdd_bindings;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

	public static WebDriver driver;
	public static Actions act;

	@Before
	public static void start() throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/mk/Downloads/chromedriver_mac_arm64/chromedriver");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		act = new Actions(driver);
	}
}
