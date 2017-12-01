
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
public class Sirket {

    static ArrayList<Birim> Birimler = new ArrayList<Birim>();

    Gorev[] birimdekiBitmisGorevler(Birim b) {
        Gorev g[] = new Gorev[30];
        int gorevSayisi=0;
        for (Personel personel : b.getPersoneller()) {
            for (int i = 0; i < personel.getGorevler().length; i++) {
                if (personel.getGorevler()[i].getgorevDurumu() == 2) {
                    g[gorevSayisi] = personel.getGorevler()[i];
                    gorevSayisi++;
                    System.out.println(personel.getGorevler()[i].getGorevAdi() + " görevi bitti");
                }
            }
        }
        return g;
    }

    /*
     - you have to call getPersoneller function to continue 
     - and so you will create an Array in the test class to send it to the setter 
     - check this out 
     */
    Gorev[] birimdekiBitmemisGorevler(Birim b) {
        Gorev g[] = new Gorev[30];
        int gorevSayisi=0;
        for (Personel personel : b.getPersoneller()) {
            for (int i = 0; i < personel.getGorevler().length; i++) {
                if (personel.getGorevler()[i].getgorevDurumu() == 1) {
                    g[gorevSayisi] = personel.getGorevler()[i];
                    gorevSayisi++;
                    System.out.println(personel.getGorevler()[i].getGorevAdi() + " görevi bitmedi");
                }
            }
        }

        return g;
    }

    Gorev[] tumBitmisGorevler() {
        Gorev g[] = new Gorev[30];
        int gorevSayisi=0;
        for (int i = 0; i < Sirket.Birimler.size(); i++) {
            for (int j = 0; j < Sirket.Birimler.get(i).getPersoneller().length; j++) {
                for (int k = 0; k < Sirket.Birimler.get(i).getPersoneller()[j].getGorevler().length; k++) {
                    if (Sirket.Birimler.get(i).getPersoneller()[j].getGorevler()[k].getgorevDurumu() == 2) {
                        g[gorevSayisi] = Sirket.Birimler.get(i).getPersoneller()[j].getGorevler()[k];
                        gorevSayisi++;
                        System.out.println(Sirket.Birimler.get(i).getPersoneller()[j].getGorevler()[k].getGorevAdi() + " görevi bitti");
                    }

                }
            }
        }
        return g;
    }

    Gorev[] tumBitmemisGorevler() {
        Gorev g[] = new Gorev[30];
        int gorevSayisi=0;
        for (int i = 0; i < Sirket.Birimler.size(); i++) {
            for (int j = 0; j < Sirket.Birimler.get(i).getPersoneller().length; j++) {
                for (int k = 0; k < Sirket.Birimler.get(i).getPersoneller()[j].getGorevler().length; k++) {
                    if (Sirket.Birimler.get(i).getPersoneller()[j].getGorevler()[k].getgorevDurumu() == 1) {
                        g[gorevSayisi] = Sirket.Birimler.get(i).getPersoneller()[j].getGorevler()[k];
                        gorevSayisi++;
                        System.out.println(Sirket.Birimler.get(i).getPersoneller()[j].getGorevler()[k].getGorevAdi() + " görevi bitti");
                    }
                }
            }
        }
        return g;
    }

    //bu sırkette tum calısan personel kimdir
    Personel[] tumCalısanlar() {
        Personel []p=new Personel[100] ;
        int personelSayisi=0;
        for (int i = 0; i < Sirket.Birimler.size(); i++) {
            for (int j = 0; j < Sirket.Birimler.get(i).getPersoneller().length; j++) {
                p[personelSayisi] = Sirket.Birimler.get(i).getPersoneller()[j];
                personelSayisi++;
                System.out.println(Sirket.Birimler.get(i).getPersoneller()[j].getIsim() + " " + Sirket.Birimler.get(i).getAdi() + " de çalışıyor");
            }
        }
        return p;
    }
}
