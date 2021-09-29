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
public class MainPercobaan3Baru {
    public static void main(String[] args) {
        Pegawai masinis=new Pegawai("1234", "Spongebob Squarepants");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis);
        System.out.println(keretaApi.ingfo());
    }
}
