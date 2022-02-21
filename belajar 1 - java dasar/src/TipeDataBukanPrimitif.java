public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;
        System.out.println(iniByte);

        byte iniByte2;
        iniByte2 = 100;
        System.out.println(iniByte2);

        // konversi primitif ke bukan primitif

        int iniInt = 100;
        Integer iniObject = iniInt;
        System.out.println(iniObject);

        short iniShor = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

        Long amount = 1000000L;
        byte iniByte3 = amount.byteValue();

        System.out.println(iniByte3);

    }
}
