public class Type_Conversion {
    public static void main (String args[]){
        byte b = 127;
        int a  = 258;
        b = (byte)a; // 258 % 256;
        System.err.println(b);

    }
}
