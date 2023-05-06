package test1;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static void main(String[] args) {
        String s1 = "aaavvv";
        String s2 = "aavvv";
        messege(s1,s2);
    }
    public static void messege(String s1, String s2){


        if (s1==null||s2==null||s1.length()==0||s2.length()==0) {
            System.out.println("INPUT STRING NOT BE NULL OR EMPTY");
        }

        else {

            String ans = stringOut(s1, s2);
            char[] chars = ans.toCharArray();
            if (chars[0] == '2') {
                System.out.println("NO COMMON CHAR");
            } else if (chars[0] == '1') {
                System.out.print("COMMON CHAR ARE PRESENT : ");
                for (int i = 1; i < chars.length; i++) {
                    System.out.print(chars[i] + " ");
                }

            } else if (chars[0] == 'I') {
                System.out.println("INPUT STRING NOT BE NULL OR EMPTY");
            }
        }
    }
    public static  String stringOut(String s1, String s2) {

        String  st1="1";
        String st2="2";
        char[] ch1 = s1.toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            String ch = String.valueOf(ch1[i]);
            if (s2.contains(ch)) {
              st1+=ch;
            }
        }
        int le1=st1.length();
        if(le1==1){
            return st2;
        }
        return st1;
    }

    }




