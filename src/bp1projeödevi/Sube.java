/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp1projeödevi;

import java.util.ArrayList;

/**
 *
 * @author halil
 */
public class Sube {

    public static ArrayList<Paket> Subedekipaketler = new ArrayList();
    static int subeKodu;

    public Sube(int subeKodu) {
        Sube.subeKodu = subeKodu;
    }

    void getAracaTeslimEt() {
        for (int i = 0; i < Subedekipaketler.size(); i++) {
            if (Subedekipaketler.size() >= 3) {
                DagıtımAracı.aractakiPaketler = (ArrayList<Paket>) Subedekipaketler.clone();
                Subedekipaketler.removeAll(Subedekipaketler);
                System.out.println("Paketler Araca Yüklenmiştir");
            } else {
                System.out.println("Yeterli Sayıda paket bulunamadı");
            }

        }
    }

    void subedekiPaketSayısı() {

        for (int i = 0; i < Subedekipaketler.size(); i++) {
            System.out.println(Subedekipaketler.size());
            break;
        }

    }

}
