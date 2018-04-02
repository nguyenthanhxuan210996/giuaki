package com.example.nguyenthanhxuan.thigiuakinguyenthanhxuann14dcpt205;

/**
 * Created by Nguyen Thanh Xuan on 4/2/2018.
 */

public class Money {
    private String nd;
    private String sotien;
    private int hinhthuc;

    public Money(String nd, String sotien, int hinhthuc) {
        this.nd = nd;
        this.sotien = sotien;
        this.hinhthuc = hinhthuc;
    }

    public String getNd() {
        return nd;
    }

    public void setNd(String nd) {
        this.nd = nd;
    }

    public String getSotien() {
        return sotien;
    }

    public void setSotien(String sotien) {
        this.sotien = sotien;
    }

    public int getHinhthuc() {
        return hinhthuc;
    }

    public void setHinhthuc(int hinhthuc) {
        this.hinhthuc = hinhthuc;
    }


}
