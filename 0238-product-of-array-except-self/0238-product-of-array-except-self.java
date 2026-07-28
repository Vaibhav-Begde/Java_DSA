class Solution {
    public int[] productExceptSelf(int[] nums) {

        int  n = nums.length;

        int [] priffix = new int[n];
        priffix[0]=1;
        for(int i = 1 ; i<n ;i++ )
        {
            priffix[i]= priffix[i-1] * nums[i-1];

        }
        int [] saffix = new int[n];
        saffix[n-1]=1;
        for(int i =n-2 ; i>=0 ;i-- )
        {
            saffix[i]= saffix[i+1] * nums[i+1];

        }
        int [] ans = new int[n];
        for(int k = 0 ; k< n ; k++)
        {
            ans[k]= priffix[k]* saffix[k];
        }
        return ans;
        
    }
}