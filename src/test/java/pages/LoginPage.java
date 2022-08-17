package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class LoginPage extends BaseClass {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //Centralizar los localizadore y acciones de la page
    By locatorTxtCorreo = By.xpath("//input[@id='identifierId']");

    By locatorTxtPassword = By.xpath("//input[@id='login-password']");

    By locatorBtnLogin = By.xpath("//span[contains(text(),'Siguiente')]");

    By locatorLblErrorLogin = By.xpath("//span[contains(text(),'No puedes acceder')]");


    public void iniciarSesion(String correo){
        agregarTexto(esperaExplicita(locatorTxtCorreo),correo);
        click(esperaExplicita(locatorBtnLogin));
    }

    public String obtenerErrorLogin(){
        return obtenerTexto(esperaExplicita(locatorLblErrorLogin));
    }
}
