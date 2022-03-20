package programmer.kode.desain.data;

public interface Car extends HasBrand, IsMaintenance {
//    public abstract void drive(); // bisa langsung
    void drive();

    int getTire();

    default boolean isBig(){
        return false;
    };

}
