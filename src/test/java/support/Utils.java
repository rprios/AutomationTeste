package support;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.util.Random;

import static runner.RunCucumberTest.driver;

public class Utils  extends RunCucumberTest {

    public void waitElementBePresent(By element, Integer tempo) {
        WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public String getRandomEmail () {
        String email_init = "Rodrigo";
        String email_final = "@teste.com.br";
        Random random = new Random();
        int min = 0;
        int max = 99999;
        int result = random.nextInt(max-min) + min;
        return email_init + result + email_final;

    }
}