public class Pattern {
    public static void main(String[] args) {
        int line=10;
        int star=1;
        char ch='A';
        for(int i=0;i<line;i++){
            for(int j=0;j<star;j++){
                System.out.println(ch);
            }
            System.out.println();
            ch++;
            star++;

        }
    }
}
