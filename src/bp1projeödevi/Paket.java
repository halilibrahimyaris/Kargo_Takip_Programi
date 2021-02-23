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
public class Paket {

    static Paket paket;
    double agırlık;
    int[] kargoKimlikNumarası = new int[3];
    Alıcı alıcı;
    String odemeTipi;
    Gönderici gönderici;
    String gonderiTipi;

    public Paket(double agırlık, Alıcı alıcı, String odemeTipi, Gönderici gönderici, String gonderiTipi) {
        this.agırlık = agırlık;
        this.alıcı = alıcı;
        this.odemeTipi = odemeTipi;
        this.gönderici = gönderici;
        this.gonderiTipi = gonderiTipi;
    }

    double getKargoUcretiBelirle(Paket p) {

        double kargoUcreti = 0;

        if (p.gonderiTipi == ("Hassas Kargo")) {
            kargoUcreti = p.agırlık * 3;
        } else {
            kargoUcreti = p.agırlık * 1.5;
        }
        System.out.println("Kargo ücretiniz" + " " + kargoUcreti + " " + "tl'dir");
        return kargoUcreti;

    }

    void paketİçeriğiniGöster(Paket paket) {
        System.out.println("Kargonuzun bilgileri şunlardır;");
        System.out.println(paket.getKargoKimlikNumarasıBelirle(paket));
        System.out.println("Paketin göndericisi :" + " " + paket.gönderici.adı + "  " + paket.gönderici.soyadı + "  " + paket.gönderici.adres);
        System.out.println("Paketin teslim adresi :" + " " + paket.alıcı.Adresİli + " " + paket.alıcı.Adresİlçesi);
        System.out.println("Paketin gönderi tipi :" + " " + paket.gonderiTipi);
        System.out.println("Paketin ödeme tipi : " + " " + paket.odemeTipi);

    }

    int getKargoKimlikNumarasıBelirle(Paket p) {
        Sube s = new Sube(0);
        if (p.alıcı.Adresİli == "İstanbul") {
            kargoKimlikNumarası[0] = 34;
        }
        switch (p.alıcı.Adresİlçesi) {

            case "Ümraniye":
                kargoKimlikNumarası[1] = 1;
                break;
            case "Üskudar":
                kargoKimlikNumarası[1] = 2;
                break;
            case "Kartal":
                kargoKimlikNumarası[1] = 3;
                break;
            case "Kadıköy":
                kargoKimlikNumarası[1] = 4;
                break;
            case "Pendik":
                 kargoKimlikNumarası[1] = 5;
                break;
        }
        kargoKimlikNumarası[2] = p.alıcı.kapıNumarası;

        for (int i = 0; i < kargoKimlikNumarası.length; i++) {
            System.out.print(kargoKimlikNumarası[i]);
        }

        return Sube.subeKodu;
    }
}
