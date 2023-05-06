package Chabbi2_Khade;



public class ReverseString {
    public static void main(String[] args) {
        String name="OMKAR";
        System.out.println(reverseStr(name));
    }

    private static String reverseStr(String name) {
        String str="";
        for(int i=name.length()-1;i>=0;i--){
            str+=name.charAt(i);
        }
        return str;
    }

}
