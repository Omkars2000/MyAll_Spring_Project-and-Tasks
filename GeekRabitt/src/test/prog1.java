package test;

import java.util.Scanner;

public class prog1 {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the no of line");
            int line=s.nextInt();
            int star=1;;

            for(int i=0;i<line;i++){
                char ch='A';
                for(int j=0;j<star;j++){
                    System.out.print(ch++);
                }
                System.out.println();
                star++;

            }
        }
    }

