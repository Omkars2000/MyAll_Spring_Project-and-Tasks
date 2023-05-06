package Chabbi2_Khade;

public class WithoutUsingMultiOperator {
    public static void main(String[] args) {
        int a=10;
        int b=40;
        System.out.println(multi(a,b));

    }
    private static int multi(int a, int b) {
        int sum=0;
        for(int i=0;i<a;i++){
            sum+=b;
        }
        return sum;
    }
}
