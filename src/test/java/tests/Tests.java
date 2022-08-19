package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;
import pages.StartPage;
import pages.WelcomePage;
import utils.DataDriven;
import utils.PropertiesDriven;

import java.util.ArrayList;

public class Tests {
    //declarar atributos
    private WebDriver driver;
    private HomePage homePage;
    private WelcomePage welcomePage;
    private StartPage startPage;
    private ArrayList<String> dataCPs;

    @BeforeTest
    public void preparacionEjecucion(){
        //Instanciar los objetos

        dataCPs = new ArrayList<String>();
        homePage = new HomePage(driver);
        homePage.conexionDriver(PropertiesDriven.getProperty("browser"),PropertiesDriven.getProperty("rutaDriver"),
                PropertiesDriven.getProperty("propertyDriver"));
        welcomePage = new WelcomePage(homePage.getDriver());
        homePage.cargarSitio(PropertiesDriven.getProperty("url"));
        homePage.maximizarBrowser();
    }

    //@BeforeMethod
    //public void preparacionPrueba(){
    //    homePage.cargarSitio(PropertiesDriven.getProperty("url"));
    //    homePage.maximizarBrowser();
    //}

    /*@AfterMethod
    public void posPrueba(){
            loginPage.cerrarBrowser();
    } */
    @Test
    public void CP001_login_fallido(){
        //Preparar data
        dataCPs = DataDriven.getData("CP001_login_fallido");

        //homePage.esperarXSegundos(60000);

        homePage.PasarEspanol();

        homePage.IniciarSesion(dataCPs.get(1),dataCPs.get(2));

        Assert.assertEquals(homePage.obtenerErrorLogin(), dataCPs.get(3));

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
