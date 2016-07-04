package staticc;

import static java.util.Collections.*;
//static import  java.util.Collections.*;
//import static java.util.Collections.sort();
/**
 * Created by ychikh on 13.06.2016.
 */
public class Main {

    static int a;
    int b;


    static {
        System.out.println("first");
    }

    {
        System.out.println("second. After init new Main()");
    }

    public static void main(String[] args) {
        System.out.println("Main");
        Main main = new Main();

        System.out.println(a);          //0
        System.out.println(main.b);     //0
        //System.out.println(b);        //can't call instance var or method from static method
        return;
    }

    static{
        System.out.println("before main");

    }

    {
        System.out.println("after main non static");
    }

    int met(){

        return 1;
        //return null;      compile error
        //return;           compile error
    }

}
