package autoboxing;

/**
 * Created by ychikh on 09.06.2016.
 */
public class Main {

    public static void main(String[] args) {
        int i =10;
        long z = i*(long)i;
        Integer ii = i; //Autoboxing

        long iii=i;
        int a = (int)iii;
        //int a = iii;    //compile error

        autoboxing(i);  //Autoboxing
        autoboxing((short)i);   //Casting from wider to narrow type
        autoboxing(iii);

        //notCompile(i); //Not compile because need two steps to convert - int-Integer-Long

        int primitive = Integer.parseInt("123");
        double primitive2 = Integer.parseInt("sasas");  //NumberFormatException
        double primitive3 = Double.parseDouble("ddd");


        Integer wrapperAutoboxwed = Integer.valueOf("qqq"); //NumberFormatException
        Integer wrapper2 = Integer.valueOf((int) 5.34);
        Double wrapper3 = Double.valueOf((int) 5.34);
        double wrapper4 = Double.valueOf((int) 5.34);       //Also works Autoboxing
        double wrapper5 = Integer.valueOf((int) 5.34);
        //SOF - However, valueOf(String) returns a new Integer() object whereas parseInt(String) returns a primitive int.
        //intValue is an instance method whereby parseInt is a staticc method
    }

    static void autoboxing(Integer i){
        System.out.println(1);
    }
    static void autoboxing(Short i){
        System.out.println(2);
    }

    static void autoboxing(Long i){
        System.out.println(3);
    }

    static void notCompile(Long i){}


}
