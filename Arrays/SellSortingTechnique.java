public class SellSortingTechnique 
{
    public static void main(String args[])
    {
        int arr1[]={1, 4, 8, 10};
        int arr2[]={2, 3, 9};
        merge(arr1, arr2, arr1.length, arr2.length);
        for(int i=0;i<arr1.length+arr2.length;i++)
        {
            if(i<arr1.length){
                System.out.println(arr1[i]);
            } 
            else{
                System.out.println(arr2[i-arr1.length]);
            }  
        }
        

    }
    public static void merge(int nums1[],int nums2[],int n,int m)
    {
      int length=n+m;
      int gap=length/2;
      while(gap>0)
      {
         int left=0;
         int right=left+gap;
         while(right<length)
         {
            if(left<n&&right>=n){
                swap(nums1,nums2,left,right-n);
            }
            else if(left>=n){
                swap(nums2,nums2,left-n,right-n);
            }
            else{
                swap(nums1,nums1,left,right);
            }
           left++;
           right++;
         }
         if(gap==1) break;
         gap=(gap/2)+(gap%2);
      }

    }
    public static void swap(int arr1[],int arr2[],int index1,int index2)
    {
        if(arr1[index1]>arr2[index2]){
            int temp=arr1[index1];
            arr1[index1]=arr2[index2];
            arr2[index2]=temp;
        }

    }



}
