package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BaseClass;

public class ResultadoDeBusquedaPage extends BaseClass {
    public ResultadoDeBusquedaPage(WebDriver driver) {
        super(driver);
    }

    By locatorBtnMeGustaTsoft = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/span[1]/div[1]");

    By locatorBtnMeGustaDadoTsoft = By.xpath("//span[contains(text(),'Te gusta')]");
    By locatorBtnAgregar = By.xpath("//span[contains(text(),'Agregar')]");
    By locatorBtnCancelarSolicitud = By.xpath("//span[contains(text(),'Cancelar solicitud')]");
    By locatorLblSolicitudEnviada = By.cssSelector("body._6s5d._71pn.system-fonts--body.segoe:nth-child(2) div.bdao358l.om3e55n1.g4tp4svg div.bdao358l.om3e55n1.g4tp4svg:nth-child(6) div.g4tp4svg.om3e55n1.cqf1kptm.alzwoclg div.alzwoclg.cqf1kptm.om3e55n1 div.alzwoclg.cqf1kptm.om3e55n1.kyj84mfa.cofpoq2j div.alzwoclg.cqf1kptm.p1t2w4gn.fawcizw8.om3e55n1.g4tp4svg:nth-child(1) div.bdao358l.jez8cy9q.t5n4vrf6.o9w3sbdw.sr926ui1.jl2a5g8c.alzwoclg.cgu29s5g.fawcizw8.om3e55n1.g4tp4svg.qkxw7tbt:nth-child(1) div.bdao358l.om3e55n1.g4tp4svg.cqf1kptm.gvxzyvdx.aeinzg81.jg3vgc78.cgu29s5g.i15ihif8.alzwoclg.fawcizw8:nth-child(2) div.alzwoclg.cqf1kptm.cgu29s5g.fawcizw8.aeinzg81.om3e55n1.g4tp4svg div.fawcizw8.gvxzyvdx.jcxyg2ei.alzwoclg.o9w3sbdw div.mfclru0v.fawcizw8.gvxzyvdx.cqf1kptm.alzwoclg.i85zmo3j div.ir39z7dx.rnqnthk4.dhod7fyx.m0q6goh4.gvxzyvdx.bdao358l div.gvxzyvdx.d7kh8n3f div.p8bdhjjv div.alzwoclg.om3e55n1.mfclru0v div.bdao358l.om3e55n1.g4tp4svg.oab4agdp.g6da2mms.yn3a2qjl.b52o6v01.a96hb305.mfclru0v.lq84ybu9.hf30pyar.b3dzj11p div.r6ydv39a.rj0o91l8.p8bdhjjv.p9ctufpz div.rj2hsocd.n3hqoq4p.srn514ro:nth-child(1) div.alzwoclg div.j0k7ypqs.jcxyg2ei.cqf1kptm.alzwoclg span.f7rl1if4.adechonz.f6oz4yja.dahkl6ri.axrg9lpx.rufpak1n.qtovjlwq.qbmienfq.rfyhaz4c.rdmi1yqr.ohrdq8us.nswx41af.fawcizw8.l1aqi3e3.sdu1flz4 div.qi72231t.n3hqoq4p.r86q59rh.b3qcqh3k.fq87ekyn.fsf7x5fv.s5oniofx.m8h3af8h.l7ghb35v.kjdc1dyq.kmwttqpk.cr00lzj9.rn8ck1ys.s3jn8y49.f14ij5to.l3ldwz01.icdlwmnq.i85zmo3j.qmqpeqxj.e7u6y3za.qwcclf47.nmlomj2f.frfouenu.bonavkto.djs4p424.r7bn319e.bdao358l.alzwoclg.jcxyg2ei.srn514ro.oxkhqvkx.rl78xhln.nch0832m.om3e55n1.jvc6uz2b.g90fjkqk.dqxcxcok > i.gneimcpu.a3axapz1");

    By locatorBtnSolicitudNoEnviada = By.cssSelector("body._6s5d._71pn.system-fonts--body.segoe:nth-child(2) div.bdao358l.om3e55n1.g4tp4svg div.bdao358l.om3e55n1.g4tp4svg:nth-child(6) div.g4tp4svg.om3e55n1.cqf1kptm.alzwoclg div.alzwoclg.cqf1kptm.om3e55n1 div.alzwoclg.cqf1kptm.om3e55n1.kyj84mfa.cofpoq2j div.alzwoclg.cqf1kptm.p1t2w4gn.fawcizw8.om3e55n1.g4tp4svg:nth-child(1) div.bdao358l.jez8cy9q.t5n4vrf6.o9w3sbdw.sr926ui1.jl2a5g8c.alzwoclg.cgu29s5g.fawcizw8.om3e55n1.g4tp4svg.qkxw7tbt:nth-child(1) div.bdao358l.om3e55n1.g4tp4svg.cqf1kptm.gvxzyvdx.aeinzg81.jg3vgc78.cgu29s5g.i15ihif8.alzwoclg.fawcizw8:nth-child(2) div.alzwoclg.cqf1kptm.cgu29s5g.fawcizw8.aeinzg81.om3e55n1.g4tp4svg div.fawcizw8.gvxzyvdx.jcxyg2ei.alzwoclg.o9w3sbdw div.mfclru0v.fawcizw8.gvxzyvdx.cqf1kptm.alzwoclg.i85zmo3j div.ir39z7dx.rnqnthk4.dhod7fyx.m0q6goh4.gvxzyvdx.bdao358l div.gvxzyvdx.d7kh8n3f div.p8bdhjjv div.alzwoclg.om3e55n1.mfclru0v div.bdao358l.om3e55n1.g4tp4svg.oab4agdp.g6da2mms.yn3a2qjl.b52o6v01.a96hb305.mfclru0v.lq84ybu9.hf30pyar.b3dzj11p div.r6ydv39a.rj0o91l8.p8bdhjjv.p9ctufpz div.rj2hsocd.n3hqoq4p.srn514ro:nth-child(1) div.alzwoclg div.j0k7ypqs.jcxyg2ei.cqf1kptm.alzwoclg span.f7rl1if4.adechonz.f6oz4yja.dahkl6ri.axrg9lpx.rufpak1n.qtovjlwq.qbmienfq.rfyhaz4c.rdmi1yqr.ohrdq8us.nswx41af.fawcizw8.l1aqi3e3.sdu1flz4 div.qi72231t.n3hqoq4p.r86q59rh.b3qcqh3k.fq87ekyn.fsf7x5fv.s5oniofx.m8h3af8h.l7ghb35v.kjdc1dyq.kmwttqpk.cr00lzj9.rn8ck1ys.s3jn8y49.f14ij5to.l3ldwz01.icdlwmnq.i85zmo3j.qmqpeqxj.e7u6y3za.qwcclf47.nmlomj2f.frfouenu.bonavkto.djs4p424.r7bn319e.bdao358l.alzwoclg.jcxyg2ei.srn514ro.oxkhqvkx.rl78xhln.nch0832m.om3e55n1.jvc6uz2b.g90fjkqk.a5wdgl2o > i.gneimcpu.b0w474w7");
    By locatorLblResultadoBusqueda = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h3[1]/span[1]/span[1]/span[1]/a[1]/span[1]");
    By locatorBtnPerfil = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h3[1]/span[1]/span[1]/span[1]/a[1]");


    public void darMeGusta() {
        click(esperaExplicita(locatorBtnMeGustaTsoft));
    }

    public String obtenerMeGusta() {
        return obtenerTexto(esperaExplicita(locatorBtnMeGustaDadoTsoft));
    }


    public String ResultadoDeBusqueda() {
        return obtenerTexto(esperaExplicita(locatorLblResultadoBusqueda));

    }

    public void enviarSolicitud() {
        if (esperaExplicita(locatorBtnAgregar).isEnabled()) {
            click(esperaExplicita(locatorBtnAgregar));
            }
    }


    public String cancelarSolicitud() {
        if (esperaExplicita(locatorBtnCancelarSolicitud).isEnabled()) {
            click(esperaExplicita(locatorBtnCancelarSolicitud));
        }

        return obtenerTexto(esperaExplicita(locatorBtnAgregar));
    }


    public String solicitudEnviada() {
        return obtenerTexto(esperaExplicita(locatorBtnCancelarSolicitud));
        }


    public String solicitudCancelada() {
        return obtenerTexto(esperaExplicita(locatorBtnAgregar));
    }

    public void irAlPerfil (){
        click(esperaExplicita(locatorBtnPerfil));
    }

}



