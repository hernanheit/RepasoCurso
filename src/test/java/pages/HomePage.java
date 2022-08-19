package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class HomePage extends BaseClass {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Centranlizan los localizadores y acciones del sitio
    //Se localiza el input para ingresar el mail y la contraseña y el boton de inicio
    By locatorTxtEmail = By.xpath("//input[@id='email']");
    By locatorTxtPass = By.xpath("//input[@id='pass']");
    By locatorBtnIniciar = By.xpath("//button[@name='login']");
    By locatorLblError = By.cssSelector("body._39il._97vt._97vz._97v-._97v_._97w2._97w0._9ax-._9ax_._9ay1.UIPage_LoggedOut._-kb._605a.b_c3pyn-ahh.chrome.webkit.win.x1.Locale_es_LA.cores-gte4._19_u:nth-child(2) div._li:nth-child(2) div.uiContextualLayerParent:nth-child(1) div.fb_content.clearfix:nth-child(1) div._4-u5._30ny div._4-u2._1w1t._4-u8._52jv div.login_form_container form:nth-child(1) div:nth-child(4) div.clearfix._5466._44mg:nth-child(12) div._9ay7:nth-child(2) > a:nth-child(1)");
    By locatorBtnEspanol = By.xpath("//a[contains(text(),'Español')]");
    //By locatorBtnRegistrate = By.xpath("//button[contains(text(),'Registra')]");

    //Acciones de la pagina
    public void IniciarSesion(String correo, String pass){
        agregarTexto(esperaExplicita(locatorTxtEmail),correo);
        agregarTexto(esperaExplicita(locatorTxtPass),pass);
        click(esperaExplicita(locatorBtnIniciar));
    }

    public void PasarEspanol() {
        click(esperaExplicita(locatorBtnEspanol));
    }
    public String obtenerErrorLogin(){
        return obtenerTexto(esperaExplicita(locatorLblError));
    }

}
