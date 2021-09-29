/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shine.relasiclass.percobaan2;

/**
 *
 * @author -LENOVO-
 */
public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;
    Pelanggan(){
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }
    public void setMobil(Mobil mobil){
        this.mobil=mobil;
    }

    public int getHari() {
        return hari;
    }
    public Mobil getMobil(){
        return mobil;
    }
    public void setSopir(Sopir sopir){
        this.sopir=sopir;
    }
    public Sopir getSopir(){
        return sopir;
    }
    public int hitungBiayaTotal(){
        return mobil.hitungBiayaMobil(hari)+ sopir.hitungBiayaSopir(hari);
    }
}
