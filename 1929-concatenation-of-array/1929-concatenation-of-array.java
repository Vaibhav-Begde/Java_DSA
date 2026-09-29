class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] arr =new int[nums.length*2];
        int l =0;
        int r=nums.length;
        for(int i = 0 ;i<nums.length;i++)
        {
            arr[l]=nums[i];
            arr[r]=nums[i];
            l++;
            r++;

        }
        return arr;
        
    }
}