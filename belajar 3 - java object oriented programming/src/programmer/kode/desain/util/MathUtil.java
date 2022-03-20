package programmer.kode.desain.util;

public class MathUtil {
    // dapat memasukkan banyak angka sekaligus pada sum(1,1,1,1,1,1);
    public static int sum(int... values){
        int total = 0;
        for(var value : values){
            total += value;
        }
        return total;
    }
}
