package PiterionQuetions;

public class Pattern {
    public static void main(String[] args) {

        int line = 5;
        int star = 1;
        int ch = 1;
        for (int i = 0; i < line; i++) {

            for (int j = 0; j < star; j++) {
                System.out.print(ch++);
            }
            System.out.println();
            star++;
        }
        evenOdd();
        print();
    }

    public static void evenOdd() {
        int a = 20;
        if (a % 20 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }

    public static void print() {
        for (int i = 0; i < 20; i++) {
            if (i % 15 == 0) {
                System.out.println(i + " X");
            } else if (i % 5 == 0) {
                System.out.println(i + " F");
            } else if (i % 3 == 0) {
                System.out.println(i + " T");

            }
        }
    }
}


//even ood