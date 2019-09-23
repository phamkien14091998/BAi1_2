package com.example.student.pdk_cau2;

public class Bai1 {
    private String ten;
    private String city;
    private int soluong;

    public Bai1(String ten, String city, int soluong) {
        this.ten = ten;
        this.city = city;
        this.soluong = soluong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
}
