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
public class KetuaOsis {
    private String keputusan;
    KetuaOsis(String keputusan){
        this.keputusan=keputusan;
    }
    
    public void setKep(String keputusan) {
        this.keputusan = keputusan;
    }

    public String getKeputusan() {
        return keputusan;
    }
    public void info(){
        System.out.println("Pemberian status klub oleh OSIS: "+keputusan);
    }
}
