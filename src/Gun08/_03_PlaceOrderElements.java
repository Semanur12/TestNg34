package Gun08;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _03_PlaceOrderElements {

    //Bu sayfadaki bütün elemanların driverlar bağlantısı gerekiyor
    //bunun için aşağıdaki constructor eklendi ve  PageFactory ile
    //driver üzerinden bu (this) sayfadaki bütün elemanlar ilişkilendirildi
    //Böylece sayfadan nesne türetildiği zaman , değil
    //kullanıldığı anda elemanların bulunması aktif oluyor.Bu yöntemle bütün
    //sayfalarda aynı isimde elemanlar var ise buradaki tanımlama hepsi için
    //geçerli hale gelmiş oluyor.
    //Bu yapıya Page Object Model(POM) adı veriliyor.

    public _03_PlaceOrderElements(WebDriver driver){

        PageFactory.initElements(driver,this);
        //Özelliği hepsini driver ile ilişkilendiriyor
    }





    @FindBy(name="search")
    public WebElement searchBox;


    @FindBy(className = "input-group-btn")
    public WebElement searchButton;


    @FindBy(xpath = "//span[text()='Add to Cart']")
    public WebElement addToCart;


    @FindBy(linkText = "Shopping Cart")
    public WebElement shoppingCart;


    @FindBy(linkText = "Checkout")
    public WebElement checkOut;


    @FindBy(id = "button-payment-address")
    public WebElement Continue1;


    @FindBy(id = "button-shipping-address")
    public WebElement Continue2;


    @FindBy(id = "button-shipping-method")
    public WebElement Continue3;


    @FindBy(name = "agree")
    public WebElement agree;


    @FindBy(id = "button-payment-method")
    public WebElement Continue4;


    @FindBy(id = "button-confirm")
    public WebElement confirm;


    @FindBy(css = "[id='content']>h1")
    public WebElement confirmtxt;























}
