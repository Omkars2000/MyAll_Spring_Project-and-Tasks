public class Demo {
    private static Object Demo2;

    public void main(String[] args) {
        Demo d1 = new Demo();
//        Demo.Demo2 t1 = getClass();
//        t1.test();
    }

    private Demo.Demo2 getClass(Object demo2) {
        return (Demo.Demo2) demo2;
    }


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
