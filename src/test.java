/**
 * Created by ychikh on 04.07.2016.
 */
public class test {
    static boolean b;
    static int[] ia = new int[1];
    static char ch;
    static boolean[] ba = new boolean[1];
    public static void main(String args[]) throws Exception{
        boolean x = false;
        if( b ){
            x = ( ch == ia[ch]);
        }
        else x = ( ba[ch] = b );
        System.out.println(x+" "+ba[ch]);
    }
}



class Baap{
    public int h = 4;
    public int getH(){
        System.out.println("Baap "+h); return h;
    }
}
class Beta extends Baap{
    public int h = 44;
    public int getH(){
        System.out.println("Beta "+h); return h;
    }
    public static void main(String[] args) {
        Baap b = new Beta();
        System.out.println(b.h+" "+b.getH());
        Beta bb = (Beta) b;
        System.out.println(bb.h+" "+bb.getH());
    }
}
