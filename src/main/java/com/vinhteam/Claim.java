/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinhteam;

import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author ztl1
 */

public class Claim {
    int id;
    Date date;
    
    List<ClaimDtl> claimDtl;
    
    public Claim(){
        
    }
    public Claim(int id, Date date){
        this.id = id;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<ClaimDtl> getClaimDtl() {
        return claimDtl;
    }

    public void setClaimDtl(List<ClaimDtl> claimDtl) {
        this.claimDtl = claimDtl;
    }
    
    
}
