import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Navegar {
    @Test
    public void pesquisar(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marlo\\Documents\\NetBeansProjects\\automacao2\\src\\driver\\chromedriver.exe");
        WebDriver navegar = new ChromeDriver();
    }
}
