/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shine.relasiclass.praktikum4;

/**
 *
 * @author -LENOVO-
 */
public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;
    
    private void initKursi(){
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i]=new Kursi(String.valueOf(i+1));
        }
    }
    
    Gerbong(String kode, int jumlah){
        this.kode=kode;
        this.arrayKursi=new Kursi[jumlah];
        this.initKursi();
    }
    
    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setArrayKursi(Kursi[] arrayKursi) {
        this.arrayKursi = arrayKursi;
    }

    public String getKode() {
        return kode;
    }

    public Kursi[] getArrayKursi() {
        return arrayKursi;
    }
    
    public String info(){
        String info="";
        info+="Kode: "+kode+"\n";
        for (Kursi kursi : arrayKursi){
            info+=kursi.info();
        }return info;
    }
    public void setPenumpang(Penumpang penumpang, int nomor){
        this.arrayKursi[nomor-1].setPenumpang(penumpang);
        if (this.arrayKursi[nomor-1].getPenumpang()!=null) {
            System.out.println("Sudah ditempati");
        }
    }
}
