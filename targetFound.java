public class targetFound {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,8};
        int target=5;
        System.out.println(search(arr,target));
    }
    public static int search(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]==target){
                return mid;
            }
            else if (target<arr[mid]){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return low;
    }
}
