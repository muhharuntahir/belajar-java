public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Harun");
        sayHello("Muhammad","Harun");
    }

    static void sayHello(){
        System.out.println("Selamat datang ");
    }

    static void sayHello(String firstName){
        System.out.println("Selamat datang " + firstName);
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Selamat datang " + firstName + " " + lastName);
    }
}
