import java.util.Arrays;
class Solution {
    public void moveZeroes(int[] nums) {

        int i = 0 ;
        int j= 0 ;
        while(i< nums.length)
        {
            if(nums[i]==0)
            {
                i++;
            }
            else{
                swap(nums,i , j);
                j++;
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
      

    public static int[] swap(int[] nums, int i, int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]= temp;
        return nums;
    }
    
}