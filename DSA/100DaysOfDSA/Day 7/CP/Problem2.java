package CP;
/*
 * Problem:
 * Solution:
 */
public class Problem2 {
    public static void main(String[] args) {
        int []nums={1,1,2};
        System.out.println(removeDublicate(nums));
    }
    public static int removeDublicate(int []arr){
        int start=0;
        for(int i=1;i<arr.length;i++){
            if(arr[start]!=arr[i])arr[++start]=arr[i];
        }
        return start+1;
    }
}
