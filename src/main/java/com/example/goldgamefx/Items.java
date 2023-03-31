package com.example.goldgamefx;

public class Items {
    String name;
    int sReq, aReq, iReq, eReq;

    public Items(String name, int sReq, int aReq, int iReq, int eReq){
        this.name = name;
        this.eReq = eReq;
        this.sReq = sReq;
        this.iReq = iReq;
        this.aReq = aReq;
    }

    //region Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getsReq() {
        return sReq;
    }

    public void setsReq(int sReq) {
        this.sReq = sReq;
    }

    public int getaReq() {
        return aReq;
    }

    public void setaReq(int aReq) {
        this.aReq = aReq;
    }

    public int getiReq() {
        return iReq;
    }

    public void setiReq(int iReq) {
        this.iReq = iReq;
    }

    public int geteReq() {
        return eReq;
    }

    public void seteReq(int eReq) {
        this.eReq = eReq;
    }
    //endregion
}
