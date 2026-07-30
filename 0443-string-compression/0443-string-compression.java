class Solution {
    public int compress(char[] chars) {
        

        int i = 0 ;
        int idx=0;

        while(i<chars.length)
        {
            char current = chars[i];
            int count =0 ;

            while( i< chars.length && chars[i] == current )
            {
                i++;
                count++;
            }
            if(count == 1 )
            {
                chars[idx++]=current ;
            }
            else
            {
                chars[idx++]= current ;

                String  str=  Integer.toString(count);
                for(char s: str.toCharArray())
                {
                    chars[idx++]=s;
                }
            }
        }
        return idx;

        
    }
}