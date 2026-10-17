class Solution {
    public int totalFruit(int[] fruits) {

        int n = fruits.length ;
        int left = 0 ;
        int res= -1;
        Map<Integer,Integer> freq = new HashMap<>();
        for( int right = 0; right < n ; right++)
        {
            int rightTree = fruits[right];
            freq.put(rightTree , freq.getOrDefault(rightTree,0)+1);
            while(freq.size() > 2)
            {
                int leftTree = fruits[left];
                freq.put(leftTree,freq.get(leftTree)-1);
                if(freq.get(leftTree)==0)
                {
                    freq.remove(leftTree);
                }
                left++;

            }
            res = Math.max(res , right - left + 1 );


        } 
        return res;
        
    }
}