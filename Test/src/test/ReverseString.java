package test;


import java.util.Scanner;

/*
Q.2 Write a java program to reverse the statement.

Ex:-
Input:- Geekrabit is great learning

Output:- learning great is Geekrabit
 */
public class ReverseString {
    public static void main(String[] args) {
        String str="Be ready to learn";
        // get the value from user by using nextLine() method
        String revrseStr="";
        String[] arr=str.split(" ");
        for (int i = arr.length-1; i >=0; i--) {
            revrseStr+=arr[i]+" ";
        }
        System.out.println("Reverse String is: "+revrseStr);
    }
}
