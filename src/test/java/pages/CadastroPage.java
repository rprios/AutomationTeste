package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class CadastroPage extends Utils {

    WebDriver driver;
    private By titlem = By.id("id_gender1");
    private By titlef = By.id("id_gender2");

    public CadastroPage(WebDriver driver) {
        this.driver = driver;
    }
    public void selectTitle(Integer type){
        if (type == 1) {
            driver.findElement(titlem).click();
        } else {
            driver.findElement(titlef).click();
        }

}
