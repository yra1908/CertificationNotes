package inheritance.constructor;

/**
 * Created by ychikh on 15.06.2016.
 */
public class Animal {
    Animal(int age){
        super();
    }
}

class Tiger extends Animal{


    Tiger(int age) {
        super(age); //without won't compile
    }

    Tiger(String name){
        this(10);
    }
}
