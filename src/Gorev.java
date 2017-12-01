/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muaz Ahmed
 */
public class Gorev {

    private String gorevAdi;
    private int gorevDurumu;

    Gorev() {
        this.gorevDurumu = 0;
    }

    // Bir görevv şu anda durumu ne olduğunu gösteren bi metottur  
    private int gorevDurumu() {
        int i = 0;
        if (gorevDurumu == 0) {
            i = 0;
            System.out.println(this.gorevAdi + " görevi daha Alınmamıştır");
        } else if (gorevDurumu == 1) {
            i = 1;
            System.out.println(this.gorevAdi + " görevi verilmiştir");
        } else if (gorevDurumu == 2) {
            i = 2;
            System.out.println(this.gorevAdi + " görevi bitmiştir");
        }
        return i;
    }

    public void setGorevAdi(String Ad) {
        this.gorevAdi = Ad;
    }

    public String getGorevAdi() {
        return this.gorevAdi;
    }

    public int getgorevDurumu() {
        int i = this.gorevDurumu();
        return i;
    }

    // Bir görev kime ait peersonellerden öğrenebilmek  
    Personel[] gorevKimin(Gorev g) {
        int kaacTanePersonel = 0;
        Personel p[] = new Personel[10];
        for (int k = 0; k < Sirket.Birimler.size(); k++) {
            for (int S = 0; S < Sirket.Birimler.get(k).getPersoneller().length; S++) {
                for (int i = 0; i < Sirket.Birimler.get(k).getPersoneller()[S].getGorevler().length; i++) {
                    if (g.gorevDurumu == 1 && Sirket.Birimler.get(k).getPersoneller()[S].getGorevler()[i] == g) {
                        p[kaacTanePersonel] = Sirket.Birimler.get(k).getPersoneller()[S];
                        kaacTanePersonel++;
                        System.out.println(g.getGorevAdi() + " görevi " + Sirket.Birimler.get(k).getPersoneller()[S].getIsim() + " personele aittir.");
                    } else if (g.gorevDurumu == 0 && Sirket.Birimler.get(k).getPersoneller()[S].getGorevler()[i] == g) {
                        System.out.println(g.getGorevAdi() + " zaten kimseye verilmemiştir ");
                    } else {
                        System.out.println(g.getGorevAdi() + " görevi zaten bitmiş");
                    }
                }
            }
        }
        return p;
    }
    /*
     - Sirket--> static <>birimler --> (private)[]Personelleri --> <>gorevleri --> gorevinAdi == g.gorevi
     - 
     */

    void gorevVermek(Gorev g, Personel p) {
        p.setGorevler(g);
    }

    // Bir görev hangi birimde oldğunu gösteren metottur
    // dizi donecek
    Birim[] gorevinBirimiNedir(Gorev g) {
        int birimSayisi = 0;
        Birim[] b = new Birim[10];
        for (int i = 0; i < Sirket.Birimler.size(); i++) {
            for (int j = 0; j < Sirket.Birimler.get(i).getPersoneller().length; j++) {
                for (int k = 0; k < Sirket.Birimler.get(i).getPersoneller()[j].getGorevler().length; k++) {
                    if (Sirket.Birimler.get(i).getPersoneller()[j].getGorevler()[k] == g) {
                        b[birimSayisi] = Sirket.Birimler.get(i);
                        birimSayisi++;
                        System.out.println(g.gorevAdi + " görevi " + b[birimSayisi].getAdi() + " biirime aittir.");
                    }
                }
            }
        }
        return b;
    }

    /*
     bu 2 metotdun Personeli belli olmadığı durumunda aktif görevleri (yani görevdurumu ==1 ) baslatmak ve bıtırmek gösteren metotlardır
     */
    // Bir görev başlatmak için
//    void gorevBaslatmak(Birim b) {
//        if (this.gorevDurumu == 1) {
//            System.out.println(this.gorevAdi + " görevi zaten başladı");
//        } else if (this.gorevDurumu == 0) {
//            this.gorevDurumu = 1;
//            System.out.println(this.gorevAdi + " görevi başladı");
//        } else {
//            System.out.println(this.gorevAdi + " görevi bitirdi");
//        }
//    }
//
//    // Bir görev bitirmek için
//    void gorevBitirmek(Birim b) {
//        if (this.gorevDurumu == 1) {
//            this.gorevDurumu = 2;
//            System.out.println( this.gorevAdi + " bitirdi");
//        } else if (this.gorevDurumu == 0) {
//            System.out.println(this.gorevAdi + " görevi hala Başlamadı");
//        } else {
//            System.out.println(this.gorevAdi + " görevi zaten bitirdi");
//        }
//    }
    void gorevBaslatmak(Gorev g) {
        for (int i = 0; i < Sirket.Birimler.size(); i++) {
            for (int j = 0; j < Sirket.Birimler.get(i).getPersoneller().length; j++) {
                for (int k = 0; k < Sirket.Birimler.get(i).getPersoneller()[j].getGorevler().length; k++) {
                    if (g.gorevDurumu == 1 && Sirket.Birimler.get(i).getPersoneller()[j].getGorevler()[k] == g) {
                        System.out.println(Sirket.Birimler.get(i).getPersoneller()[j].getIsim() + g.getGorevAdi() + " görevi zaten başladı");
                    } else if (g.gorevDurumu == 0 && Sirket.Birimler.get(i).getPersoneller()[j].getGorevler()[k] == g) {
                        g.gorevDurumu = 1;
                        System.out.println(Sirket.Birimler.get(i).getPersoneller()[j].getIsim() + g.getGorevAdi() + " görevi başladı");
                    } else {
                        System.out.println(Sirket.Birimler.get(i).getPersoneller()[j].getIsim() + g.getGorevAdi() + " görevi bitirdi");
                    }
                }
            }
        }

    }

    void gorevBitirmek(Gorev g) {
        for (int i = 0; i < Sirket.Birimler.size(); i++) {
            for (int j = 0; j < Sirket.Birimler.get(i).getPersoneller().length; j++) {
                for (int k = 0; k < Sirket.Birimler.get(i).getPersoneller()[j].getGorevler().length; k++) {
                    if (g.gorevDurumu == 0 && Sirket.Birimler.get(i).getPersoneller()[j].getGorevler()[k] == g) {
                        System.out.println(Sirket.Birimler.get(i).getPersoneller()[j].getIsim() + g.getGorevAdi() + " görevi zaten başladı");
                    } else if (g.gorevDurumu == 1 && Sirket.Birimler.get(i).getPersoneller()[j].getGorevler()[k] == g) {
                        g.gorevDurumu = 2;
                        System.out.println(Sirket.Birimler.get(i).getPersoneller()[j].getIsim() + g.getGorevAdi() + " görevi başladı");
                    } else {
                        System.out.println(Sirket.Birimler.get(i).getPersoneller()[j].getIsim() + g.getGorevAdi() + " görevi bitirdi");
                    }
                }
            }
        }

    }
}
