import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;

public class datospersonales {
    WebDriver driver;
    public static void micuenta(String name, String lastname, String password, String confirmation){
        WebDriver driver;
        /*Se actualizan los datos personales del usuario*/
        driver.findElement(By.cssSelector(".button-medium:nth-child(1) > span")).click();
        driver.findElement(By.cssSelector(".columns-container")).click();

    }
        WebDriverSupliter =getChromeDriver();

        driver.findElement(By.id("firstname")).sendKeys("Pedro");
        driver.findElement(By.id("lastname")).sendKeys("Gonzalez");
        driver.findElement(By.id("old_passwd")).sendKeys("admin123456");
        driver.findElement(By.id("passwd")).sendKeys("admin123456");
        driver.findElement(By.id("confirmation")).sendKeys("admin123456");
        driver.findElement(By.id("newsletter")).click();

        return drive.finElement(By.ByCssSelector(".alert")).click();

    assertEquals("Your personal information has been successfully updated.", driver.findElement(By.cssSelector(".alert")).getText());
}
