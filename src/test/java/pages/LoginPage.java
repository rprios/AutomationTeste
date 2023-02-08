package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class LoginPage extends Utils {
    WebDriver driver;
    private By create_nome_field = By.id("nome");
    private By create_email_field = By.id("email");
    private By create_senha_field = By.id("senha");
    private By create_button = By.cssSelector("body > div.jumbotron.col-lg-4 > form > input");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarTelaLogin () {
        driver.get("https://seubarriga.wcaquino.me/login");
        waitElementBePresent(create_email_field, 20);
    }
    public void preencherCampoEmail() {
        driver.findElement(create_email_field).sendKeys(getRandomEmail());
        driver.findElement(create_button).click();

    }

    public void clicarCriarContaBotao(){

    }
}
