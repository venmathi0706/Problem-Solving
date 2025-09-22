class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {      int m=nums1.length;
       int n=nums2.length;
        int ans[]=new int[n+m];
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0&&j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k--]=nums1[i--];
                
            
            }
            else{
                nums1[k--]=nums2[j--];
            }
        }
        while(j>=0){
            nums1[k--]=nums2[j--];
        }
         
        int num=nums1.length;
        if(num%2==1){
            return nums1[nums1.length/2];
        }
        else{
            double sum=nums1[nums1.length/2]+nums1[(nums1.length/2)-1];
            return sum/2;
        }
    }
}
