package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class ResultadoDeBusquedaPage extends BaseClass {
    public ResultadoDeBusquedaPage(WebDriver driver) {
        super(driver);
    }

    By locatorBtnMeGusta = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/span[1]/div[1]/div[1]/div[1]/div[1]/i[1]");

    public void darMeGusta(){
       click(esperaExplicita(locatorBtnMeGusta));
    }
}
