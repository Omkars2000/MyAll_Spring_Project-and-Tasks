package ProblemsOfRabitAndTrotoies;

public class Pattern1 {
    public static void main(String[] args) {
        int line=5;
        int star=1;
        for(int i=0;i<=line;i++){
            for (int j = 0; j < star; j++) {
                if(i%2==0){
                    System.out.print("*");
                }else
                  System.out.print("#");
            }
            System.out.println();
            star++;
        }

    }
}
