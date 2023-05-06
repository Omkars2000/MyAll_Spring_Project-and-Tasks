package testDemo;

public interface Demo1 {
    static class Test{
        public static Demo1 method(){
            System.out.println("Master Method");
            return null;
        }

        public static void main(String[] args) {
            method();
        }
    }
}
