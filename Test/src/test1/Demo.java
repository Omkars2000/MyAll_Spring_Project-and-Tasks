package test1;

public class Demo {
    public abstract class Test{
        abstract void test();
    }
    public class Demo2 extends Test{
        @Override
        void test() {
            System.out.println("Test Method");
        }
    }
}
