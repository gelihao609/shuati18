/*
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.

*/

class Solution {
    public int maxSubArray(int[] nums) {
        //初始化0，1元素，因为递进方程至少要2元素
        if(nums.length<0) return 0;
        if(nums.length==1) return nums[0];
        int[] array = new int[nums.length];
        array[0] = nums[0];
        int max = nums[0];
        for(int i=0;i<nums.length-1;i++){
            //递进方程：array里放每一步为止的最大连续sum，要么是继续老的，要么新开
            array[i+1]=Math.max(array[i]+nums[i+1],nums[i+1]);
            if(array[i+1]>max) max = array[i+1];
        }
        return max;
    }
}