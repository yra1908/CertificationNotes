package classdesighn;


public class OverrideAndHide {

    public static void main(String[] args) {

        Animal a = new Mouse();
        Mouse m = new Mouse();

        System.out.println(a.length);       //  2 Variables Hiding. Nor overriding!!!
        System.out.println(m.length);       // 5 Variables Hiding. Nor overriding!!!

        a.getAnimalLength();                //2
        //m.getMouseLength();               //compile error

        m.getAnimalLength();               //Length = 2
        m.getMouseLength();                //Length = 5  super.length=2

        m.getAnimalDescription();          //false   Static method isBiped() HIDDEN. not overridden.
        m.getMouseDescription();           //true      Static methods not overriding.

        m.getAnimalDescription2();         //true  Not static method isBiped2 overrides!
        m.getMouseDescription2();          //true

    }
}

class Animal {
    public int length=2;
    public void getAnimalLength(){
        System.out.println("Length = "+ length);
    }
    public static boolean isBiped(){
        return false;
    }
    public boolean isBiped2(){
        return false;
    }
    public void getAnimalDescription(){
        System.out.println("Animal walk on 4 legs: " + isBiped());
    }
    public void getAnimalDescription2(){
        System.out.println("Animal walk on 4 legs: " + isBiped2());
    }
}

class Mouse extends Animal{
    public int length=5;
    public void getMouseLength(){
        System.out.println("Length = "+ length + ". And Animal length = "+super.length);
    }
    public static boolean isBiped(){
        return true;
    }
    public boolean isBiped2(){
        return true;
    }
    public void getMouseDescription(){
        System.out.println("Mouse walk on 4 legs: " + isBiped());
    }
    public void getMouseDescription2(){
        System.out.println("Mouse walk on 4 legs: " + isBiped2());
    }
}
