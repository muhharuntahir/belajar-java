public class ForEach {
    public static void main(String[] args) {

        String[] names = {
                "Muhammad", "Harun", "Tahir", "Kode", "Desain"
        };

        // tanpa foreach
        for (var i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("");
        // dengan foreach
        for (var name : names) {
            System.out.println(name);
        }
    }
}
