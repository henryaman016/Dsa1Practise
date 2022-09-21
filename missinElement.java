public class missinElement {
    public static void main(String[] args) {
        int arr[]={1,2,5,3,6,7};
        int n=arr.length;

        int sumOfAll=(n*(n+1))/2;
        int sumOfArray=0;
        for (int i=0;i<n-1;i++){
            sumOfArray=sumOfArray+arr[i];
        }
        int missingNumber=sumOfAll-sumOfArray;
        System.out.println(missingNumber);
    }
}
