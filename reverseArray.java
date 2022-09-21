public class reverseArray {
    public static void main(String args[]){
        int arr[]={4,3,9,8,7,21,5,23,25,16,30};

        System.out.println("Noramal Arrays");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Reverse Arrays");
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
}
