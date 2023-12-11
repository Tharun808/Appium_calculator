package Base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
// import org.testng.ITestResult;
// import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

// import Utilities.ScreenshotUtility;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class setup {
    public AndroidDriver driver;
    //public static final String PACKAGE_ID="com.amazon.mShop.android.shopping";
    @BeforeTest
    public AndroidDriver setUp() throws MalformedURLException {
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability("deviceName","54a03370");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","12");
        cap.setCapability("automationName","uiautomator2");
        String appURL = System.getProperty("user.dir")+ File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + "App" + File.separator + "MIcalculator.apk" ;
        cap.setCapability("app", appURL);
        //cap.setCapability("appPackage","com.amazon.mShop.android.shopping");
        //cap.setCapability("appActivity","com.amazon.mShop.splashscreen.StartupActivity");
        //cap.setCapability("autoGrantPermissions",true);
        URL url=new URL("http://127.0.0.1:4723/");
        driver=new AndroidDriver(url,cap);
        return driver;
    }
//    @AfterMethod
//     public void screenShot(ITestResult result){
//         if(ITestResult.FAILURE==result.getStatus()){
//             try{
//                 ScreenshotUtility utils=new ScreenshotUtility();
//                 utils.takeScreenshotForFailure(driver);
//             }
//             catch (Exception exception){
//                 System.out.println(exception.toString());
//             }
//         }
//         else{
//             try{
//                 ScreenshotUtility utils=new ScreenshotUtility();
//                 utils.takeScreenshotForSuccess(driver);
//             }
//             catch (Exception exception){
//                 System.out.println(exception.toString());
//             }
//         }
//     }

    @AfterTest
    public void close(){
        driver.quit();
    }
}
