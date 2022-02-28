public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {50,50,50};
        sayCongrats("Muhammad Harun", values);

        sayCongratulation("Hafizah Almashyra", 80,90,75,90);
    }

    // tanpa variabel argumen
    static void sayCongrats(String name, int[] values){
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }

    // dengan variabel argumen
    static void sayCongratulation(String name, int... values){
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
