

public class maxRepeatedElement {
//    public static void main(String[] args) {
//        int arr[] = {1, 6, 4, 2, 7, 4, 2, 3, 9, 2, 8, 4};
//        int n=arr.length;
//        int k=12;
//        System.out.println("Maximum repeating element is : " + maxRepeating(arr,n,k));
////Time Complexity:0(n)
//    }
//    //Time Complexity =0(N) Space Complexity=0(N)
//static int maxRepeating(int arr[],int n,int k){
//        for (int i=0;i<arr.length;i++)
//            arr[arr[i]%k]+=k;
//
//        int max=arr[0],result=0;
//        for (int i=1;i<n;i++){
//            if (arr[i]>max){
//                max=arr[i];
//                result=i;
//            }
//        }
//        return result;
//
//
//    }

    //2nd Method





    public static void main(String[] args) {
        int arr[]={1,6,4,2,7,4,2,3,9,2,8,4};
        int n=arr.length;
        System.out.println("Maximum no. of repeated element : "+ mostFrequent(arr,n));
    }
    public static int mostFrequent(int arr[],int n){
         int maxCount=0;
         int maxFreq=0;
         for (int i=0;i<n;i++){
             int count=0;
             for (int j=0;j<n;j++){
                 if (arr[i]==arr[j]){
                     count++;
                 }
             }
             if (count>maxCount){
                 maxCount=count;
                 maxFreq=arr[i];
             }
         }
         return maxFreq;
    }


}

