package com.kardusinfo.presidentsubmission.database;

public class database {

    private int foto;
    private String usia;
    private String asal;
    private String description;
    private String nama;
    private String foto2;

    public database(int foto,String nama, String usia, String asal, String foto2, String description) {
        this.foto = foto;
        this.nama = nama;
        this.usia = usia;
        this.asal = asal;
        this.description = description;
        this.foto2 = foto2;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getUsia() {
        return usia;
    }

    public void setUsia(String usia) {
        this.usia = usia;
    }

    public String getAsal() {
        return asal;
    }

    public String getNama() {
        return nama;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getDescription() {
        return description;
    }
    public String getFoto2() {
        return foto2;
    }

    public void setFoto2(String foto2) {
        this.foto2 = foto2;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

