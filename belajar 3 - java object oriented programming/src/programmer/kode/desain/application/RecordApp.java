package programmer.kode.desain.application;

import programmer.kode.desain.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Harun", "rahasia");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);
        System.out.println();

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Harun"));
        System.out.println(new LoginRequest("Harun","rahasia"));
    }
}
