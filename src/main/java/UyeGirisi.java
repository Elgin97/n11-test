import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
//N11 üye girişi sayfası
public class UyeGirisi {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.n11.com/arama?q=al%C4%B1%C5%9Fveri%C5%9F");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div[2]/div[2]/div[2]/div/div/a[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/div[1]/div/form/div[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/div[1]/div/form/div[1]/input")).sendKeys("elgin123@gmail.com");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/div[1]/div/form/div[2]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/div[1]/div/form/div[2]/input")).sendKeys("elgin123");
        driver.findElement(By.xpath("//div[@id='loginButton']")).click();

    }
}