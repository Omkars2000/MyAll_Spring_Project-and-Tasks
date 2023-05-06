package PiterionQuetions;

public class BubleSort {
    public static void main(String[] args){
        int[] arr={10,20,5,7,20,4};
        for(int i=0;i<arr.length-1;i++){
            boolean flag=false;
            for(int j=0;j<=arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
                if(!flag){
                    break;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

