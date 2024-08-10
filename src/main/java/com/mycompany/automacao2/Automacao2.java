package com.mycompany.automacao2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automacao2 {

    public static void main(String[] args) {
          // Configurar o WebDriver (ajuste o caminho do ChromeDriver)
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marlo\\Documents\\NetBeansProjects\\automacao2\\src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {
            // Navegar para o WhatsApp Web
            driver.get("https://web.whatsapp.com");

            // Tempo para escanear o QR code
            Thread.sleep(80000); // Aguarde 30 segundos para escanear o QR code

            // Localizar o contato ou grupo pelo nome
            WebElement searchBox = driver.findElement(By.xpath("//div[@contenteditable='true']"));
            searchBox.sendKeys("MiltonHeber");

            Thread.sleep(5000); // Aguarde a pesquisa do contato

            WebElement contact = driver.findElement(By.xpath("//span[@title='MiltonHeber']"));
            Thread.sleep(4000);
            contact.click();

            // Mensagem a ser enviada
            String message = "Marino Manuel. feito em java! kital bosss?!";

            // Número de vezes que a mensagem será enviada
            int repeatCount = 2000;

            // Localizar a caixa de mensagem e enviar a mensagem
            Thread.sleep(5000);
           // WebElement messageBox = driver.findElement(By.xpath("//div[@title='Mensagem']"));
            WebElement messageBox = driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p"));
            for (int i = 0; i < repeatCount; i++) {
                messageBox.sendKeys(message);
                messageBox.sendKeys("\n"); // Pressionar Enter para enviar

                // Esperar 1 segundo antes de enviar a próxima mensagem
                messageBox = driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p"));
              //  Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Fechar o navegador
            driver.quit();
        }

    }
}

