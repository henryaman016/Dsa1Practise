public class twoSum {
    public int[] twosum(int[] arr,int target){
        int [] sum=new int[2];
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (target==arr[i]+arr[j]){
                    sum[0]=i;
                    sum[1]=j;
                    return sum;
                }
            }
        }
        return sum;
    }
}


//leetcode two sum target