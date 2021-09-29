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
public class MainCerita {
    public static void main(String[] args) {
        Sekolah s=new Sekolah();
        s.setJenis("Sekolah Putri");
        KetuaOsis ket=new KetuaOsis("Tidak resmi");
        ket.getKeputusan();
        Klub kl=new Klub();
        kl.setNamaKlub("Klub bermain");
        kl.setKegiatan("Random");
        kl.setKeputusan(ket);
        kl.getKeputusan();
        Kelas kls=new Kelas();
        kls.setKls("2");
        TokohUtama hanako=new TokohUtama("Hanako", "Menantang bermain Kasumi & Olivia");
        hanako.setKlb(kl);
        hanako.setKls(kls);
        hanako.setSklh(s);
        hanako.getKlb();
        hanako.info();
        System.out.println("");
        TokohUtama olivia=new TokohUtama("Olivia", "Mengajak bermain & menggoda Hanako");
        olivia.setKlb(kl);
        olivia.setKls(kls);
        olivia.setSklh(s);
        olivia.getKlb();
        olivia.info();
        System.out.println("");
        TokohUtama kasumi=new TokohUtama("Kasumi", "Belajar bahasa inggris & menerima tantangan bermain");
        kasumi.setKlb(kl);
        kasumi.setKls(kls);
        kasumi.setSklh(s);
        kasumi.getKlb();
        kasumi.info();
        System.out.println("");

    }
    
}
