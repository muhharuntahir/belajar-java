package programmer.kode.desain.application;

import programmer.kode.desain.data.City;
import programmer.kode.desain.data.Location;

public class LocationApp {
    public static void main(String[] args) {
//        var location = new Location(); // ERROR
        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);
    }
}
