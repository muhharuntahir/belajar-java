public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Harun");
        employee.sayHello("Ditha");

        employee = new Manager("Hafizah");
        employee.sayHello("Ahsan");

        employee = new Employee("Khawla");
        employee.sayHello("Vidi");

        sayHello(new Employee("Muhammad"));
        sayHello(new Manager("Harun"));
        sayHello(new VicePresident("Tahir"));

    }

    static void sayHello(Employee employee){
        // Cek konversi apakah sudah sesuai
        if (employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP "+ vicePresident.name);
        } else if (employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello Employee "+ employee.name);
        }

    }
}
