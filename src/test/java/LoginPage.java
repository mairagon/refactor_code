import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    LoginPage loginpage =
            PageFactory.initElements(driver,
                    LoginPage.class);
        loginpage.setEmail("fernandocotrena@gmail.com");

    WebDriverSupliter =getChromeDriver();

    //driver.findElement(By.id("email")).sendKeys("fernandocotrena@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("admin123456");
        driver.findElement(By.cssSelector("#SubmitLogin > span")).click();cromeDriver();

    @FindBy(how = How.XPATH, using =
            "// input[@type='email']]")
    WebElement emailTextBox;

    // This method is to set Email in the email text box
    public void setEmail(String strEmail) {
        emailTextBox.sendKeys(strEmail);
    }
}