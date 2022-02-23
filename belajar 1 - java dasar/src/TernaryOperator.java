public class TernaryOperator {
    public static void main(String[] args) {

        var nilai = 75;
        String ucapan;

        // tanpa ternary
        if(nilai >= 75){
            ucapan = "Selamat Anda Lulus";
        } else {
            ucapan = "Silahkan coba lagi";
        }

        System.out.println(ucapan);

        // menggunakan ternary
        ucapan = nilai >= 75 ? "Selamat Anda Lulus" : "Silahkan Coba Lagi";

        System.out.println(ucapan);

    }
}
