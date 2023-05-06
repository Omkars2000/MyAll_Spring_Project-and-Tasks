package test;

public class prog2 {
    public static void main(String[] args) {
        String n1 = "Be kind to Everyone ";
        String str=" ";
        String[] arr = n1.split(" ");
        for (int i = arr.length-1; i >=0 ; i--) {
            str+=arr[i]+" ";
        }
        System.out.println("Reverse Str: "+str);
    }

}
