
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muaz Ahmed
 */
public class Main {
    public static void main(String[] args) {
//        try {
//            Sirket fsm=new Sirket();
//            
//            // Yeni birim olusturmak
//            Birim muhendislik = new Birim();
//            Birim guzelSanatlar = new Birim();
//            Birim mimarlik = new Birim();
//            Birim turkDiliVeEdebbiyeti = new Birim();
//            Birim Adelet = new Birim();
//            
//            // yeni gorev olusturmak
//            Gorev g1     = new Gorev();
//            Gorev g2     = new Gorev();
//            Gorev g3     = new Gorev();
//            Gorev g4     = new Gorev();
//            Gorev g5     = new Gorev();
//            Gorev g6     = new Gorev();
//            Gorev g7     = new Gorev();
//            Gorev g8     = new Gorev();
//            Gorev g9     = new Gorev();
//            Gorev g10    = new Gorev();
//            
//            // Gorevler isimlendirmek
//            g1.gorevAdi  = " öğretim yapmak";
//            g2.gorevAdi  = " sınav yazmak";
//            g3.gorevAdi  = " sınava kontrol etmek";
//            g4.gorevAdi  = " başkanlık yapmak";
//            g5.gorevAdi  = " idare işleri yapmak";
//            g6.gorevAdi  = " araştırma görevlisi yapmak";
//            g7.gorevAdi  = " öğrencinin sorumlusu olmak";
//            g8.gorevAdi  = " notlar otomasyona girmek";
//            g9.gorevAdi  = " dış ilişkileri kurmak";
//            g10.gorevAdi = " dersler giliştirmek";
//            
//            
//            //yeni personel olusturmak
//            Personel p1  = new Personel(muhendislik);
//            Personel p2  = new Personel(guzelSanatlar);
//            Personel p3  = new Personel(mimarlik);
//            Personel p4  = new Personel(turkDiliVeEdebbiyeti);
//            Personel p5  = new Personel(Adelet);
//            Personel p6  = new Personel(muhendislik);
//            Personel p7  = new Personel(turkDiliVeEdebbiyeti);
//            Personel p8  = new Personel(mimarlik);
//            Personel p9  = new Personel(muhendislik);
//            Personel p10 = new Personel(guzelSanatlar);
//            Personel p11 = new Personel(mimarlik);
//            Personel p12 = new Personel(muhendislik);
//            Personel p13 = new Personel(muhendislik);
//            Personel p14 = new Personel(mimarlik);
//            Personel p15 = new Personel(muhendislik);
//            Personel p16 = new Personel(mimarlik);
//            Personel p17 = new Personel(muhendislik);
//            Personel p18 = new Personel(Adelet);
//            Personel p19 = new Personel(mimarlik);
//            Personel p20 = new Personel(Adelet);
//            
//            //personele isim vermek
//            p1.isim=" Ahemed";
//            p2.isim=" Moaaz";
//            p3.isim=" Mahmut";
//            p4.isim=" Mehmet";
//            p5.isim=" Ali";
//            p6.isim=" Muhammed";
//            p7.isim=" yusuf";
//            p8.isim=" Ayşe";
//            p9.isim=" Fatima";
//            p10.isim=" Sare";
//            p11.isim=" İbrahim";
//            p12.isim=" Seda";
//            p13.isim=" zeyneb";
//            p14.isim=" Buse";
//            p15.isim=" Rava";
//            p16.isim=" Hager";
//            p17.isim=" Dina";
//            p18.isim=" Esma";
//            p19.isim=" Feyza";
//            p20.isim=" Banu";
//            
//            //Gorev vermek
//            p1.gorevVermek(g1);
//            p1.gorevVermek(g2);
//            p1.gorevVermek(g3);
//            p1.gorevVermek(g7);
//            p1.gorevVermek(g8);
//            p1.gorevVermek(g9);
//            p2.gorevVermek(g1);
//            p2.gorevVermek(g2);
//            p2.gorevVermek(g3);
//            p2.gorevVermek(g7);
//            p2.gorevVermek(g8);
//            p2.gorevVermek(g9);
//            p10.gorevVermek(g1);
//            p10.gorevVermek(g2);
//            p10.gorevVermek(g3);
//            p10.gorevVermek(g7);
//            p10.gorevVermek(g8);
//            p10.gorevVermek(g9);
//            p20.gorevVermek(g1);
//            p20.gorevVermek(g2);
//            p20.gorevVermek(g3);
//            p20.gorevVermek(g7);
//            p20.gorevVermek(g8);
//            p20.gorevVermek(g9);
//            p3.gorevVermek(g2);
//            p3.gorevVermek(g1);
//            p3.gorevVermek(g7);
//            p3.gorevVermek(g8);
//            p3.gorevVermek(g9);
//            p13.gorevVermek(g2);
//            p13.gorevVermek(g1);
//            p13.gorevVermek(g7);
//            p13.gorevVermek(g8);
//            p13.gorevVermek(g9);
//            p4.gorevVermek(g3);
//            p4.gorevVermek(g1);
//            p4.gorevVermek(g2);
//            p4.gorevVermek(g8);
//            p14.gorevVermek(g3);
//            p14.gorevVermek(g1);
//            p14.gorevVermek(g2);
//            p14.gorevVermek(g8);
//            p5.gorevVermek(g4);
//            p5.gorevVermek(g1);
//            p5.gorevVermek(g9);
//            p5.gorevVermek(g10);
//            p15.gorevVermek(g4);
//            p15.gorevVermek(g1);
//            p15.gorevVermek(g9);
//            p15.gorevVermek(g10);
//            p6.gorevVermek(g5);
//            p16.gorevVermek(g5);
//            p7.gorevVermek(g6);
//            p7.gorevVermek(g1);
//            p7.gorevVermek(g7);
//            p17.gorevVermek(g6);
//            p17.gorevVermek(g1);
//            p17.gorevVermek(g7);
//            p8.gorevVermek(g7);
//            p8.gorevVermek(g1);
//            p8.gorevVermek(g6);
//            p18.gorevVermek(g7);
//            p18.gorevVermek(g1);
//            p18.gorevVermek(g6);
//            p9.gorevVermek(g10);
//            p9.gorevVermek(g1);
//            p9.gorevVermek(g2);
//            p9.gorevVermek(g3);
//            p9.gorevVermek(g6);
//            p19.gorevVermek(g9);
//            p19.gorevVermek(g1);
//            p19.gorevVermek(g2);
//            p19.gorevVermek(g3);
//            p19.gorevVermek(g10);
//            
//            //Gorev calistirmak
//            g1.gorevBaslatmak(muhendislik);
//            g1.gorevBaslatmak(muhendislik);
//            g1.gorevBaslatmak(guzelSanatlar);
//            g1.gorevBaslatmak(mimarlik);
//            g4.gorevBaslatmak(guzelSanatlar);
//            g4.gorevBaslatmak(mimarlik);
//            g4.gorevBaslatmak(guzelSanatlar);
//            g4.gorevBaslatmak(muhendislik);
//            g5.gorevBaslatmak(guzelSanatlar);
//            g5.gorevBaslatmak(mimarlik);
//            g5.gorevBaslatmak(mimarlik);
//            g5.gorevBaslatmak(muhendislik);
//            g7.gorevBaslatmak(guzelSanatlar);
//            g7.gorevBaslatmak(mimarlik);
//            g7.gorevBaslatmak(mimarlik);
//            
//            //  gorev bitirmek ( gorev uzerinden )
//            g2.gorevBitirmek(Adelet);
//            g2.gorevBitirmek(guzelSanatlar);
//            g3.gorevBitirmek(muhendislik);
//            g4.gorevBitirmek(mimarlik);
//            g5.gorevBitirmek(muhendislik);
//            g7.gorevBitirmek(mimarlik);
//            
//            //bir personelin gorevi bitirmek ( personel uzerinden )
//            p1.gorevBitirmek(g2);
//            p1.gorevBitirmek(g3);
//                        
//            for (int i = 0; i < g1.gorevKimin(g1).length; i++) {
//                System.out.println(g1.gorevKimin(g1)[i].isim+"");
//            }
//            
//        } catch (Exception e) {
//            System.out.println("Your error :" + e.getMessage());
//            System.exit(0);
//        }
    }
}
    