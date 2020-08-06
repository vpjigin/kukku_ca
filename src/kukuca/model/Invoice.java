/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kukuca.model;

import java.util.List;

/**
 *
 * @author Youtube
 */
public class Invoice {
    private double val;
    private String inv_typ,flag,updby,pos,idt,rchrg,cflag,inum,chksum;
    private List<Items>itms;

    public double getVal() {
        return val;
    }

    public void setVal(double val) {
        this.val = val;
    }

    public String getInv_typ() {
        return inv_typ;
    }

    public void setInv_typ(String inv_typ) {
        this.inv_typ = inv_typ;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getUpdby() {
        return updby;
    }

    public void setUpdby(String updby) {
        this.updby = updby;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getIdt() {
        return idt;
    }

    public void setIdt(String idt) {
        this.idt = idt;
    }

    public String getRchrg() {
        return rchrg;
    }

    public void setRchrg(String rchrg) {
        this.rchrg = rchrg;
    }

    public String getCflag() {
        return cflag;
    }

    public void setCflag(String cflag) {
        this.cflag = cflag;
    }

    public String getInum() {
        return inum;
    }

    public void setInum(String inum) {
        this.inum = inum;
    }

    public String getChksum() {
        return chksum;
    }

    public void setChksum(String chksum) {
        this.chksum = chksum;
    }

    public List<Items> getItms() {
        return itms;
    }

    public void setItms(List<Items> itms) {
        this.itms = itms;
    }
    
    
    
}
