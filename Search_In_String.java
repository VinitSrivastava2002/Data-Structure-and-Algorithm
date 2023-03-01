import java.util.Arrays;

public class Search_In_String {
    public static void main(String[] args) {
        String n="vinitsrivastava";
        char m='s';
        System.out.println(search(n,m));
        System.out.println(Arrays.toString(n.toCharArray()));//Convert String in to Array
    }
    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for (int i=0;i<str.length();i++){
            if (target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
