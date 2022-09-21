public class binarySearch {
    public static void main(String args[]){
        int arr[]={4,5,6,8,9,1,3,7,2};
        int s=0,e=arr.length-1,mid,result=-1;
        int key= 9;

        while (s<=e) {
            mid = (s + e) / 2;
            {
                if (arr[mid] == key) {
                    result = mid;
                    break;
                } else if (key < arr[mid])
                    e = mid - 1;
                else
                    s = mid + 1;

            }
        }
                if(result==-1)
                    System.out.println("not found");
            else
                    System.out.println(result);

        }
    }

