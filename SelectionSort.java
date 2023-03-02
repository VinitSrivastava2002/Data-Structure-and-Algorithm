import java.util.Arrays;

public class SelectionSort {
        public static void main(String[] args) {
            int[] arr={21,11,32,9,25,8,65};
            selection(arr);
            System.out.println(Arrays.toString(arr));
        }

        static void selection(int[] arr){
            for(int i=0;i<arr.length;i++){
                int lastIndex=arr.length -i -1;
                int maxIndex=getMaxIndex(arr,0,lastIndex);
                swap(arr,maxIndex,lastIndex);
            }
        }

        static void swap(int[] arr,int first,int second){
            int temp=arr[first];
             arr[first]=arr[second];
            arr[second]=temp;
        }

        static int getMaxIndex(int[] arr,int start,int end){
            int maxIndex=start;
            for(int i=0;i<=end;i++){
                if(arr[maxIndex]<arr[i]){
                    maxIndex=i;
                }
            }
            return maxIndex;
        }
}
