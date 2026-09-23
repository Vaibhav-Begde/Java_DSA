class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {


        if(nums1.length==0)
        {
            System.out.println(Arrays.toString(nums1)); 
        }
        else{
            int[] new_nums1 = nums1.clone();
        int i = 0;
        int j = 0 ;
        int idx= 0 ;

        while(i< m && j<n)
        {
            if(new_nums1[i]<nums2[j])
            {
                nums1[idx]= new_nums1[i];
                idx++;
                i++;
            }
            else{
                nums1[idx]= nums2[j];
                idx++;
                j++;
            }
        }

        while(i<m)
        {
            nums1[idx]= new_nums1[i];
            idx++;
            i++;

        }

        while(j<n)
        {
            nums1[idx]= nums2[j];
            idx++;
            j++;

        }
        System.out.println(Arrays.toString(nums1));
        }
    }
}