package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BaseClass;

public class WelcomePage extends BaseClass {
    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    //Centranlizan los localizadores y acciones del sitio
    By locatorBtnIrInicio = By.cssSelector("body._6s5d._71pn.system-fonts--body.segoe:nth-child(2) div:nth-child(2) div:nth-child(1) div.bdao358l.om3e55n1.g4tp4svg div:nth-child(4) > div.l38y3qj3.ekq1a7f9.myo4itp8.khm9p5p9.p9ctufpz.k3q8kl47.cgu29s5g.alzwoclg.bdao358l.i85zmo3j:nth-child(1)");
    By locatorBtnCuenta = By.cssSelector("body._6s5d._71pn.system-fonts--body.segoe:nth-child(2) div.bdao358l.om3e55n1.g4tp4svg div.l38y3qj3.ekq1a7f9.khm9p5p9.lcfup58g.r227ecj6.on4d8346:nth-child(4) div.g4tp4svg.om3e55n1.k3q8kl47.ov4vj3he.alzwoclg.i85zmo3j:nth-child(1) span.f7rl1if4.adechonz.f6oz4yja.dahkl6ri.axrg9lpx.rufpak1n.qtovjlwq.qbmienfq.rfyhaz4c.rdmi1yqr.ohrdq8us.nswx41af.fawcizw8.l1aqi3e3.sdu1flz4:nth-child(1) div.alzwoclg.om3e55n1 > div.qi72231t.o9w3sbdw.nu7423ey.tav9wjvu.flwp5yud.tghlliq5.gkg15gwv.s9ok87oh.s9ljgwtm.lxqftegz.bf1zulr9.frfouenu.bonavkto.djs4p424.r7bn319e.bdao358l.fsf7x5fv.tgm57n0e.jez8cy9q.s5oniofx.m8h3af8h.l7ghb35v.kjdc1dyq.kmwttqpk.dnr7xe2t.aeinzg81.srn514ro.oxkhqvkx.rl78xhln.nch0832m.om3e55n1.cr00lzj9.rn8ck1ys.s3jn8y49.g4tp4svg.o9erhkwx.dzqi5evh.hupbnkgi.hvb2xoa8.jl2a5g8c.f14ij5to.l3ldwz01.icdlwmnq.pbevjfx6.aglvbi8b:nth-child(1)");
    By locatorBtnCuentaOscuro = By.cssSelector("body._6s5d._71pn.system-fonts--body.segoe:nth-child(2) div.bdao358l.om3e55n1.g4tp4svg div.l38y3qj3.ekq1a7f9.khm9p5p9.lcfup58g.r227ecj6.on4d8346:nth-child(4) div.g4tp4svg.om3e55n1.k3q8kl47.ov4vj3he.alzwoclg.i85zmo3j:nth-child(1) span.f7rl1if4.adechonz.f6oz4yja.dahkl6ri.axrg9lpx.rufpak1n.qtovjlwq.qbmienfq.rfyhaz4c.rdmi1yqr.ohrdq8us.nswx41af.fawcizw8.l1aqi3e3.sdu1flz4:nth-child(1) div.om3e55n1.alzwoclg > div.qi72231t.o9w3sbdw.nu7423ey.tav9wjvu.flwp5yud.tghlliq5.gkg15gwv.s9ok87oh.s9ljgwtm.lxqftegz.bf1zulr9.frfouenu.bonavkto.djs4p424.r7bn319e.bdao358l.fsf7x5fv.tgm57n0e.jez8cy9q.s5oniofx.m8h3af8h.l7ghb35v.kjdc1dyq.kmwttqpk.dnr7xe2t.aeinzg81.srn514ro.oxkhqvkx.rl78xhln.nch0832m.om3e55n1.cr00lzj9.rn8ck1ys.s3jn8y49.g4tp4svg.o9erhkwx.dzqi5evh.hupbnkgi.hvb2xoa8.jl2a5g8c.f14ij5to.l3ldwz01.icdlwmnq.pbevjfx6.aglvbi8b:nth-child(1)");
    By locatorBtnPantalla = By.cssSelector("body._6s5d._71pn.system-fonts--body.segoe:nth-child(2) div.bdao358l.om3e55n1.g4tp4svg div.l38y3qj3.ekq1a7f9.khm9p5p9.lcfup58g.r227ecj6.on4d8346:nth-child(4) div.__fb-light-mode div.buh8m867.esf8hl5h.s8sjc6am.ekq1a7f9:nth-child(1) div.th8rvtx1.f7rl1if4.adechonz.rufpak1n.qtovjlwq.qbmienfq.rfyhaz4c.rdmi1yqr.ohrdq8us.nswx41af.fawcizw8.l1aqi3e3.om3e55n1.sdu1flz4.dahkl6ri:nth-child(1) div.nthtkgg5 div.om3e55n1 div.bdao358l.k0kqjr44.kj5i7le4.g6da2mms.yn3a2qjl.b52o6v01.a96hb305.lq84ybu9.hf30pyar div.kbriqh63.r7ybg2qv.qbc87b33.jk4gexc9.alzwoclg.cqf1kptm.om3e55n1.g4tp4svg.ba4ynyj4.o565dech.mm05nxu8.izce65as.k3jjytnc.qa07fe1s.mm98tyaj div.alzwoclg.cqf1kptm.cgu29s5g.om3e55n1 div.ikduhi8d.icdlwmnq.lq84ybu9.hf30pyar.om3e55n1.ncxvlvn8 div.bdao358l.g4tp4svg.m4pnbp5e.ctyh02ob.ahndzqod.s8sjc6am.myo4itp8.ekq1a7f9.cdum9rwi.bjrpyg6s.mfclru0v:nth-child(1) div.om3e55n1.g4tp4svg.bdao358l.alzwoclg.cqf1kptm.gvxzyvdx.thmcm15y.cgu29s5g.i15ihif8.dnr7xe2t.q46jt4gp div.bdao358l.om3e55n1.g4tp4svg.alzwoclg.cqf1kptm.cgu29s5g.dnr7xe2t.sl27f92c div.bdao358l.om3e55n1.g4tp4svg.alzwoclg.cqf1kptm.jez8cy9q.gvxzyvdx:nth-child(1) div.nch0832m.r5g9zsuq.oxkhqvkx.d2hqwtrz div.i1n1lj7b.mmwt03ec div:nth-child(3) div.qi72231t.o9w3sbdw.nu7423ey.tav9wjvu.flwp5yud.tghlliq5.gkg15gwv.s9ok87oh.s9ljgwtm.lxqftegz.bf1zulr9.frfouenu.bonavkto.djs4p424.r7bn319e.bdao358l.fsf7x5fv.tgm57n0e.jez8cy9q.s5oniofx.m8h3af8h.l7ghb35v.kjdc1dyq.kmwttqpk.dnr7xe2t.aeinzg81.srn514ro.oxkhqvkx.rl78xhln.nch0832m.om3e55n1.cr00lzj9.rn8ck1ys.s3jn8y49.g4tp4svg.jl2a5g8c.f14ij5to.l3ldwz01.icdlwmnq.h8391g91.m0cukt09.kpwa50dg.ta68dy8c.b6ax4al1 > div.s9ok87oh.bf1zulr9.s9ljgwtm.lxqftegz.frfouenu.r7bn319e.bonavkto.djs4p424.bdao358l.alzwoclg.cgu29s5g.i15ihif8.sl27f92c.m8h3af8h.l7ghb35v.kjdc1dyq.kmwttqpk.aeinzg81.srn514ro.rl78xhln.om3e55n1.g4tp4svg.i85zmo3j.jl2a5g8c.b0eko5f3.fwlpnqze.il7dmu95");
    By locatorBtnActivado = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/label[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");
    By locatorLblBinvenida = By.xpath("//span[contains(text(),'Te damos la bienvenida a Facebook, Juan')]");
    By locatorBtnCerrar = By.xpath("//span[contains(text(),'Cerrar sesión')]");
    By locatorHtml = By.xpath("//html");

    //Acciones de la pagina
    public void irInicio(){
        click(esperaExplicita(locatorBtnIrInicio));
    }

    public void activarModoOscuro() {
        click(esperaExplicita(locatorBtnCuenta));
        click(esperaExplicita(locatorBtnPantalla));
        esperarXSegundos(1500);
        click(esperaExplicita(locatorBtnActivado));
        click(esperaExplicita(locatorBtnCuentaOscuro));
    }

    public String verificarModoOscuro() {
        WebElement html = esperaExplicita(locatorHtml);
        String color = html.getAttribute("class");
        //driver.quit();
        return color.substring(11);
        //*[contains(@class, '_9dls __fb-dark-mode')]
        //*[@class = '_9dls __fb-dark-mode' or @ class="_9dls __fb-light-mode"]

    }

    public void cerrarSesion() {
        click(esperaExplicita(locatorBtnCuenta));
        click(esperaExplicita(locatorBtnCerrar));
    }
    public String obtenerMsjBienvenida(){
        return obtenerTexto(esperaExplicita(locatorLblBinvenida));
    }

}
