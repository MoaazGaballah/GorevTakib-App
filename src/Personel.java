
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Muaz Ahmed
 */
public class Personel {

    private String isim;
    // neden Personel objeyi oluşturuken Arraylıste çıkıyor ( kopyası alıyorsa )
    // String isimi da alması gerekmiyor mu ??
    private ArrayList<Gorev> gorevler = new ArrayList<Gorev>();

    Personel() {

    }
    /*
     - you will create an Array of Personel even if it of 1 element
     - and so you will choose the second option 
     */
    Personel(Birim b,String Isim) {
        b.setPersoneller(this);
        setIsim(Isim);
    }

    public void setGorevler(Gorev gorev) {
        this.gorevler.add(gorev);
    }

    public Gorev[] getGorevler() {
        Gorev g[] = new Gorev[this.gorevler.size()];
        for (int i = 0; i < this.gorevler.size(); i++) {
            g[i] = this.gorevler.get(i);
        }
        return g;
    }

    public void setIsim(String Isim) {
        this.isim = Isim;
    }

    public String getIsim() {
        return this.isim;
    }

    // Bir personelin gorevleri nedir

    Gorev[] personelinGorevleri(Personel p) {
        Gorev g []= new Gorev[10];
        int gorevSayisi=0;
        for (int i = 0; i < p.getGorevler().length; i++) {
            System.out.println(p.getIsim() + " in görevleri :");
            if (p.getGorevler()[i].getgorevDurumu() == 1) {
                g[gorevSayisi] = p.getGorevler()[i];
                gorevSayisi++;
                System.out.println("      " + p.getGorevler()[i].getGorevAdi() + " görevi bitmemiştir");
            } else if (this.getGorevler()[i].getgorevDurumu() == 2) {
                System.out.println("      " + p.getGorevler()[i].getGorevAdi() + "  görevi bitmiştir");
            }
        }
        return g;
    }

    // Bir personelin görevlendirmesi
    /*
     bu 2 metotdun Personeli belli olduğu durumunda aktif görevleri (yani görevdurumu ==1 ) baslatmak ve bıtırmek gösteren metotlardır
     */
    // Bir personel nerede çalıştığı öğrenmek için 
    Birim PersonelinbirimiNedir(Personel p) {
        Birim b = new Birim();
        for (int i = 0; i < Sirket.Birimler.size(); i++) {
            for (int j = 0; j < Sirket.Birimler.get(i).getPersoneller().length; j++) {
                if (Sirket.Birimler.get(i).getPersoneller()[j] == p) {
                    b = Sirket.Birimler.get(i);
                    System.out.println(Sirket.Birimler.get(i).getPersoneller()[j].getIsim() + " " + b.getAdi() + "bölümünde çalışıyor");
                }
            }
        }
        return b;
    }

    /*
     bu 2 metotdun Personeli belli olduğu durumunda aktif görevleri (yani görevdurumu ==1 ) baslatmak ve bıtırmek gösteren metotlardır
     */
//    void gorevBitirmek(Gorev g) {
//        for (int i = 0; i < this.gorevler.size(); i++) {
//            if(this.gorevler.get(i)==g){
//                if(this.gorevler.get(i).gorevDurumu==1){
//                    this.gorevler.get(i).gorevDurumu=2;
//                    System.out.println(this.isim + this.gorevler.get(i).gorevAdi + " görevi bitirdi");
//                }
//                else if(this.gorevler.get(i).gorevDurumu==0){
//                    System.out.println(this.isim + this.gorevler.get(i).gorevAdi + " görevi hala Başlamadı");
//                }
//                else 
//                    System.out.println(this.isim + this.gorevler.get(i).gorevAdi + " görevi zaten bitirdi");
//            }
//        }
//    }
}
