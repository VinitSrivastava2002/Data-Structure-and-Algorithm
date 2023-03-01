public class Searching {
    public static void main(String[] args) {
    int[] n={1,2,3,4,5,6};
    int m=5;
    int sum=linearSearch(n,m);
        System.out.println(sum);
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){

            if(target==arr[i]){
                return i;//fot return a index value
            }
        }
        return -1;
    }
}
