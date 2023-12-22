
public class Solution {
    public int findMaxK(int[] nums) {
        int[] largest = new int[nums.length];
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j > 0; j--) {
                if(nums[i]==-nums[j]){
                    largest[i] = nums[i];
                }
            }
        }

        for (int i = 0; i < largest.length; i++) {
            if(largest[i]>result){
                return largest[i];
            }
        }
        return -1;

    }
}

