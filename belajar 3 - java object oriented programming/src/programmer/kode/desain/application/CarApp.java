package programmer.kode.desain.application;

//import programmer.kode.desain.data.Avanza;
import programmer.kode.desain.data.Bus;
import programmer.kode.desain.data.Car;

public class CarApp {
    public static void main(String[] args) {
//        Car car = new Avanza();
//        car.drive();
//        System.out.println(car.getTire());

        Car car = new Bus();
        car.drive();
        System.out.println(car.getTire());
        System.out.println(car.getBrand());
        System.out.println(car.isBig());
        System.out.println(car.isMaintenance());

    }
}
