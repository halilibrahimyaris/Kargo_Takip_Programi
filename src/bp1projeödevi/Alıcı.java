/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp1projeödevi;

/**
 *
 * @author halil
 */
public class Alıcı {

    String adı, soyadı;
    int kapıNumarası;
    String Adresİli;
    String Adresİlçesi;

    public Alıcı(String adı, String soyadı, int kapıNumarası, String Adresİli, String Adresİlçesi) {
        this.adı = adı;
        this.soyadı = soyadı;
        this.kapıNumarası = kapıNumarası;
        this.Adresİli = Adresİli;
        this.Adresİlçesi = Adresİlçesi;
    }

    void KargomNerede(Paket paket) {

        for (int i = 0; i < Sube.Subedekipaketler.size(); i++) {

            if (Sube.Subedekipaketler.contains(paket)) {
                System.out.println("Paketiniz şubemizde muhafaza edilmektedir");

            }
            if ((paket.odemeTipi == ("Alıcı ödemeli"))) {
                System.out.println(paket.getKargoUcretiBelirle(paket));
            } else {
                System.out.println("Kargo ücretiniz gönderici tarafından ödenmiştir");
            }
            break;

        }
        for (int j = 0; j < DagıtımAracı.aractakiPaketler.size(); j++) {

            if (DagıtımAracı.aractakiPaketler.contains(paket)) {
                System.out.println("Paketiniz dağıtıma çıkarılmıştır");
            }
            if ((paket.odemeTipi == "Alıcı ödemeli")) {
                paket.getKargoUcretiBelirle(paket);
            } else {
                System.out.println("Kargo ücretiniz gönderici tarafından ödenmiştir");
            }
            break;
        }
        
    }

}
