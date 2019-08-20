//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import static org.assertj.core.api.Assertions.*;
//
//public class Main {
//
//    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "bin/chromedriver");
//
//        ChromeDriver chromeDriver = new ChromeDriver(new ChromeOptions());
//
//        chromeDriver.get("https://google.co.uk");
//
//        WebElement searchbar = chromeDriver.findElement(By.name("q"));
//
//        searchbar.sendKeys("Zayaan Ahmad");
//
//        WebElement search = chromeDriver.findElement(By.name("f"));
//
//        search.submit();
//
//        Thread.sleep(1000);
//        String currenttitle = chromeDriver.getTitle();
//        assertThat(currenttitle).isEqualTo("Zayaan Ahmad - Googleearch");
//
//        //Thread.sleep(10000000);
//
//
//
//
//
//        chromeDriver.quit();
//    }

//}
