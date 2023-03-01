public class Search_Min_Number {
    public static void main(String[] args) {
        int[] n={11,21,33,54,2};
        System.out.println(min(n));

    }
    static int min(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int value =Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){

            value=arr[0];
            if(arr[i]<value){
                value=arr[i];
            }

        }
        return value;

    }
}
