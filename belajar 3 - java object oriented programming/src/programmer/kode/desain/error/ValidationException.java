package programmer.kode.desain.error;

public class ValidationException extends Throwable{
//    private String message;

    public ValidationException(String message){
        super(message);
    }

}
