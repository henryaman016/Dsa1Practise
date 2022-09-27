import java.util.HashSet;

public class hashingPairSum {
    public static void main(String[] args) {
        int arr[]={1,4,6,10,8,8};
        int target=10;
        printPairs(arr,target);

    }
    static void printPairs(int arr[],int target){
        HashSet<Integer>set=new HashSet<Integer>();
        for (int i=0;i<arr.length;i++){
            int temp=target-arr[i];

            if (set.contains(temp)){
                System.out.println(temp+" "+arr[i]);
            }set.add(arr[i]);
        }
    }
}
