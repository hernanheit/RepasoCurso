package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    @AfterMethod
    public void posPrueba(){
        homePage.cerrarBrowser();
    }

    @BeforeMethod
    public void preparacionEjecucion(){
        //Instanciar los objetos

        dataCPs = new ArrayList<String>();
        homePage = new HomePage(driver);
        homePage.conexionDriver(PropertiesDriven.getProperty("browser"),PropertiesDriven.getProperty("rutaDriver"),
                PropertiesDriven.getProperty("propertyDriver"));
        welcomePage = new WelcomePage(homePage.getDriver());
        startPage = new StartPage(homePage.getDriver());
        homePage.cargarSitio(PropertiesDriven.getProperty("url"));
        //resultadoDeBusquedaPage = new ResultadoDeBusquedaPage(welcomePage.getDriver());
        homePage.maximizarBrowser();

    }

    @Test
    public void CP001_login_fallido(){
        //Preparar data
        dataCPs = DataDriven.getData("CP001_login_fallido");

        //homePage.esperarXSegundos(60000);

        homePage.pasarEspanol();

        homePage.iniciarSesion(dataCPs.get(1),dataCPs.get(2));

        Assert.assertEquals(homePage.obtenerErrorLogin(), dataCPs.get(3));

    }

    @Test
    public void CP002_login_exitoso(){
        //Preparar data
        dataCPs = DataDriven.getData("CP002_login_exitoso");

        //homePage.esperarXSegundos(60000);

        homePage.pasarEspanol();

        homePage.iniciarSesion(dataCPs.get(1),dataCPs.get(2));

        Assert.assertEquals(welcomePage.obtenerMsjBienvenida(), dataCPs.get(3));

    }

    @Test
    public void CP003_cerrar_sesion(){
        //Preparar data
        dataCPs = DataDriven.getData("CP003_cerrar_sesion");

        homePage.pasarEspanol();
        homePage.iniciarSesion(dataCPs.get(1),dataCPs.get(2));
        welcomePage.cerrarSesion();

        Assert.assertEquals(homePage.obtenerIniciarSesion(), dataCPs.get(3));

    }

    @Test
    public void CP004_modo_oscuro(){
        //Preparar data
        dataCPs = DataDriven.getData("CP004_modo_oscuro");

        homePage.pasarEspanol();
        homePage.iniciarSesion(dataCPs.get(1),dataCPs.get(2));
        welcomePage.activarModoOscuro();
        String resultado = welcomePage.verificarModoOscuro();

        Assert.assertEquals(resultado,dataCPs.get(3));

    }

    @Test
    public void CP010_crear_historia(){
        dataCPs = DataDriven.getData("CP010_crear_historia");
        homePage.pasarEspanol();
        homePage.iniciarSesion(dataCPs.get(1),dataCPs.get(2));
        welcomePage.irInicio();
        startPage.crearHistoria(dataCPs.get(3));
        String resultado = startPage.leerHistoria();
        Assert.assertEquals(resultado,dataCPs.get(3));
    }

    /*@Test
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
