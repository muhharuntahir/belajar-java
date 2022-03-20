package programmer.kode.desain.application;

import programmer.kode.desain.data.*;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Macbook Pro", 30000000);

        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data();
    }
}
