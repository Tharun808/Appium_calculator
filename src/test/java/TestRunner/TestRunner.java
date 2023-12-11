package TestRunner;

import Base.setup;
import Screens.AreaScreen;
import Screens.ConverterScreen;
import Screens.CurrencyScreen;
import Screens.LandingScreen;
import Screens.LengthScreen;
import Screens.MassScreen;
import Screens.NumeralsystemScreen;
import Screens.SpeedScreen;
import Screens.TempScreen;
import Screens.TimeScreen;
import Screens.VolumeScreen;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestRunner extends setup {
    LandingScreen LandingPage;
    ConverterScreen ConverterPage ;
    TempScreen TemparuaturePage;
    CurrencyScreen CurrencyPage;
    AreaScreen AreaPage;
    LengthScreen LengthPage;
    MassScreen MassPage;
    NumeralsystemScreen NumeralSystemPage;
    SpeedScreen SpeedPage;
    TimeScreen TimePage;
    VolumeScreen VolumePage;
    

    @BeforeTest
    public void Agree() throws InterruptedException {
        LandingPage=new LandingScreen(driver);
        Thread.sleep(1000);
        LandingPage.Agreebtn.click();
        Thread.sleep(1000);
    }
    @Test(priority=1)
    public void Addition() throws InterruptedException {
        LandingPage=new LandingScreen(driver);
        String result=LandingPage.Addition();
        Assert.assertTrue(result.contains("11"));
    }
    @Test(priority=2)
    public void Substraction() throws InterruptedException {
        LandingPage=new LandingScreen(driver);
        String result=LandingPage.Substraction();
        Assert.assertTrue(result.contains("5"));
    }
    @Test(priority=3)
    public void Multiplication() throws InterruptedException {
        LandingPage=new LandingScreen(driver);
        String result=LandingPage.Multiplicatin();
        //System.out.println(result);
        Assert.assertTrue(result.contains("24"));
    }
   @Test(priority=4)
    public void Division() throws InterruptedException {
       LandingPage=new LandingScreen(driver);
       String result= LandingPage.Division();
        Assert.assertTrue(result.contains("2.6"));
    }
    @Test(priority=5)
    public void Logarith(){
        LandingPage=new LandingScreen(driver);
        String result=LandingPage.Logarithm();
        Assert.assertTrue(result.contains("1"));
    }
    @Test(priority=6)
    public void ln(){
        LandingPage=new LandingScreen(driver);
        String result=LandingPage.ln();
        Assert.assertTrue(result.contains("0"));
    }
    @Test(priority=7)
    public void Sine(){
        LandingPage=new LandingScreen(driver);
        String result=LandingPage.Sine();
        Assert.assertTrue(result.contains("0"));
    }
    @Test(priority=8)
    public void Cosine(){
        LandingPage=new LandingScreen(driver);
        String result=LandingPage.Cosine();
        Assert.assertTrue(result.contains("1"));
    }
    @Test(priority=9)
    public void Tangent(){
        LandingPage=new LandingScreen(driver);
        String result=LandingPage.Tangent();
        Assert.assertTrue(result.contains("0"));
    }
    @Test(priority=10)
    public void CelsiusToFahrenheit() throws InterruptedException{
        LandingPage=new LandingScreen(driver);
        LandingPage.ClickOnCOnverter();
        ConverterPage=new ConverterScreen(driver);
        ConverterPage.ClickonTemp();
        TemparuaturePage=new TempScreen(driver);
        boolean Success = TemparuaturePage.CelsiusToFahrenheit();
        Assert.assertTrue(Success);
        TemparuaturePage.NavigateBack();        
    }
  
    @Test(priority=11)
    public void CurrencyConvert() throws InterruptedException{
        // LandingPage=new LandingScreen(driver);
        // LandingPage.ClickOnCOnverter();
        ConverterPage=new ConverterScreen(driver);
        ConverterPage.ClickonCurrency();
        CurrencyPage=new CurrencyScreen(driver);
        boolean Success=CurrencyPage.CNytoUSD();
        Assert.assertTrue(Success);
        CurrencyPage.NavigateBack();
    }
    @Test(priority=12)
    public void Area_Convert() throws InterruptedException{
        // LandingPage=new LandingScreen(driver);
        // LandingPage.ClickOnCOnverter();
        ConverterPage=new ConverterScreen(driver);
        ConverterPage.ClickonArea();
        AreaPage=new AreaScreen(driver);
        boolean Success=AreaPage.Sqm_sqcm();
        Assert.assertTrue(Success);
        AreaPage.NavigateBack();
    }
    @Test(priority=13)
    public void Meter_Centi_met() throws InterruptedException{
        // LandingPage=new LandingScreen(driver);
        // LandingPage.ClickOnCOnverter();
        ConverterPage=new ConverterScreen(driver);
        ConverterPage.ClickonLength();
        LengthPage=new LengthScreen(driver);
        boolean Success=LengthPage.m_to_cm();
        Assert.assertTrue(Success);
        LengthPage.NavigateBack();
    }
    @Test(priority=14)
    public void Kilo_to_Gram() throws InterruptedException{
        // LandingPage=new LandingScreen(driver);
        // LandingPage.ClickOnCOnverter();
        ConverterPage=new ConverterScreen(driver);
        ConverterPage.ClickonMass();
        MassPage=new MassScreen(driver);
        boolean result=MassPage.Kilo_to_Gram();
        Assert.assertTrue(result);
        MassPage.NavigateBack();
    }
    @Test(priority=15)
    public void Decimal_to_binary() throws InterruptedException{
        // LandingPage=new LandingScreen(driver);
        // LandingPage.ClickOnCOnverter();
        ConverterPage=new ConverterScreen(driver);
        ConverterPage.ClickonNumeral();
        NumeralSystemPage=new NumeralsystemScreen(driver);
        boolean result=NumeralSystemPage.Decimal_to_binary();
        Assert.assertTrue(result);
        NumeralSystemPage.NavigateBack();
    }
    @Test(priority=16)
    public void Met_per_sec_to_Kmps() throws InterruptedException{
        // LandingPage=new LandingScreen(driver);
        // LandingPage.ClickOnCOnverter();
        ConverterPage=new ConverterScreen(driver);
        ConverterPage.ClickonSpeed();
        SpeedPage=new SpeedScreen(driver);
        boolean result=SpeedPage.Met_per_sec_to_Kmps();
        Assert.assertTrue(result);
        SpeedPage.NavigateBack();
    }
    @Test(priority=17)
    public void Minutes_to_Seconds() throws InterruptedException{
        // LandingPage=new LandingScreen(driver);
        // LandingPage.ClickOnCOnverter();
        ConverterPage=new ConverterScreen(driver);
        ConverterPage.ClickonTime();
        TimePage=new TimeScreen(driver);
        boolean result=TimePage.Minutes_to_Seconds();
        Assert.assertTrue(result);
        TimePage.NavigateBack();
    }
    @Test(priority=18)
    public void CubicMeter_to_CubicCentimeter() throws InterruptedException{
        // LandingPage=new LandingScreen(driver);
        // LandingPage.ClickOnCOnverter();
        ConverterPage=new ConverterScreen(driver);
        ConverterPage.ClickonVolume();
        VolumePage=new VolumeScreen(driver);
        boolean result=VolumePage.CubicMeter_to_CubicCentimeter();
        Assert.assertTrue(result);
        VolumePage.NavigateBack();
    }        
}
