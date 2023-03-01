public class Search_In_Range {
    public static void main(String[] args) {
        int[] n={1,2,3,4,5,6};
        int target=4;
        System.out.println(linearSearch(n,target,2,4));//for a particular range

    }
    static int linearSearch(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<end;i++){

            if(target==arr[i]){
                return i;//for return a index value
            }
        }
        return -1;
    }
}
