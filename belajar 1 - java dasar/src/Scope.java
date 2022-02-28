public class Scope {
    public static void main(String[] args) {
        // System.out.println(hello); // tidak bisa karena beda blok

        sayHello("Harun");
        sayHello("");
    }

    static void sayHello(String name){
        String hello = "Hello " + name;

        if(!name.isBlank()){
            String hi = "Hi " + name;
            System.out.println(hi);
        }

       // System.out.println(hi); // tidak bisa karena beda blok
        System.out.println(hello);
    }
}
