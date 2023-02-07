package support;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import static runner.RunCucumberTest.driver;

public class Utils  extends RuncucumberTest {

    public void waitElementBePresent(By element, Integer tempo) {
        WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedCondotions.elementToBeClickable(element));
    }
}