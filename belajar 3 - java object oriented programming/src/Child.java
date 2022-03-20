public class Child extends Parent{
    String name;
    void doit(){
        System.out.println("Do it in child");
        System.out.println("Parent in child name is " + super.name);
    }
}
