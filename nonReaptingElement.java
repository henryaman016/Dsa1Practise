public class nonReaptingElement {
    public static void main(String args[]){
        int arr[]={4,6,9,8,4,3,9,8};

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]== arr[j]){
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
