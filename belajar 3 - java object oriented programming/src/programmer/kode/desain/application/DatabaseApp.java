package programmer.kode.desain.application;

import programmer.kode.desain.data.Data;
import programmer.kode.desain.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("Harun", null);
        System.out.println("sukses");

        // bisa jg membuat try catch
//        try{
//            connectDatabase("Harun", null);
//            System.out.println("sukses");
//        }catch (DatabaseError error){
//            System.out.println("Error " + error.getMessage());
//        }

    }

    public static void connectDatabase(String username, String password){
        if(username == null || password == null){
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
