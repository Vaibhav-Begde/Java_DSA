import java.lang.Math;
class Solution {
    public int maxArea(int[] height) {

        int L= 0 ;
        int R =height.length-1;
        int maxArea= 0;

        while (L<R)
        {
            int width = R-L;

            int minHeight=Math.min(height[R],height[L]);

            int area = width * minHeight ;  

            maxArea = Math.max(maxArea , area);

            if(height[L]< height[R])
            {
                L++;
            }
            else
            {
                R--;
            }


        }
        return maxArea;
        
    }
}