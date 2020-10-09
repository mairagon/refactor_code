import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverSupliter;

public class login{
    public static void authentication(String email, String password){

        WebDriver driver;
        LoginPage loginpage =
                PageFactory.initElements(driver,
                        LoginPage.class);
        loginpage.setEmail("fernandocotrena@gmail.com");

        WebDriverSupliter =getChromeDriver();

        //driver.findElement(By.id("email")).sendKeys("fernandocotrena@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("admin123456");
        driver.findElement(By.cssSelector("#SubmitLogin > span")).click();cromeDriver();

    }

    private static login getChromeDriver() {
    }
}
