package testDemo;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Demo1 demo1=Demo1.Test.method();
        List<Integer> n1=new ArrayList<>();
        n1.add(new Integer(10));
        int a=n1.get(0);
        System.out.println(a);
        System.out.println(n1.get(0));
//        int[] arr={1,2,3,4,5};
        System.out.println("====================");
        List<String> n2=new ArrayList<>();
        n2.add("A");
        n2.add("B");
        n2.add("E");
        n2.add("G");
        for (int i = 0; i < n2.size() ; i++) {
//            if(n2.contains("E")){
//                n2.remove(3);
//            }
            System.out.println(n2.get(i));
        }
        System.out.println("================");
        for (String p:n2) {
//            if(n2.contains("E")){
//                n2.remove(3);
//            }
            System.out.println(p);
        }
        ArrayList<Integer> n3=new ArrayList<>();
        n3.add(10);
        n3.add(20);
        n2.addAll(n2);
        System.out.println(n3);
    }
}
