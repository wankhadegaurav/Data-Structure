public class MedianTwoSortArray 
{
    public static void main(String args[])
    {

        int nums1[]={1,2};
        int nums2[]={3,4};
       System.out.println(median(nums1,nums2));

    }

   // Tc complexity is O(N+M) and sc O(N+M)
     public static double median(int arr1[],int arr2[])
    {
        int left=0;
        int right=0;
        int arr[]=new int[arr1.length+arr2.length];
        int index=0;
        while(left<arr1.length &&right<arr2.length)
        {
            if(arr1[left]<arr2[right]){
                arr[index++]=arr1[left];
                left++;
            }
            else{
                arr[index++]=arr2[right];
                right++;
            }            
        }
        if(left<arr1.length){
            while(left<arr1.length)
            {
                arr[index++]=arr1[left];
                left++;
            }
        }
        if(right<arr2.length){
            while(right<arr2.length)
            {
                arr[index++]=arr2[right];
                right++;
            }
        }
       if(arr.length%2==0){
        return (arr[arr.length/2]+arr[arr.length/2 -1])/2;
       }
       
        return arr[arr.length/2];
    }


}
