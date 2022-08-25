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

    By locatorBtnCrear = By.xpath("//a[@aria-label='Crear historia']");
    By locatorBtnTxt = By.cssSelector("body._6s5d._71pn.system-fonts--body.segoe:nth-child(2) div.bdao358l.om3e55n1.g4tp4svg div.__fb-light-mode.om3e55n1.b0ur3jhr div.bdao358l.om3e55n1.g4tp4svg:nth-child(1) div.alzwoclg.cqf1kptm.i7qc65dt.om3e55n1.jvmnlx2p div.alzwoclg.cqf1kptm.i7qc65dt.om3e55n1.g4tp4svg.ednat9xy:nth-child(3) div.bdao358l.jez8cy9q.t5n4vrf6.o9w3sbdw.sr926ui1.jl2a5g8c.alzwoclg.cgu29s5g.fawcizw8.om3e55n1.g4tp4svg div.bdao358l.om3e55n1.g4tp4svg.cqf1kptm.gvxzyvdx.aeinzg81.jg3vgc78.cgu29s5g.i15ihif8.alzwoclg.fawcizw8:nth-child(2) div.alzwoclg.cqf1kptm.cgu29s5g.fawcizw8.aeinzg81.om3e55n1.g4tp4svg div.fawcizw8.gvxzyvdx.jcxyg2ei.alzwoclg.o9w3sbdw div.mfclru0v.fawcizw8.gvxzyvdx.cqf1kptm.alzwoclg.i85zmo3j.jcxyg2ei div.alzwoclg.sl27f92c.mfclru0v > div.qi72231t.o9w3sbdw.nu7423ey.tav9wjvu.flwp5yud.tghlliq5.gkg15gwv.s9ok87oh.s9ljgwtm.lxqftegz.bf1zulr9.frfouenu.bonavkto.djs4p424.r7bn319e.bdao358l.fsf7x5fv.tgm57n0e.jez8cy9q.s5oniofx.m8h3af8h.l7ghb35v.kjdc1dyq.kmwttqpk.dnr7xe2t.aeinzg81.srn514ro.oxkhqvkx.rl78xhln.nch0832m.om3e55n1.cr00lzj9.rn8ck1ys.s3jn8y49.g4tp4svg.o9erhkwx.dzqi5evh.hupbnkgi.hvb2xoa8.fxk3tzhb.jl2a5g8c.f14ij5to.l3ldwz01.icdlwmnq.awdgmi6d:nth-child(3)");
    By locatorTxtArea = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/textarea[1]");
    By locatorBtnCrearHistoria = By.xpath("//span[contains(text(),'Compartir en historia')]");
    By locatorBtnVerHistoria = By.xpath("//a[@aria-label=\"Ver tu historia\"]");
    By locatorLblHistoria = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
    //By locatorLblErrorLogin = By.xpath("//span[contains(text(),'No puedes acceder')]");


    public void crearHistoria(String hist){
        click(esperaExplicita(locatorBtnCrear));
        click(esperaExplicita(locatorBtnTxt));
        agregarTexto(esperaExplicita(locatorTxtArea),hist);
        click(esperaExplicita(locatorBtnCrearHistoria));
    }

    public String leerHistoria(){
        esperarXSegundos(5000);
        click(esperaExplicita(locatorBtnVerHistoria));
        return obtenerTexto(esperaExplicita(locatorLblHistoria));
    }

    //public String obtenerErrorLogin(){
    //    return obtenerTexto(esperaExplicita(locatorLblErrorLogin));
    //}
}
