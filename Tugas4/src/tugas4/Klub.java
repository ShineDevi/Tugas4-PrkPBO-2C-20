/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author -LENOVO-
 */
public class Klub {
    private String namaKlub, kegiatan;
    KetuaOsis keputusan;

    public void setNamaKlub(String namaKlub) {
        this.namaKlub = namaKlub;
    }

    public void setKegiatan(String kegiatan) {
        this.kegiatan = kegiatan;
    }

    public void setKeputusan(KetuaOsis keputusan) {
        this.keputusan = keputusan;
    }

    public String getNamaKlub() {
        return namaKlub;
    }

    public String getKegiatan() {
        return kegiatan;
    }

    public KetuaOsis getKeputusan() {
        return keputusan;
    }
    
    public void info(){
        System.out.println("Kegiatan: "+kegiatan);
        keputusan.info();
    }
    
}
