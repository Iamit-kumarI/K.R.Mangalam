/*
 * Problem:75. Sort Colors
 * Solution:https://leetcode.com/problems/sort-colors/solutions/7346423/java-two-pointers-beats-100-by-amitk300-n1g3
 */
public class Problem1 {
    public void sortColors(int[] nums) {
        // App4 failed 44/89 [0,1,0]
        // int zero=0,two=nums.length-1,one=0;
        // while(one<=two){
        //     if(nums[one]==0){
        //         int temp=nums[zero];
        //         nums[zero]=nums[one];
        //         nums[one++]=temp;
        //     }else if(nums[one]==1){
        //         one++;
        //     }else{
        //         int temp=nums[one];
        //         nums[one]=nums[two];
        //         nums[two--]=temp;
        //     }
        // }
        //App3
        int zero = 0, one = 0, index = 0;
        for (int val : nums) {
            if (val == 1) {
                one++;
            }
            if (val == 0) {
                zero++;
            }
        }
        // boolean falg = true;
        while (zero-- > 0) {
            nums[index++] = 0;
        }
        while (one-- > 0) {
            nums[index++] = 1;
        }
        while (index < nums.length) {
            nums[index++] = 2;
        }
        //App2
        //no no not this way Arrays.sort(nums);
        //App1 beats 20% need to optimise more
        // int index=0;
        // ArrayList<Integer> list0=new ArrayList<>();
        // ArrayList<Integer> list1=new ArrayList<>();
        // ArrayList<Integer> list2=new ArrayList<>();
        // for(int val:nums){
        //     if(val==0)list0.add(val);
        //     else if(val==1)list1.add(val);
        //     else list2.add(val);
        // }
        // for(int val:list0)nums[index++]=val;
        // for(int val:list1)nums[index++]=val;
        // for(int val:list2)nums[index++]=val;
    }
}
