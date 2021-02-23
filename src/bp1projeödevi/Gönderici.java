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
public class Gönderici {

    static ArrayList<Paket> paketler = new ArrayList();
    Paket p;
    String adı, soyadı;
    String adres;

    public Gönderici(String adı, String soyadı, String adres) {
        this.adı = adı;
        this.soyadı = soyadı;
        this.adres = adres;
    }
    

    void getKargoyaVer(Paket paket) {
        if (Sube.Subedekipaketler.contains(paket)) {
            System.out.println("Bu paket hâlihazırda  kargoya verilmiştir");

        } else {
            Sube.Subedekipaketler.add(paket);
            System.out.println(paket.getKargoKimlikNumarasıBelirle(paket) + " No'lu Kargonuz işleme alındı");
        }

    }

    void getKargoyaVer(HassasPaket hp) {
        if (Sube.Subedekipaketler.contains(hp)) {
            System.out.println("Bu Hassas paket hâlihazırda  kargoya verilmiştir");

        } else {
            Sube.Subedekipaketler.add(hp);
            System.out.println(hp.getKargoKimlikNumarasıBelirle(hp) + " No'lu Kargonuz işleme alındı");
        }

    }

    void kargoİptalEt(Paket p) {
        for (int i = 0; i < DagıtımAracı.aractakiPaketler.size(); i++) {
            if (DagıtımAracı.aractakiPaketler.contains(p)) {
                System.out.println("Paketiniz araca yüklendiği için iptal etme işlemi yapamazsınız");
            }
            break;

        }

        for (int j = 0; j < Sube.Subedekipaketler.size(); j++) {
            if (Sube.Subedekipaketler.contains(p)) {
                Sube.Subedekipaketler.remove(p);
                System.out.println("Kargonuz başarıyla silinmiştir");
            }

        }

    }

    void AdresDegistir(String YeniAdres, Paket p) {

        for (int i = 0; i < Sube.Subedekipaketler.size(); i++) {

            if (Sube.Subedekipaketler.contains(p)) {
                p.alıcı.Adresİlçesi = YeniAdres;

                System.out.println("Adres değiştirme talebiniz gerçekleştirilmiştir");
                System.out.println(p.alıcı.Adresİlçesi);
                break;
            }
        }
        for (int j = 0; j < DagıtımAracı.aractakiPaketler.size(); j++) {
            if (DagıtımAracı.aractakiPaketler.contains(p)) {
                System.out.println("Paketiniz araca yüklendiği için adres değisimi yapamazsınız");
                break;
            }
        }

    }

}
