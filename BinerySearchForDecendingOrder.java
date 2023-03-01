public class BinerySearchForDecendingOrder {
    public static void main(String[] args) {
        int[] arr={13,11,9,6,4,3,2,1};
        int target=9;
        int ans=search(arr,target);
        System.out.println(ans);

    }
    static int search(int[] arr,int target ){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                end=mid-1;
            }
            else if(target<arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
