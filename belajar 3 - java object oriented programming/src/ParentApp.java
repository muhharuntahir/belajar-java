public class ParentApp {
    public static void main(String[] args) {

        Child child = new Child();
        child.name = "Harun";
        child.doit();
        System.out.println(child.name);

//        Parent parent = (Parent) child;
//        Parent parent = new Parent();
        Parent parent = child;
        parent.doit();
        System.out.println(parent.name);
    }
}
