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
public class CAModel {
    
    private String gstin,fp,filing_typ,fil_dt;
    private int gt,cur_gt;
    private List<b2b>b2b;
    private List<b2cs>b2cs;

    public String getGstin() {
        return gstin;
    }

    public void setGstin(String gstin) {
        this.gstin = gstin;
    }

    public String getFp() {
        return fp;
    }

    public void setFp(String fp) {
        this.fp = fp;
    }

    public String getFiling_typ() {
        return filing_typ;
    }

    public void setFiling_typ(String filing_typ) {
        this.filing_typ = filing_typ;
    }

    public String getFil_dt() {
        return fil_dt;
    }

    public void setFil_dt(String fil_dt) {
        this.fil_dt = fil_dt;
    }

    public int getGt() {
        return gt;
    }

    public void setGt(int gt) {
        this.gt = gt;
    }

    public int getCur_gt() {
        return cur_gt;
    }

    public void setCur_gt(int cur_gt) {
        this.cur_gt = cur_gt;
    }

    public List<b2b> getB2b() {
        return b2b;
    }

    public void setB2b(List<b2b> b2b) {
        this.b2b = b2b;
    }

    public List<b2cs> getB2cs() {
        return b2cs;
    }

    public void setB2cs(List<b2cs> b2cs) {
        this.b2cs = b2cs;
    }
    
    
}
