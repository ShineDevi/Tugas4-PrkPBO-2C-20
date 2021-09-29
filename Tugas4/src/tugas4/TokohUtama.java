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
public class TokohUtama {
    private String nama, kegiatan;
    Kelas kls;
    Sekolah sklh;
    Klub klb;
    TokohUtama(String nama, String kegiatan){
        this.nama=nama;
        this.kegiatan=kegiatan;
        this.kls=kls;
        this.sklh=sklh;
        this.klb=klb;
    }

    public void setKls(Kelas kls) {
        this.kls = kls;
    }

    public void setSklh(Sekolah sklh) {
        this.sklh = sklh;
    }

    public void setKlb(Klub klb) {
        this.klb = klb;
    }

    public Kelas getKls() {
        return kls;
    }

    public Sekolah getSklh() {
        return sklh;
    }

    public Klub getKlb() {
        return klb;
    }
    
    public void info(){
        System.out.println("Nama: "+nama);
        System.out.println("Kegiatan: "+kegiatan);
        System.out.println("Kelas: "+kls.getKls());
        System.out.println("Sekolah: "+sklh.getJenis());
        System.out.println("Klub: "+klb.getNamaKlub());
        klb.info();
    }
}
