package Chabbi2_Khade;

public class WithotUsingInbuiltMethodAnagram {
    public static void main(String[] args) {
        String s1="Omkar ";
        String s2=" mkaro";
        if(anagram(s1,s2)){
            System.out.println("Strings are Anagram");
        }else
            System.out.println("Strings are not Anagram");

    }

    private static boolean anagram(String s1, String s2) {
        char[] arr1= s1.trim().toLowerCase().toCharArray();
        char[] arr2= s2.trim().toLowerCase().toCharArray();
        if(arr1.length != arr2.length)
             return false;
         int xor=0;
        for (int i =0; i <arr1.length; i++) {
             xor ^= arr1[i] ^ arr2[i];
        }
        return xor == 0?true : false;
    }
}
