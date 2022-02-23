public class Array {
    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Muhammad";
        stringArray[1] = "Harun";
        stringArray[2] = "Tahir";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        String[] stringArray2 = new String[3];

        String[] namaNama = { "Muhammad","Harun","Tahir"};

        int[] arrayInt = new int[]{1,2,3,4,5};
        long[] arrayLong = new long[]{10L,20L,30L};

        System.out.println(arrayLong.length);

        //tidak ada proses penghapusan di array karena sudah fix
        // contohnya pada string di atas
        stringArray[0] = null;

        // atau pada integer
        arrayInt[0] = 0;


        // cara membuat array dalam array
        String[][] arrayNama = {
                {"Muhammad","Harun"},
                {"Ditha", "Sabrina"},
                {"Hafizah", "Almashyra"}
        };

        // tidak bisa, karena hanya array 1 dimensi
        System.out.println(arrayNama[0]);
        //tetap harus memanggil index lain
        System.out.println(arrayNama[0][1]);

    }
}
