/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinhteam;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author ztl1
 */
@ManagedBean(name = "claimSearch")
@RequestScoped

public class ClaimSearch implements java.io.Serializable {

    private String searchText;
    private String errorText;
    
    @Inject
    private ClaimBean claimBean;

    public ClaimSearch() {

    }

    public String searchClaim(List<Claim> alist) {
        
        int id ;
        int idSearch = Integer.parseInt(searchText);
        String returnString = null;

        for (Claim obj : alist) {
            id = obj.getId();
            
            if (idSearch == id ) {
                returnString = getClaimBean().displayClaim(id);
            } 
        }
        if (returnString == null) {
            setErrorText("No Author Found");
            returnString = "recipe04_04a";
        }
        return returnString;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }

    public ClaimBean getClaimBean() {
        return claimBean;
    }

    public void setClaimBean(ClaimBean claimBean) {
        this.claimBean = claimBean;
    }

}
