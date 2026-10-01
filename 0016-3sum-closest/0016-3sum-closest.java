class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int ressum = 0 ; 
        int maxdeff = Integer.MAX_VALUE ; 
        for(int i = 0 ; i<n-2 ; i++)
        {   if(i> 0 && nums[i]== nums[i-1])
            {
                continue;
            }
            int left = i+1;
            int right = n-1;
            while(left < right )
            {
                int sum =nums[i]+nums[left] + nums[right] ; 
                
               
                int deff = Math.abs(sum - target) ;
                if(deff < maxdeff)
                {

                    maxdeff = deff;
                    ressum = sum ;


                }
                if(target == sum)
                {
                    return sum ; 
                }
                else if(sum< target )
                {
                    left++ ;

                }
                else
                {
                    right--;

                }
            }
        }
        return ressum;
        
    }
}