class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> pairs_triplets =new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i = 0 ; i<n-2 ; i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            
            int sum= -1 * nums[i];
            int left= i+1;
            int right = n-1;
            

            while(left < right)
            {   
                int s= nums[left] + nums[right];

                if(s== sum)
                {
                    List<Integer> Unique_triplet = List.of(nums[i], nums[left], nums[right]);
                    pairs_triplets.add(Unique_triplet);
                   
                    

                    left++;
                    right--;

                    while(left < right && nums[left]==nums[left-1])
                    {
                        left++;
                    }
                    while( left < right && nums[right]==nums[right+1])
                    {
                        right--;

                    }

                }
                else if(s<sum)
                {
                    left++;

                }
                else
                {
                    right--;
                }


             

            }
        }
        return pairs_triplets ;


    }
}