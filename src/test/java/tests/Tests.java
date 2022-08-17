package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;
import pages.LoginPage;
import utils.DataDriven;
import utils.PropertiesDriven;

import java.util.ArrayList;

public class Tests {
    //declarar atributos
    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private ArrayList<String> dataCPs;


    /*@AfterMethod
    public void preparacionPrueba(){
            loginPage.cerrarBrowser();
    } */

    @BeforeMethod
    public void posPrueba(){
        //Instanciar los objetos

        dataCPs = new ArrayList<String>();
        homePage = new HomePage(driver);
        homePage.conexionDriver
                (PropertiesDriven.getProperty("browser"),
                        PropertiesDriven.getProperty("rutaDriver"),
                        PropertiesDriven.getProperty("propertyDriver"));

        loginPage = new LoginPage(homePage.getDriver());

        homePage.cargarSitio(PropertiesDriven.getProperty("url"));
        homePage.maximizarBrowser();
    }

    @Test
    public void CP001_login_fallido(){
        //Preparar data
        dataCPs = DataDriven.getData("CP001_login_fallido");

        //homePage.esperarXSegundos(60000);

        homePage.irAIniciarSesion();
        loginPage.iniciarSesion(dataCPs.get(1));
        Assert.assertEquals(loginPage.obtenerErrorLogin(),dataCPs.get(3));
    }

   /* @Test
    public void CP002(){

    }

    @Test
    public void CP003(){

    }

    @Test
    public void CP004(){

    }

    @Test
    public void CP005(){

    }

    @Test
    public void CP006()
    }

    @Test
    public void CP007(){

    }

    @Test
    public void CP008(){

    }
    */

}
