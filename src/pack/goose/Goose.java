package pack.goose;

import pack.bird.Bird;

/**
 * Created by ychikh on 08.06.2016.
 */
public class Goose extends Bird {

    void method(){
        doSmth();
    }

    void method2(){
        Goose g = new Goose();
        g.doSmth();
        System.out.println(g.a);
    }

    void method3(){
        Bird b = new Bird();
        //b.doSmth();     //compile error
    }

    void method4(){
        Bird b = new Goose();
        //b.doSmth();     //compile error
    }
}
