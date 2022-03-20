public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("Kombe Bolic", "Makassar");

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);

        person.sayHello("Eko");

        Person person1 = new Person("Khawla", "Parepare");
//        person1.name = "Ditha Sabrina";
        person1.sayHello("Hafizah");

        Person person2 = new Person("Nurmiah");
        person2.sayHello("Tahir");
    }
}
