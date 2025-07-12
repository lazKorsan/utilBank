package schedules;

import org.junit.jupiter.api.Test;
import utilities.TestBase;

import static utilities.TestBase.Driver.driver;

public class wiseVideoDersleriSChedule extends TestBase {

    @Test
    public void test01(){
        createDriver();
        driver.get("https://online.wisequarter.com/mod/videotime/view.php?id=23055");
        tearDown();

        // 20NCİ DAKİKADAN İTİBAREN KONTROLUU WİNDOW GEÇİŞİ
        //35NCİ DAKİKADAN İTİBAREN KONTROLSUZ WİNDOW GEÇİŞİ
    }
    @Test
    public void test02(){
        //Team 162 Quality Assurance
        //12. Hafta
        //Switching Windows Ders02
        //Switching Windows Ders02
        //Kontrolsuz Acilan Windowlar
        driver.get("https://online.wisequarter.com/mod/videotime/view.php?id=23056");
        // 10 dakikadan itibaren windowlar arası geçiş için metod oluşturmaklık
        // 32. dakikaya kadar methodların oluşturulması
        // sonrasında methodların kullanımı
    }



}
