class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m+n];
        int i;
        for(i = 0; i < m;i++){
            arr[i] = nums1[i];
        }
        int k = i;
        for(i = 0; i < n;i++){
            arr[k] = nums2[i];
            k++;
        }
        Arrays.sort(arr);
        int size = m+n;
        double median;
        if(size % 2 == 0){
            median = (arr[size/2] + arr[(size/2) - 1]) / 2.0;
        }
        else{
            median = arr[(int)(size/2)];
        }
        return median;
    }
}
