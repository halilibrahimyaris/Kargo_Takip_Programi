/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp1projeödevi;

//import java.util.ArrayList;
/**
 *
 * @author halil
 */
public class HassasPaket extends Paket {

    public HassasPaket(double agırlık, Alıcı alıcı, String odemeTipi, Gönderici gönderici, String gonderiTipi) {
        super(agırlık, alıcı, odemeTipi, gönderici, gonderiTipi);
    }

    int getKargoKimlikNumarasıBelirle(HassasPaket hp) {
        return super.getKargoKimlikNumarasıBelirle(hp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void paketİçeriğiniGöster(Paket paket) {
        super.paketİçeriğiniGöster(paket); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    double getKargoUcretiBelirle(Paket p) {
        return super.getKargoUcretiBelirle(p); //To change body of generated methods, choose Tools | Templates.
    }

}

  //  static ArrayList<HassasPaket> hassasPaketler = new ArrayList();

