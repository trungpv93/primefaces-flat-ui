/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinhteam;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author ztl1
 */
@ManagedBean(name = "claimBean")
@RequestScoped
public class ClaimBean implements Serializable {

    static List<Claim> claimList = null;
    Claim current;

    public ClaimBean() {
        initClaimList();
    }

    public Claim getCurrent() {
        return current;
    }

    public void setCurrent(Claim current) {
        this.current = current;
    }

    public List<Claim> getClaimList() {
        //initClaimList();
        return claimList;
    }

    private void initClaimList() {
        
        if(claimList != null) return ;
        
        int i = 1;

        claimList = new ArrayList<>();
        claimList.add(new Claim(i++, new Date()));
        claimList.add(new Claim(i++, new Date()));
        claimList.add(new Claim(i++, new Date()));
        claimList.add(new Claim(i++, new Date()));
        claimList.add(new Claim(i++, new Date()));
        claimList.add(new Claim(i++, new Date()));
        claimList.add(new Claim(i++, new Date()));
        claimList.add(new Claim(i++, new Date()));
        claimList.add(new Claim(i++, new Date()));
        claimList.add(new Claim(i++, new Date()));
        claimList.add(new Claim(i++, new Date()));
        claimList.add(new Claim(i++, new Date()));
        claimList.add(new Claim(i++, new Date()));
        claimList.add(new Claim(i++, new Date()));
        claimList.add(new Claim(i++, new Date()));
        claimList.add(new Claim(i++, new Date()));
        claimList.add(new Claim(i++, new Date()));
        claimList.add(new Claim(i++, new Date()));
    }

    public String populateClaimList() {

        initClaimList();
        return "claim-list";
    }

    public String displayClaim(int id) {
        for (Claim obj : claimList) {
            if (obj.getId() == id) {
                current = obj;
            }
        }
        return "recipe04_01c";
    }

    public List<String> complete(String text) {
        List<String> results = new ArrayList();
        // This should print each time you type a letter in the autocomplete box
        System.out.println("completing: " + text);
        for (Claim obj : claimList) {
            //if(author.getLast().toUpperCase().contains(text.toUpperCase())){
            results.add(obj.getId() + " " + obj.getDate());
            //}
        }

        return results;
    }

    public void searchClaims() {

    }

    public void deleteAction(Claim obj) {
        claimList.remove(obj);
    }
}
