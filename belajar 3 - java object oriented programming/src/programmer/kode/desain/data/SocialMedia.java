package programmer.kode.desain.data;

public class SocialMedia {
    String name;
}

class Facebook extends SocialMedia{
   final void login(String username, String password){
        //isi method
    }
}

class FakeFacebook extends Facebook{
    //ERROR // Tidak bisa di override
//    void login(String username, String password){
        //isi method
//    }
}
