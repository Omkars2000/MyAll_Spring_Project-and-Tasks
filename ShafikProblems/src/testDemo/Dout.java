package testDemo;

public class Dout {

    public static void main(String[] args) {
        char []c ={'a','1','b',' ','A','0'};
        for (int i = 0; i < 5; ++i) {

            if(Character.isDigit(c[i]))
                System.out.println(c[i]+" is a digit");
            if(Character.isWhitespace(c[i]))
                System.out.println(c[i]+" is Whitespeace");
            if(Character.isUpperCase(c[i]))
                System.out.println(c[i]+" is Upper ");
            if(Character.isLowerCase(c[i]))
                System.out.println(c[i]+" is a Lower");
            System.out.println(i);
           i=i+3;
            System.out.println(i);
        }
    }
}
