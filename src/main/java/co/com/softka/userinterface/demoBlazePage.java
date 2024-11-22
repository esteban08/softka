package co.com.softka.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class demoBlazePage {
    public static final Target MOBILE = Target.the("Option Mobile Nexus 6").locatedBy("(//a[@class='hrefch'])[3]");
    public static final Target BTNADD = Target.the("Option Add to cart").locatedBy("//a[@class='btn btn-success btn-lg']");
    public static final Target SINGUP = Target.the("Option singUp").located(By.id("signin2"));
    public static final Target USER = Target.the("Input User").located(By.id("sign-username"));

    public static final Target PASSWORD = Target.the("Input Password").located(By.id("sign-password"));
    public static final Target BTNSINGUP = Target.the("Button SingUP").locatedBy("//button[@onclick='register()']");
    public static final Target OPTIONLOGIN = Target.the("Btn login").located(By.id("login2"));
    public static final Target LOGINUSER = Target.the("Btn login").located(By.id("loginusername"));
    public static final Target LOGINPASSWORD = Target.the("Btn login").located(By.id("loginpassword"));
    public static final Target BTNLOGIN = Target.the("Btn login").locatedBy("//button[@onclick='logIn()']");
    public static final Target CATEGORY = Target.the("Btn login").located(By.id("nameofuser"));
    public static final Target BTNCLOSE = Target.the("Btn login").locatedBy("(//button[@class='close'])[2]");
}
