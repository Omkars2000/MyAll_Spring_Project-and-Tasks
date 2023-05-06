package testDemo;

public class StaticContex {
    public static void main(String[] args) {
      String s1="111122111122";
      String s2="11111112211111111111";
      comString(s1,s2);
    }

    private static void comString(String s1, String s2) {
        boolean[] arr1=new boolean[s1.length()+1];
        if(s1.charAt(0)==s2.charAt(0)){
            arr1[0]=true;
        }
//        for(int i=0;i<s1.length();i++) {
//            for (int j = i+1; j < s2.length(); j++) {
//                if (s1.charAt(i) == s2.charAt(j)) {
//                    arr1[i] = true;
//                }
//            }
//        }
        int p=0;
        int l=0;
        if(s1.length()>s2.length()){
            l=s2.length()-1;
        }else
            l=s1.length()-1;
        while (p<=l){
           if( s1.charAt(p)==s2.charAt(p)){
               arr1[p]=true;
           }
           p++;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]){
                System.out.print(s1.charAt(i)+" ");
            }

        }
    }

}
