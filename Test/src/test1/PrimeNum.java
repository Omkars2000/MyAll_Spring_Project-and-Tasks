package test1;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc1.nextInt();
        boolean status=false;
        //100--->2,4,5,50
        //a--2
        //b---25
        for (int i = 2; i <n/2; i++) {
            if(n%i==0){
                System.out.println("Not Prime");
                status=true;
                break;
            }
        }
        if(!status){
            System.out.println("Prime number");
        }
    }
}
