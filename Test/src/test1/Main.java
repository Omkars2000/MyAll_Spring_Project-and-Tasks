package test1;
//3--fiz
//5--buzz
//3&5 fiz-buzz
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <=100 ; i++) {
            if(i%5==0 && i%3==0){
                System.out.print("fiz-buzz"+" ");
            }else if(i%5==0){
                System.out.print("buzz");
            } else if (i%3==0) {
                System.out.print("fiz");
            }else {
                System.out.print(i);
            }
        }
    }
}
