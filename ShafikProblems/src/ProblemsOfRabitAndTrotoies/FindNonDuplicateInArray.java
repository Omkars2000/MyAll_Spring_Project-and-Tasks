package ProblemsOfRabitAndTrotoies;

public class FindNonDuplicateInArray {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,3,4,5,8,5,6,5,6};
        boolean[] arr2=new boolean[arr.length];
//        int count=0;
//        int num=arr[count];
        boolean val=true;
        for(int i=0;i<arr.length-1;i++){
            for (int j =0; j <arr.length; j++) {
                if(i==j){
                    continue;
                }
                if (arr[i] == arr[j]) {
                    arr2[i] = true;
                }
            }
        }
        for (int j = 0; j < arr2.length; j++) {
            if(!arr2[j]){
                System.out.print(arr[j]+" ");
            }
        }
        //for(int i=0;i<arr.length-1;i++){
        //            if(count==1)
        //                continue;
        //            if(arr[count]==arr[i])
        //                   arr2[i]=true;
        //               }
        //            }

    }
}
