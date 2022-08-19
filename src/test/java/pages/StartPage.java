package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class StartPage extends BaseClass {

    public StartPage(WebDriver driver) {
        super(driver);
    }

    //Centralizar los localizadore y acciones de la page
    //By locatorTxtCorreo = By.xpath("//input[@id='identifierId']");
    //By locatorTxtPassword = By.xpath("//input[@id='login-password']");

    //By locatorBtnLogin = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]");

    //By locatorLblErrorLogin = By.xpath("//span[contains(text(),'No puedes acceder')]");


    //public void iniciarSesion(String correo){
    //    agregarTexto(esperaExplicita(locatorTxtCorreo),correo);
    //    click(esperaExplicita(locatorBtnLogin));
    //}

    //public String obtenerErrorLogin(){
    //    return obtenerTexto(esperaExplicita(locatorLblErrorLogin));
    //}
}
