package DemoTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GeoLocation_SeleniumGrid {
    public WebDriver driver;
    private String username = "Rex.Jones";
    private String acesssKey = "";
    private String hub = "@hub.lambatest.com/ws/hub";
    DesiredCapabilities caps = new DesiredCapabilities();

    @BeforeClass
    public void setUp() {
        caps.setCapability("build", "3.1");
        caps.setCapability("name", "Test GeoLocation");
        caps.setCapability("geoLocation", "IN");
        caps.setCapability("browserName", "chrome");
        caps.setCapability("version", "103.0");
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("network", true);
        caps.setCapability("console", true);
        caps.setCapability("visual", true);

        try {
            driver = new RemoteWebDriver(new URL("https://" +
                    username + ":" + acesssKey + hub), caps);
        } catch (MalformedURLException exc) {
            exc.printStackTrace();
        }
        driver.get("https://where-am-i.org");
    }

    @Test
    public void testGeoLocation(){
        WebElement address =driver.findElement(By.id("address"));
        System.out.println("Address" + address.getText());
    }

}
