
//import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 *
 * @author Muaz Ahmed
 */
public class Birim {

    // Personel arrayın length e  bi ArrayListin sizeyi gönderebiliriz
    
    private Personel[] personeller=new Personel[10];
    private String adi;
    private int personelAdidi=0 ;
    
    // Burada mantıksal hata vardır.
    // Personel constructor metottan aldığı Personeli setPersonele gönderip 
    // Personel dizisine eklemesinide hata oluşuyor 
    public void setPersoneller(Personel personel) {
        this.personeller[personelAdidi] = personel;
        personelAdidi++;
    }

    public Personel[] getPersoneller() {
        return personeller;
    }
    public void setAdi(String Adi) {
        this.adi=Adi;
    }

    public String getAdi() {
        return this.adi;
    }
}
