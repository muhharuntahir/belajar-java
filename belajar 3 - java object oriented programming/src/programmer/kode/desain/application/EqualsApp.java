package programmer.kode.desain.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Muhammad";
        first = first + " " + "Harun";

        System.out.println(first);

        String second = "Muhammad Harun";
        System.out.println(second);

        System.out.println("Apakah first = second : " + (first == second));
        System.out.println("Apakah first.equals(second) : " + (first.equals(second)));


        String third = "Muhammad Harun";

        System.out.println(second == third);

    }
}
