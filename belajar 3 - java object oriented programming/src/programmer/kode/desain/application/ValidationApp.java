package programmer.kode.desain.application;

import programmer.kode.desain.data.LoginRequest;
import programmer.kode.desain.error.ValidationException;
import programmer.kode.desain.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Harun",null);

        try{
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        }catch (ValidationException | NullPointerException exception){
            System.out.println("Data tidak valid: " + exception.getMessage());
        }finally {
            System.out.println("Selalu di eksekusi");
        }
//        catch (NullPointerException exception){ // bisa digabung
//            System.out.println("Data null: " + exception.getMessage());
//        }

        LoginRequest loginRequest1 = new LoginRequest(null,null);
        ValidationUtil.validateRuntime(loginRequest1); // error heandler
        System.out.println("Sukses");
    }
}
