public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(faktorial(5));
        System.out.println(faktorialRekursif(6));

        loop(1000);
    }

    // tanpa rekursif
    static int faktorial(int value){
        var result = 1;

        for(var counter = 1; counter <= value; counter++){
            result *= counter;
        }

        return result;
    }

    // dengan rekursif
    static int faktorialRekursif(int value){
        if (value == 1){
            return 1;
        } else {
            return value * faktorialRekursif( value - 1);
        }
    }

    // membuat stack pada java dengan rekursif
    static void loop(int value){
        if( value == 0){
            System.out.println("Selesai");
        } else {
            System.out.println("Loop-" + value);
            loop(value-1);
        }
    }

}
