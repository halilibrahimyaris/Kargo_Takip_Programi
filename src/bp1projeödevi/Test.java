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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     Alıcı a1= new Alıcı("Ahmet","Ak", 12 ,"İstanbul","Kartal");
     Alıcı a2= new Alıcı("Mert","Kılıç", 17 ,"İstanbul","Kadıköy");
     Alıcı a3= new Alıcı("Mehmet","Kara", 21 ,"İstanbul","Ümraniye");
    //-----------------------------------------------------
     Gönderici g1= new Gönderici("Ayşe","Ak","Kadıköy");
     Gönderici g2= new Gönderici("Halil","Yarış","Üsküdar");
     //--------------------------------------------------
     DagıtımAracı D = new DagıtımAracı();
     Sube s1= new Sube(0);
     //--------------------------------------------------
     Paket p1= new Paket(5.28,a1,"Gönderici ödemeli",g1,"Normal kargo");
     HassasPaket p2= new HassasPaket(3.12,a2,"Alıcı ödemeli",g1,"Hassas kargo");
     Paket p3= new Paket(7,a3,"Alıcı ödemeli",g2,"Normal kargo");
     //---------------------------------------------------
     g1.getKargoyaVer(p1);
     g1.getKargoyaVer(p2);
     g2.getKargoyaVer(p3);
     //g2.getKargoyaVer(p3);
     
        System.out.println("----------------------");
        
    p1.getKargoUcretiBelirle(p1);
    p2.getKargoUcretiBelirle(p2);
    p2.getKargoUcretiBelirle(p3);
     
        System.out.println("----------------------");
     
    p1.getKargoKimlikNumarasıBelirle(p1);
    p2.getKargoKimlikNumarasıBelirle(p2);
    p3.getKargoKimlikNumarasıBelirle(p3);
    
        System.out.println("----------------------");
        
    p1.paketİçeriğiniGöster(p1);
    p2.paketİçeriğiniGöster(p2);
    p3.paketİçeriğiniGöster(p3);
        
        System.out.println("----------------------");
        
    g1.AdresDegistir("Kadıköy", p3);
    
    p3.paketİçeriğiniGöster(p1);

        
        System.out.println("----------------------");
    s1.subedekiPaketSayısı();
   // g1.kargoİptalEt(p2);
   //s1.subedekiPaketSayısı();
     s1.getAracaTeslimEt();
       g1.kargoİptalEt(p3);
      
  
    
    
        System.out.println("----------------------");
    a1.KargomNerede(p3);
    a1.KargomNerede(p1);
    
        System.out.println("----------------------");
    s1.getAracaTeslimEt();
   // g1.kargoİptalEt(p2);
   // g1.AdresDegistir("Kadıköy", p3);
   //p3.paketİçeriğiniGöster(p1);
    s1.subedekiPaketSayısı();
    D.aractakiPaketSayısı();
    a2.KargomNerede(p2);
   
    D.musteriyeTeslimEt(p3, a3);
     D.aractakiPaketSayısı();
  
    }
    
}
