package Gun04;


import org.testng.annotations.Test;

/*

İnterviewlarda sorulan bi konu : Testlere öncelikleri nasıl verirsin?
-priority,dependency; Nasıl kullanırsın?
1-Priority=1 gibi sıralı rakamlar vererek
2-dependOnMethods :
Bir metodu direk çalıştırdığınızda kendinden önce bağımlı 1 metod
var ise otomatik önce çağırıp sonra kendisi çalışır fakat 2 tane var ise bağımlı olduğu metod
o zaman çalışamaz.


 */
public class _02_Dependency {

    @Test
    void startCar(){

        System.out.println("Car Started");

    }

    @Test(dependsOnMethods = {"startCar"}) //Bu testin çalışması  ,startCar ın hatasız çalışmasına bağlı
    void driveCar(){

        System.out.println("Car drive");

    }


    @Test(dependsOnMethods = {"startCar","driveCar"}) //Bu testin çalışması ,startCar ve driverCar ın hatasız çalışmasına bağlı
    void parkCar(){

        System.out.println("Car parked");
    }


    @Test(dependsOnMethods = {"parkCar"},alwaysRun = true) //Her zaman çalıştır
    void stopCar(){

        System.out.println("Car stop");
    }
}
