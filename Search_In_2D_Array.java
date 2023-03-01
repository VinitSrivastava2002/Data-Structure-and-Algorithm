import java.util.Arrays;

public class Search_In_2D_Array {
    public static void main(String[] args) {
      int[][] arr={{10,20,30,40},
                    {15,25,35,45},
                    {28,29,37,49},
                    {33,34,38,50}};

      int target=35;
       int ans[]=linearSearch(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] linearSearch(int[][] arr, int target){

        /*
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if (arr[row][col]==target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};

         */

        /// Solve by elimination method
        int r=0;
        int c=arr.length-1;
        while(r<arr.length && c>=0){
            if(arr[r][c] == target ){
                return new int[] {r,c};
            }
            if(arr[r][c]<target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[] {-1,-1};
    }
}
