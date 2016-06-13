/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.RequestScoped;
import java.util.Arrays;
import javax.faces.bean.ManagedBean;
@ManagedBean (name="ort")
//@RequestScoped
@SessionScoped
public class Ort {
double orta;
double sapma;
double aa,ba,bb,cb,cc,dc,dd;

    public double getAa() {
        return aa;
    }

    public double getDd() {
        return dd;
    }

    public double getDc() {
        return dc;
    }

    public double getCc() {
        return cc;
    }

    public double getCb() {
        return cb;
    }

    public double getBb() {
        return bb;
    }

    public double getBa() {
        return ba;
    }

    public void setOrta(double orta) {
        this.orta = orta;
    }

    public double getOrta() {
        return orta;
    }

    public double getSapma() {
        return sapma;
    }

    public void setSapma(double sapma) {
        this.sapma = sapma;
    }
public String hesaplar() {
    aa=80;
    ba=71;
    bb=63;
    cb=55;
    cc=50;
    dc=45;
    dd=35;
    if(orta<44) {
    aa=orta+1.881*sapma;
    ba=orta+1.405*sapma;
    bb=orta+0.760*sapma;
    cb=orta+0.332*sapma;
    cc=orta-0.176*sapma;
    dc=orta-0.643*sapma;
    dd=orta-1.175*sapma;
    }
    if(orta>=44 && orta<50) {
    aa=orta+1.645*sapma;
    ba=orta+1.175*sapma;
    bb=orta+0.524*sapma;
    cb=orta+0.126*sapma;
    cc=orta-0.468*sapma;
    dc=orta-0.878*sapma;
    dd=orta-1.405*sapma;
    }
    if(orta>=50 && orta<56) {
    aa=orta+1.476*sapma;
    ba=orta+0.994*sapma;
    bb=orta+0.358*sapma;
    cb=orta-0.075*sapma;
    cc=orta-0.772*sapma;
    dc=orta-1.126*sapma;
    dd=orta-1.645*sapma;
    }
    if(orta>=56 && orta<63) {
    aa=orta+1.227*sapma;
    ba=orta+0.739*sapma;
    bb=orta+0.126*sapma;
    cb=orta-0.358*sapma;
    cc=orta-0.878*sapma;
    dc=orta-1.227*sapma;
    dd=orta-1.751*sapma;
    }
    if(orta>=63 && orta<71) {
    aa=orta+0.915*sapma;
    ba=orta+0.385*sapma;
    bb=orta-0.075*sapma;
    cb=orta-0.524*sapma;
    cc=orta-0.994*sapma;
    dc=orta-1.341*sapma;
    dd=orta-1.881*sapma;
    }
    if(orta>=71 && orta<80) {
    aa=orta+0.583*sapma;
    ba=orta+0.1*sapma;
    bb=orta-0.305*sapma;
    cb=orta-0.739*sapma;
    cc=orta-1.126*sapma;
    dc=orta-1.476*sapma;
    dd=orta-2.054*sapma;
    }
    if( orta>=80) {
    aa=orta+0.440*sapma;
    ba=orta-0.1*sapma;
    bb=orta-0.496*sapma;
    cb=orta-0.915*sapma;
    cc=orta-1.282*sapma;
    dc=orta-1.645*sapma;
    dd=orta-2.326*sapma;
    }
return "sonuc";
}
}
