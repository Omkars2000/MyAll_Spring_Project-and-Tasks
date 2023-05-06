package ProblemsOfRabitAndTrotoies;

import java.util.ArrayList;
import java.util.List;

public class FirstNPrimeNum {
    public static void main(String[] args) {
        int n=5;
        List<Integer> list=fistNPrime(n);
        System.out.println(list);
    }

    private static List<Integer> fistNPrime(int n) {
//        int max= Integer.MAX_VALUE;
        int p=2;
        int q=1;
        List<Integer> list=new ArrayList<>();
        while (q<=n){
            int count1=1;
//            for(int i=2;i*i<=p-1;i++){
//                System.out.println(i);
//                    if (p % i == 0) {
//                        count1 = 0;
//                        break;
//                    }
//                }
            int c=2;
            while (c*c<=p){
                if(p%c==0){
                    count1=0;
                    break;
                }
                c++;
            }
                if(count1==1){
                    list.add(p);
                    q ++;
                }
                p++;
            }
        return list;
        }
    }

