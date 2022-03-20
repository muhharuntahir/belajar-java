package programmer.kode.desain.application;

import programmer.kode.desain.data.Customer;
import programmer.kode.desain.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer =  new Customer();

        customer.setName("Harun");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());

        System.out.println(customer.getLevel().getDescription());

        // conver dari enum ke String
        String levelName = Level.VIP.name();
        System.out.println(levelName);

        // convert dari String ke enum
        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        // Menampilkan semua isi enum
//        Level[] levels = level.values();
        for (var value: level.values()) {
            System.out.println(value);
        }
    }
}
