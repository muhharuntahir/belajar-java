public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Muhammad","Harun");
        sayHello("Hafizah", "Almashyra");
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
