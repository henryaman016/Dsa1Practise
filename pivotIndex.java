public class pivotIndex {
    public int pivotindex(int[] nums){
       if (nums.length==0)
           return -1;

       int leftsum=0,rightSum=0;
       for (int num:nums)
           rightSum+=num;

       for (int i=0;i<nums.length;i++){
           rightSum-=nums[i];
           if (rightSum==leftsum)
               return i;
           leftsum+=nums[i];
       }
       return -1;
    }
}
