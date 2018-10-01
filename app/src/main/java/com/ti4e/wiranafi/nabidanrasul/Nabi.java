package com.ti4e.wiranafi.nabidanrasul;

public class Nabi {
    private String nama_nabi,deskripsi;
    public static final Nabi[]kisahnabi={
            new Nabi("Nabi Adam","Nabi pertama"),
            new Nabi("Nabi Idris","Nabi kedua"),
            new Nabi("Nabi Nuh","Nabi ketiga dan rasul pertama"),
    };

    private Nabi(String name, String description) {
        this.nama_nabi = name;
        this.deskripsi = description;
    }

    public String getNama_nabi() {
        return nama_nabi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
    public String toString(){
        return this.nama_nabi;
    }
}
