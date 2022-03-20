package programmer.kode.desain.application;

import programmer.kode.desain.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        category.setId("ID");
        System.out.println(category.getId());

        category.setId(null);
        System.out.println(category.getId());
    }

}
