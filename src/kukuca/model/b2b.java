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
public class b2b {
    private String ctin,cfs,cname;
    private List<Invoice>inv;

    public String getCtin() {
        return ctin;
    }

    public void setCtin(String ctin) {
        this.ctin = ctin;
    }

    public String getCfs() {
        return cfs;
    }

    public void setCfs(String cfs) {
        this.cfs = cfs;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<Invoice> getInv() {
        return inv;
    }

    public void setInv(List<Invoice> inv) {
        this.inv = inv;
    }
    
    
}
