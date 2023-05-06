package test;

import java.util.Scanner;
/*
Input 10
output:
A
AB
ABC
ABCD
ABCDE
ABCDEF
ABCDEFG
ABCDEFGH
ABCDEFGHI
ABCDEFGHIJ

 */

public class Pattern {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the count of Lines ");
        int l= sc1.nextInt();
        int no=1;
        for (int i = 0; i <l ; i++) {
            char ch='A';
            for (int j = 0; j < no ; j++) {
                System.out.print(ch++);
            }
            System.out.println();
            no++;
        }
    }
}
