package Screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LandingScreen {
    @FindBy(id = "android:id/button1")
    public WebElement Agreebtn;
    @FindBy(id = "com.miui.calculator:id/btn_c_s")
    public WebElement Clearbtn;
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
    @FindBy(id = "com.miui.calculator:id/op_add")
    public WebElement addbtn;
    @FindBy(id = "com.miui.calculator:id/op_sub")
    public WebElement subbtn;
    @FindBy(id = "com.miui.calculator:id/op_mul")
    public WebElement multbtn;
    @FindBy(id = "com.miui.calculator:id/op_div")
    public WebElement divtbtn;
    @FindBy(id = "com.miui.calculator:id/btn_equal_s")
    public WebElement eqlbtn;
    @FindBy(id = "com.miui.calculator:id/result")
    public WebElement Result;
    @FindBy(xpath = "//android.widget.TextView[@text='Converter']")
    public WebElement converter;
    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Switch']")
    public WebElement Switch;
    @FindBy(id = "com.miui.calculator:id/fun_log")
    public WebElement Log;
    @FindBy(id ="com.miui.calculator:id/fun_ln")
    public WebElement ln;
    @FindBy(id = "com.miui.calculator:id/fun_sin")
    public WebElement Sine;
    @FindBy(id = "com.miui.calculator:id/fun_cos")
    public WebElement Cosine;
    @FindBy(id = "com.miui.calculator:id/fun_tan")
    public WebElement Tangent;

    AndroidDriver driver;

    public LandingScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String Addition() throws InterruptedException {
        Number8.click();
        addbtn.click();
        Number3.click();
        eqlbtn.click();
        Thread.sleep(2500);
        return Result.getText();
    }

    public String Substraction() throws InterruptedException {
        Number8.click();
        subbtn.click();
        Number3.click();
        eqlbtn.click();
        Thread.sleep(2500);
        return Result.getText();
    }

    public String Multiplicatin() throws InterruptedException {
        Number8.click();
        multbtn.click();
        Number3.click();
        eqlbtn.click();
        Thread.sleep(2500);
        return Result.getText();
    }

    public String Division() throws InterruptedException {
        Number8.click();
        divtbtn.click();
        Number3.click();
        eqlbtn.click();
        Thread.sleep(2500);
        return Result.getText();
        
    }
    public String Logarithm(){
        Switch.click();
        Log.click();
        Number1.click();
        Number0.click();
        Result.click();
        return Result.getText();
    }
    public String ln(){
        ln.click();
        Number1.click();
        Result.click();
        return Result.getText();
    }
    public String Sine(){
        Sine.click();
        Number0.click();
        eqlbtn.click();
        return Result.getText();

    }
    public String Cosine(){
        Cosine.click();
        Number0.click();
        eqlbtn.click();
        return Result.getText();

    }
    public String Tangent(){
        Tangent.click();
        Number0.click();
        eqlbtn.click();
        return Result.getText();

    }

    public void ClickOnCOnverter() {
        converter.click();

    }
    
}
