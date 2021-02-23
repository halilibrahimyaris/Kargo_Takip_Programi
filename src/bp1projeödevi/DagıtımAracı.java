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
public class DagıtımAracı {

    public static ArrayList<Paket> aractakiPaketler = new ArrayList();

    void aractakiPaketSayısı() {

        for (int i = 0; i < aractakiPaketler.size(); i++) {
            System.out.println(aractakiPaketler.size());
            break;
        }

    }

    void musteriyeTeslimEt(Paket paket, Alıcı alıcı) {

        if (paket.kargoKimlikNumarası[2] == alıcı.kapıNumarası) {
            aractakiPaketler.remove(paket);
            System.out.println("Paket alıcıya teslim edilmiştir.");
        } else {
            System.out.println("Paket bilgisi ile alıcı bilgisi uyuşmamaktadır.");
        }

    }
    
}
