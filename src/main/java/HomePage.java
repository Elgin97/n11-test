import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.By.*;

//N11 den bir ürün sepete ekleyip çıkarıyoruz.
public class HomePage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.n11.com/arama?q=al%C4%B1%C5%9Fveri%C5%9F");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@class='icon iconAllCat']")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/nav/ul/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/section[2]/ul/li/ul/li/ul[3]/li/a")).click();
        driver.findElement(By.xpath("//div[@id='p-525632092']")).click();
        driver.findElement(By.xpath("//button[@title='Sepete Ekle']")).click();
        driver.findElement(By.xpath("//i[@class='icon iconBasket']")).click();
        driver.findElement(By.xpath("//span[@class='btn btnBlack']")).click();
        driver.findElement(By.xpath("//span[@class='removeProd svgIcon svgIcon_trash']")).click();

    }
}
