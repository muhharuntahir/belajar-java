public class Variable {
    public static void main(String[] args) {

        String name;
        name = "Muhammad Harun";

        System.out.println(name);

        int age = 27;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        name = "Harun Tahir";
        System.out.println(name);

        var firstName = "Muhammad";
        var middleName = "Harun";
        var lastName = "Tahir";

        var fullName = firstName + " " + middleName + " " + lastName;
        System.out.println(fullName);

        final var application = "Belajar Java";

        System.out.println(application);

    }
}
