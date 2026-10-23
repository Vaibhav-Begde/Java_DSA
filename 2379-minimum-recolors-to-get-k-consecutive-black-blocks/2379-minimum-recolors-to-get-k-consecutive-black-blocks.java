class Solution {
    public int minimumRecolors(String blocks, int k) {

        int low= 0 ;
        int high= k-1 ;

        int count_w= 0 ;
     

        int minimunRecolor = Integer.MAX_VALUE;

        for(int i= low ; i<= high ; i++)
        {
            if('W'==blocks.charAt(i))
            {
                count_w++;
            }
           
        }

        while(high < blocks.length())
        {
            minimunRecolor=Math.min(minimunRecolor,count_w);

            low++;
            high++;
            if('W'== blocks.charAt(low-1))
            {
                count_w--;
            }

            if(high == blocks.length())
            {
                break;
            }
            else if('W'==blocks.charAt(high))
            {
                count_w++;
            }
        }
        return minimunRecolor;
    }
    
}