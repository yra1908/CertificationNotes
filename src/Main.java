import java.time.Period;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        checkTrick();
        int d;
        int Public = 5;
        //System.out.println(d);
        byte x = 5;
        byte y = 5;
        long s=x+y;

        String st = null;

        int xa=0;
        while( xa++ < 10){

        }
        System.out.println(xa);  //11

        String st2="012345678";
        System.out.println(st2.substring(7,5));
    }

    void trick1(){

        for(int i =0; i<10;){
            i=i++;  //never ending loop
            System.out.println(i);
        }
    }

    void trick2(){
        int a=1;
        int b =2;
        //String c = a+1;  //compile error
        String c = ""+1;
        String c1 = ""+'a';
        String c2 = ""+false;
        System.out.println(String.valueOf(a + b));
    }

    void trick3(){
        //int[][] java = new int[][];  //compile error
        int[][] java = new int[2][];
        Object [][][] cub = new Object[2][3][10];
        int l= java.length;
        //int l= java.capacity();
        //int l= java.length();     //compile error
    }
    void trick4(){
        ArrayList list = new ArrayList();
        list.size();

    }

    static void checkTrick(){
        String a = "";
        a+=2;
        a+='c';
        a+=false;
        if(a=="2cfalse") System.out.println("==");
        if(a.equals("2cfalse")) System.out.println("equals");

    }



}
//public class Second{      //compile error
class Second{

}
