/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shine.relasiclass.praktikum3;

/**
 *
 * @author -LENOVO-
 */
public class Pegawai {
    private String nip, nama;
    Pegawai(String nip, String nama){
        this.nip=nip;
        this.nama=nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }
    
    public String info(){
        String info="";
        info += "Nip: "+this.nip+"\n";
        info += "Nama: "+this.nama+"\n";
        return info;
    }
}
