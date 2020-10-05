import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpdatePersonalInformation {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = WebDriverSupliter.getChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        WebDriverSupliter.quitDriver();
    }

    @Test
    public void adasd() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

       /*Se inicia sesión en la aplicación*/
        driver.findElement(By.id("email")).sendKeys("fernandocotrena@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("admin123456");
        driver.findElement(By.cssSelector("#SubmitLogin > span")).click();

        /*Se accede a la vista 'My personal information' realizando clic en la tarjeta*/
        driver.findElement(By.cssSelector("li:nth-child(4) span:nth-child(2)")).click();

        /*Se actualizan los datos personales del usuario*/
        driver.findElement(By.id("firstname")).sendKeys("Pedro");
        driver.findElement(By.id("lastname")).sendKeys("Gonzalez");
        driver.findElement(By.id("old_passwd")).sendKeys("admin123456");
        driver.findElement(By.id("passwd")).sendKeys("admin123456");
        driver.findElement(By.id("confirmation")).sendKeys("admin123456");
        driver.findElement(By.id("newsletter")).click();

        /*Se actualizan los datos personales del usuario*/
        driver.findElement(By.cssSelector(".button-medium:nth-child(1) > span")).click();
        driver.findElement(By.cssSelector(".columns-container")).click();

        /*Se valida el mensaje del sistema luego de guardar los cambios*/
        assertEquals("Your personal information has been successfully updated.", driver.findElement(By.cssSelector(".alert")).getText());
    }
}
