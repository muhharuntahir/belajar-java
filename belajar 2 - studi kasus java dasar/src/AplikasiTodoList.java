import java.util.Scanner;
public class AplikasiTodoList {

    public static String[] model = new String[10];

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        viewShowTodoList();
    }

    /**
     * Menampilkan todo list
     */
    public static void showTodoList(){
        System.out.println("TODOLIST");
        for (var i = 0; i < model.length; i++){
            var todo = model[i];
            var no = i + 1;

            if(todo != null){
                System.out.println(no + ". " + todo);
            }
        }
    }

    /**
     * implementasi test untuk menampilkan todo list
     */
    public static void testShowTodoList(){
        model[0] = "Belajar Java Dasar";
        model[1] = "Studi Kasus Java Dasar";
        showTodoList();
    }

    /**
     * Menambah todo ke list
     */
    public static void addTodoList(String todo){
        // cek apakah array model penuh
        var isFull = true;

        // cek apakah todo ada yang kosong?
        for (var i=0; i < model.length; i++){
            if (model[i] == null){
                isFull = false;
                break;
            }
        }

        // meresize array model menjadi 2x
        if (isFull){
            var temp = model;
            model = new String[model.length + 10];

            // memasukkan data yang lama ke data yang baru
            for (var i = 0; i < temp.length; i++){
                model[i] = temp[i];
            }
        }

        // tambahkan ke posisi yang data arraynya null
        for (var i = 0; i < model.length; i++){
            if (model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }

    /**
     * implementasi test menambah todo list
     */
    public static void testAddTodoList(){
        for (var i = 0; i < 23; i++){
            addTodoList("Contoh todo ke-" + i);
        }

        showTodoList();
    }

    /**
     * Menghapus todo dari list
     */
    public static boolean removeTodoList(Integer number){
        // cek apakah angka yang dimasukkan tidak lebih besar dari jumlah index?
        if ((number-1) >= model.length){
            return false;
        } else if( model[number-1] == null){ // apakah angka yang dimasukkan indexnya tidak kosong?
            return false;
        } else {
            // menghapus todo pada list dengan memilih nomornya
            for (var i = (number-1); i < model.length; i++){
                // jika todo yang ingin dihapus ada di akhir
                if(i == (model.length-1)){
                    model[i] = null;
                } else {
                    // memindahkan todo yang dibawah ke atas
                    model[i] = model[i+1];
                }
            }
            return true;
        }
    }

    /**
     * test implementasi menghapus todo list
     */
    public static void testRemoveTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");
        addTodoList("Enam");
        addTodoList("Tujuh");
        addTodoList("Delapan");
        addTodoList("Sembilan");
        addTodoList("Sepuluh");


        var result = removeTodoList(20);
        System.out.println(result);

        result = removeTodoList(8);
        System.out.println(result);

        result = removeTodoList(11);
        System.out.println(result);

        showTodoList();
    }

    /**
     *
     * @return data
     */
    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput(){
        var name = input("Nama");
        System.out.println("Hi " + name);

        var channel = input("Channel");
        System.out.println("Channel Anda " + channel);
    }

    /**
     * Menampilkan view todo list
     */
    public static void viewShowTodoList(){
        while (true){
            showTodoList();
            System.out.println("Menu : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih");

            if(input.equals("1")){
                viewAddTodoList();
            }else if (input.equals("2")){
                viewRemoveTodoList();
            }else if(input.equals("x")){
                break;
            }else{
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    /**
     * Test Menampilkan Todo List
     */
    public static void testViewShowTodoList(){
        addTodoList("Belajar Java");
        addTodoList("Belajar Java OOP");
        addTodoList("Studi Kasus Java Dasar");

        viewShowTodoList();
    }


    /**
     * Menampilkan view menambahkan todo list
     */
    public static void viewAddTodoList(){
        System.out.println("TAMBAH TODOLIST");

        var todo = input("TODO (x jika batal)");
        if(todo.equals("x")){
            // batal
        }else {
            addTodoList(todo);
        }
    }

    /**
     * Test view menambahkan todolist
     */
    public static void testViewAddTodoList(){
        viewAddTodoList();
    }

    /**
     * Menampilkan view menghapus todo list
     */
    public static void viewRemoveTodoList(){
        System.out.println("HAPUS TODOLIST");

        var number = input("Nomor yang Dihapus (x jika batal)");
        if(number.equals("x")){
            // batal
        }else {
            boolean success = removeTodoList(Integer.valueOf(number));
            if(!success){
                System.out.println("Gagal Menghapus todolist : " + number);
            }
        }
    }

    /**
     * test view remove todolist
     */
    public static void testViewRemoveTodoList(){
        viewRemoveTodoList();
    }
}
