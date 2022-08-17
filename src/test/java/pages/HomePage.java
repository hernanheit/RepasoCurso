package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class HomePage extends BaseClass {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Centranlizan los localizadores y acciones del sitio
    By locatorBtnAcceder = By.xpath("//ytd-masthead/div[@id='container']/div[@id='end']/div[@id='buttons']/ytd-button-renderer[1]/a[1]");

    //By locatorBtnRegistrate = By.xpath("//button[contains(text(),'Registra')]");

    //Acciones de la pagina
    public void irAIniciarSesion(){
        click(esperaExplicita(locatorBtnAcceder));
    }

   //public void irARegistrate(){click(esperaExplicita(locatorBtnRegistrate));}

}
