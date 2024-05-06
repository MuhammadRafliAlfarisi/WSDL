package com.example.pemograman.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;


@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nama;
    private int npm;
    private String kelas;
    private String asal_kota;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getNpm(){
        return npm;
    }
    public void setNpm(int npm){
        this.npm = npm;
    }
    public String getKelas(){
        return kelas;
    }
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    public String getAsalkota(){
        return asal_kota;
    }
    public void setAsalkota(String asal_kota){
        this.asal_kota = asal_kota;
    }


}