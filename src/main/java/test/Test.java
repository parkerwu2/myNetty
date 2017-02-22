package test;

/**
 * Created by parker on 2017/2/18.
 */
class Null {
    public void a() {
        System.out.println("aa");
    }
}
public class Test {
    public static void main(String[] args) {
        ((Null)null).a();
    }
}
