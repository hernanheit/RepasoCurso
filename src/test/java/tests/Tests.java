package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;
import pages.ResultadoDeBusquedaPage;
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
    private ResultadoDeBusquedaPage resultadoDeBusquedaPage;

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
        resultadoDeBusquedaPage = new ResultadoDeBusquedaPage(welcomePage.getDriver());
        homePage.maximizarBrowser();
        homePage.pasarEspanol();

    }

    //@BeforeMethod
    //public void preparacionPrueba(){
    //    homePage.cargarSitio(PropertiesDriven.getProperty("url"));
    //    homePage.maximizarBrowser();
    //}

    @Test
    public void CP001_login_fallido(){
        //Preparar data
        dataCPs = DataDriven.getData("CP001_login_fallido");

        //homePage.esperarXSegundos(60000);

        homePage.iniciarSesion(dataCPs.get(1),dataCPs.get(2));

        Assert.assertEquals(homePage.obtenerErrorLogin(), dataCPs.get(3));

    }

    @Test
    public void CP002_login_exitoso(){
        //Preparar data
        dataCPs = DataDriven.getData("CP002_login_exitoso");

        //homePage.esperarXSegundos(60000);

        homePage.iniciarSesion(dataCPs.get(1),dataCPs.get(2));

        Assert.assertEquals(welcomePage.obtenerMsjBienvenida(), dataCPs.get(3));

    }

    @Test
    public void CP003_cerrar_sesion(){
        //Preparar data
        dataCPs = DataDriven.getData("CP003_cerrar_sesion");

        homePage.iniciarSesion(dataCPs.get(1),dataCPs.get(2));
        welcomePage.cerrarSesion();

        Assert.assertEquals(homePage.obtenerIniciarSesion(), dataCPs.get(3));

    }

    @Test
    public void CP004_modo_oscuro(){
        //Preparar data
        dataCPs = DataDriven.getData("CP004_modo_oscuro");

        homePage.iniciarSesion(dataCPs.get(1),dataCPs.get(2));
        welcomePage.activarModoOscuro();
        String resultado = welcomePage.verificarModoOscuro();

        Assert.assertEquals(resultado,dataCPs.get(3));

    }
    public void CP005_buscar_persona(){
        dataCPs = DataDriven.getData("CP005_buscar_persona");
        homePage.iniciarSesion(dataCPs.get(1),dataCPs.get(2));
        welcomePage.buscarPag(dataCPs.get(3));
        welcomePage.clickBuscar();
        Assert.assertEquals(resultadoDeBusquedaPage.ResultadoDeBusqueda().toLowerCase(), dataCPs.get(3).toLowerCase());
     }

    @Test
    public void CP006_enviar_solicitud(){
        dataCPs = DataDriven.getData("CP006_enviar_solicitud");
        homePage.iniciarSesion(dataCPs.get(1),dataCPs.get(2));
        welcomePage.buscarPag(dataCPs.get(3));
        welcomePage.clickBuscar();
        resultadoDeBusquedaPage.irAlPerfil();
        resultadoDeBusquedaPage.enviarSolicitud();
        Assert.assertEquals(resultadoDeBusquedaPage.solicitudEnviada(),dataCPs.get(4));
}
    public void CP010_crear_historia(){
        dataCPs = DataDriven.getData("CP010_crear_historia");
        homePage.iniciarSesion(dataCPs.get(1),dataCPs.get(2));
        welcomePage.irInicio();
        startPage.crearHistoria(dataCPs.get(3));
        String resultado = startPage.leerHistoria();
        Assert.assertEquals(resultado,dataCPs.get(3));
    }



    @Test
    public void CP007_cancelar_solicitud(){
        dataCPs = DataDriven.getData("CP007_cancelar_solicitud");
        homePage.iniciarSesion(dataCPs.get(1),dataCPs.get(2));
        welcomePage.buscarPag(dataCPs.get(3));
        welcomePage.clickBuscar();
        resultadoDeBusquedaPage.irAlPerfil();
        resultadoDeBusquedaPage.cancelarSolicitud();
        Assert.assertEquals(resultadoDeBusquedaPage.solicitudCancelada(),dataCPs.get(4));

    }

    @Test
    public void CP008_Darle_Me_gusta_a_una_pagina(){
        dataCPs = DataDriven.getData("CP008_meGusta_pagina");
        homePage.iniciarSesion(dataCPs.get(1),dataCPs.get(2));
        welcomePage.buscarPag(dataCPs.get(3));
        welcomePage.obtenerPagBuscada();
        if (welcomePage.obtenerPagBuscada().contains(dataCPs.get(3))){
            welcomePage.irAPagBuscada();
        }
        resultadoDeBusquedaPage.darMeGusta();
        Assert.assertEquals(resultadoDeBusquedaPage.obtenerMeGusta(), dataCPs.get(4));
    }


}
