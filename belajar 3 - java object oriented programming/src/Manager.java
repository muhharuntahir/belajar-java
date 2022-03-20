class Manager extends Employee {
    String address;

    
    Manager(String name, String address){
        super(name);
        this.address = address;
    }

    Manager(String name){
        this(name, null);
    }

    Manager(){
        this(null);
    }

    void sayHello(String name){
        System.out.println("Hi " + name + ", nama saya Manager " + this.name);
    }
}
