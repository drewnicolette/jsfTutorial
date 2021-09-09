/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.demo;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "SportData", eager = true)
@SessionScoped
public class SportData implements Serializable{
    
    public String sportData = "";
    public String numberTest = "";
    private String[] sportList = {"Basketball", "Baseball", "Tennis", "Football", "Soccer", "Boxing"};

    public String[] getSportList() {
        return sportList;
    }

    public String getNumberTest() {
        return numberTest;
    }

    public String getSportData() {
        return sportData;
    }
    
    public void setSportData(String data) {
        this.sportData = data;
    }

    public void setNumberTest(String numberTest) {
        this.numberTest = numberTest;
    }

    public void setSportList(String[] sportList) {
        this.sportList = sportList;
    }
    
}
