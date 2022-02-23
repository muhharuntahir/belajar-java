public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "B";

        switch (nilai){
            case "A" :
                System.out.println("Nilai Anda Luar Biasa");
                break;
            case "B" :
            case "C" :
                System.out.println("Nilai Anda cukup Baik");
                break;
            case "D" :
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Anda belum mengikuti ujian");
        }

        var nilai2 = "A";
        // Switch Lamda
        switch (nilai2){
            case "A" -> {
                System.out.println("Nilai Anda Luar Biasa");
                System.out.println("Anda Akan mendapatkan Hadiah");
            }
            case "B", "C" -> System.out.println("Nilai Anda Cukup Baik");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Anda Belum Mengikuti Ujian");
            }
        }

        // Switch Tanpa Yield
        String ucapan;
        switch (nilai2){
            case "A" -> ucapan = "Nilai Anda Luar Biasa";
            case "B", "C" -> ucapan = "Nilai Anda Cukup Baik";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> ucapan = "Anda Belum Mengikuti Ujian";

        }

        System.out.println(ucapan);

        // Switch dengan Yield
        var nilai3 = "D";
        ucapan = switch (nilai3){
            case "A" :
                yield "Nilai Anda Luar Biasa";
            case "B", "C" :
                yield  "Nilai Anda Cukup Baik";
            case "D" :
                yield  "Anda Tidak Lulus";
            default :
                yield  "Anda Belum Mengikuti Ujian";
        };

        System.out.println(ucapan);

    }
}
