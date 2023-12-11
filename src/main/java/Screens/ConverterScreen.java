package Screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ConverterScreen {
    @FindBy(xpath = "//android.widget.TextView[@text='Converter']")
    public WebElement converter;
    @FindBy(xpath = "//android.widget.TextView[@text='Currency']")
    public WebElement Currency;
    @FindBy(xpath = "//android.widget.TextView[@text='Length']")
    public WebElement Length;
    @FindBy(xpath = "//android.widget.TextView[@text='Mass']")
    public WebElement Mass;
    @FindBy(xpath = "//android.widget.TextView[@text='Area']")
    public WebElement Area;
    @FindBy(xpath = "//android.widget.TextView[@text='Income tax']")
    public WebElement Income_tax;
    @FindBy(xpath = "//android.widget.TextView[@text='Mortgage']")
    public WebElement Mortgage;
    @FindBy(xpath = "//android.widget.TextView[@text='Time']")
    public WebElement Time;
    @FindBy(xpath = "//android.widget.TextView[@text='Volume']")
    public WebElement Volume;
    @FindBy(xpath = "//android.widget.TextView[@text='Numeral system']")
    public WebElement Numeral_system;
    @FindBy(xpath = "//android.widget.TextView[@text='Temperature']")
    public WebElement Temperature;
    @FindBy(xpath = "//android.widget.TextView[@text='Speed']")
    public WebElement Speed;
    @FindBy(xpath = "//android.widget.TextView[@text='BMI']")
    public WebElement BMI;
    @FindBy(id = "//android.widget.TextView[@text='Calculator']")
    public WebElement Calculator;
    AndroidDriver driver;
    public ConverterScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public void BackToCalc() throws InterruptedException{
        Thread.sleep(2000);
        Calculator.click();
    }
    public void ClickonTemp(){
        Temperature.click();
    }
    public void ClickonVolume(){
        Volume.click();
    }
    public void ClickonCurrency() throws InterruptedException{
        Thread.sleep(2000);
        Currency.click();
    }
    public void ClickonLength() throws InterruptedException{
        Thread.sleep(2000);
        Length.click();
    }
    public void ClickonMass() throws InterruptedException{
        Thread.sleep(2000);
        Mass.click();
    }
    public void ClickonArea() throws InterruptedException{
        Thread.sleep(2000);
        Area.click();
    }
    public void ClickonTime() throws InterruptedException{
        Thread.sleep(2000);
        Time.click();
    }
    public void ClickonSpeed() throws InterruptedException{
        Thread.sleep(2000);
        Speed.click();
    }
    public void ClickonNumeral() throws InterruptedException{
        Thread.sleep(2000);
        Numeral_system.click();
    }
}
