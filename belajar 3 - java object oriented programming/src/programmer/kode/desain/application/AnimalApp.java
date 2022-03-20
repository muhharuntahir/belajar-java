package programmer.kode.desain.application;

import programmer.kode.desain.data.Animal;
import programmer.kode.desain.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();
    }
}
