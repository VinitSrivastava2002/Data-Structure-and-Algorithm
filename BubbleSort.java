

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={21,11,32,9,25,8,65};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubbleSort(int  [] arr){
        // run the step n-1 time

        for(int i=0;i<arr.length-1;i++){

           // boolean Swapped = false;

            for(int j=0;j<(arr.length-i-1);j++){

                // swap if the  item is smaller than previous item
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                   // Swapped=true;
                }
            }
            // no need for swapping
            /*
            if(!Swapped){
                break;
            }*/
        }
    }
}
