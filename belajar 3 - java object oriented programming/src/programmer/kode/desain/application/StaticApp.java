package programmer.kode.desain.application;

//import programmer.kode.desain.data.Application;
import static programmer.kode.desain.data.Application.PROCESSORS;
//import programmer.kode.desain.data.Constant;
import static programmer.kode.desain.data.Constant.*;
import programmer.kode.desain.data.Country;
import programmer.kode.desain.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        // Field
//        System.out.println(Constant.APPLICATION);
//        System.out.println(Constant.VERSION);
        // bisa diganti
        System.out.println(APPLICATION);
        System.out.println(VERSION);


        // Method
        System.out.println(
                MathUtil.sum(1,1,1,1,1)
        );

        // Class
        Country.City city = new Country.City();
        city.setName("Parepare");

        System.out.println(city.getName());

//        System.out.println(Application.PROCESSORS);
        System.out.println(PROCESSORS);
    }
}
