package Screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CurrencyScreen {
    @FindBy(id = "com.miui.calculator:id/digit_1")
    public WebElement Number1;
    @FindBy(id = "com.miui.calculator:id/digit_2")
    public WebElement Number2;
    @FindBy(id = "com.miui.calculator:id/digit_3")
    public WebElement Number3;
    @FindBy(id = "com.miui.calculator:id/digit_4")
    public WebElement Number4;
    @FindBy(id = "com.miui.calculator:id/digit_5")
    public WebElement Number5;
    @FindBy(id = "com.miui.calculator:id/digit_6")
    public WebElement Number6;
    @FindBy(id = "com.miui.calculator:id/digit_7")
    public WebElement Number7;
    @FindBy(id = "com.miui.calculator:id/digit_8")
    public WebElement Number8;
    @FindBy(id = "com.miui.calculator:id/digit_9")
    public WebElement Number9;
    @FindBy(id = "com.miui.calculator:id/digit_0")
    public WebElement Number0;
    @FindBy(id = "com.miui.calculator:id/digit_00")
    public WebElement Number00;
    @FindBy(xpath  = "//android.widget.TextView[@text='Chinese yuan CNY']")
    public WebElement Chinese;
    @FindBy(xpath = "(//android.widget.LinearLayout[@resource-id='com.miui.calculator:id/lyt_value'])[2]")
    public WebElement USD_res;
    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Indian rupee INR']")
    public WebElement INR;
    @FindBy(xpath = "(//android.widget.ImageView[@resource-id='android:id/icon1'])[1]")
    public WebElement Dropdown;
    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc='Back']/android.widget.ImageView")
    public WebElement Backbtn;
    
    AndroidDriver driver;

    public CurrencyScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public Boolean CNytoUSD() throws InterruptedException{
        Thread.sleep(2000);
        Number1.click();
        Number00.click();
        return USD_res.isDisplayed();
    }
    public void NavigateBack(){
        Backbtn.click();
    }
}
