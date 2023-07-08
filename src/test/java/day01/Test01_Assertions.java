package day01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test01_Assertions {

    @Test
    public void test(){
        //test yazinca main method olmadan calisir hale geldi
        //JUnit icinde gomulu olarak gelen main methodunu kullandi
        //Junit5 (Jupiter) methodlarin erisim belirleyicisini public yapmak zorunda birakmiyor
    }

    @Test
    public void testlength(){
        String cumle="Merhaba Batch"; //13
        int anlikDeger=cumle.length();
        int beklenenDeger=13;

        assertEquals(beklenenDeger,anlikDeger);//aldigi parametreleri karsilastirir ayni ise test gecer degilse test kalir
    }
// baska bir ornek toUpperCase() methodunu test edelim

    @Test
    public void testToUpperCase(){
        String anlikDeger="Merhaba".toUpperCase();//MERHABA
        String beklenenDeger="MERHABA";
        assertEquals(beklenenDeger,anlikDeger,"toUpperCade() methodu duzgun calismiyor");
        //asserEquls ta 3. parametre testin hata durumunda verilmesi istenen mesaj yazilir
    }

    @Test
    public void testToplama(){
       int sayi1=10;
        int sayi2=5;
        int anlikDeger=Math.addExact(sayi1,sayi2);
        int beklenenDeger=15;
        assertEquals(beklenenDeger,anlikDeger);
    }

    //contains methodunu test edelim

    @Test
    public void testContains(){
        assertEquals(false,"Developers".contains("tester"));
    }





}
