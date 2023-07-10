package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
public class Test01_TestingExceptions {
    //Test ettigimiz method bekledigimiz exceptionı firlatiyor mu
    @Test
    void testException(){
        String str="Merhaba Dunya";
        assertThrows(NullPointerException.class,()->
        {
            System.out.println("testException calisti");
            str.length();
        });
    }

    //bolme islemi icin ArithmeticException kontrolu

    @Test
    void testException2(){
        int sayi1=1;
        int sayi2=0;
//parent exception i almis olursak da test gecerdi //RunTimeException
        assertThrows(ArithmeticException.class,() ->
        {
            System.out.println(sayi1/sayi2);
        });
    }
    //Yukaridaki islemi methodla test ettik

    @Test
    void testException3(){
        int sayi1=1;
        int sayi2=0;
        assertThrows(ArithmeticException.class,()->
        {
            divide(sayi1,sayi2);
        });
    }

    private int divide(int a,int b){
        return a/b;
    }
}
