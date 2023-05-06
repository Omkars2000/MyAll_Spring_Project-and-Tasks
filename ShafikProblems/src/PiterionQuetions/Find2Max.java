package PiterionQuetions;

public class Find2Max {
    public static void main(String[] args) {
        int[] arr= {10,29,34,22,55,44,55,65};
        int max= arr[0];
        int _2max=arr[1];
        //OR make a use of enhance for loop
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                _2max=max;
                max=arr[i];
            } else if (arr[i]>_2max && arr[i]!=max) {
                _2max=arr[i];
            }
        }
        System.out.println("Max Num: "+max +"\n"+"Max 2 num: "+_2max);
    }
}
