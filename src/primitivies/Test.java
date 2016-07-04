package primitivies;

/**
 * Created by ychikh on 04.07.2016.
 */
public class Test {

    public static void main(String[] args) {
        byte a =1;
        byte b =2;
        //byte c = a+b;  // + - * / operants for bytes, short, char promote values to int
        int d = a+b;

        a *=b;  // equivalent to  a = (byte) (a+b);
    }
}
