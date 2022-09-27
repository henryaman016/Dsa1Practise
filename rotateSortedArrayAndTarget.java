///Given a rotated sorted array and target, return the index of target
public class rotateSortedArrayAndTarget {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,8,9,1,2,3};
        int low=0;
        int high=arr.length-1;
        int key=6;

        int idx=search(arr,low,high,key);
        if (idx!=-1){
            System.out.println(idx);
        }else {
            System.out.println(-1);
        }



    }
    public static int search(int arr[],int low,int high,int key){
        if (low>high){
            return -1;
        }
        int mid=(high+low)/2;
        if (arr[mid]==key){
            return mid;
        }
        if (arr[low]<=arr[high]){
            if (key>=arr[low] && key<=arr[mid]){
                return search(arr,low,mid-1,key);
            }else {
                return search(arr,mid+1,high,key);
            }
        }
        if (key>=arr[mid] && key<=arr[high]){
            return search(arr,mid+1,high,key);
        }
        else {
            return search(arr,low,mid-1,key);
        }
    }
}
