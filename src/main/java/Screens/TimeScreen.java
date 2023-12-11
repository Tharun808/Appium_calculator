package Screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TimeScreen {
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
    @FindBy(id = "com.miui.calculator:id/up")
    public WebElement Backbtn;
    @FindBy(xpath ="//android.widget.TextView[@content-desc='1800']")
    public WebElement seconds_result;
    
    AndroidDriver driver;

    public TimeScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public boolean Minutes_to_Seconds(){
        Number3.click();
        Number0.click();
        return seconds_result.isDisplayed();
    }
    public void NavigateBack() throws InterruptedException{
        Thread.sleep(2000);
        Backbtn.click();
    }  
}
