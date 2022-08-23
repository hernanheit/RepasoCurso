package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class WelcomePage extends BaseClass {
    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    //Centranlizan los localizadores y acciones del sitio
    By locatorBtnIrInicio = By.xpath("//body/div[@id='mount_0_0_0A']/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]");
    By locatorBtnCuenta = By.xpath("//body/div[@id='mount_0_0_0A']/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/span[1]/div[1]");
    By locatorBtnPantalla = By.xpath("//body/div[@id='mount_0_0_7u']/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]");
    By locatorBtnActivado = By.xpath("//body/div[@id='mount_0_0_7u']/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/label[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");
    By locatorLblBinvenida = By.xpath("//span[contains(text(),'Te damos la bienvenida a Facebook, Juan')]");
    By locatorBtnBusqueda = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/input[1]");
    By locatorLblTsoft = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/div[1]/a[1]/div[1]/div[2]/div[1]");
    By locatorBtnBuscar = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/ul[1]/li[1]/div[1]/a[1]/div[1]/div[2]/span[1]/span[1]");

    //Acciones de la pagina
    public void IrInicio(){
        click(esperaExplicita(locatorBtnIrInicio));
    }

    public void ActivarModoOscuro() {
        click(esperaExplicita(locatorBtnCuenta));
        click(esperaExplicita(locatorBtnPantalla));
        click(esperaExplicita(locatorBtnActivado));
    }

    public void CerrarSesion() {
        click(esperaExplicita(locatorBtnCuenta));

    }
    public String obtenerMsjBienvenida(){

        esperarXSegundos(10000);
        return obtenerTexto(esperaExplicita(locatorLblBinvenida));
    }

    public void buscarPag(String pag){
        agregarTexto(esperaExplicita(locatorBtnBusqueda),pag);
    }

    public String obtenerPagBuscada (){
        return obtenerTexto(esperaExplicita(locatorLblTsoft));
    }

    public void irAPagBuscada (){
        click(esperaExplicita(locatorLblTsoft));
    }

    public void buscarPersona(String persona){
        agregarTexto(esperaExplicita(locatorBtnBusqueda),persona);
    }

    public void clickBuscar (){
        click(esperaExplicita(locatorBtnBuscar));
    }

}
