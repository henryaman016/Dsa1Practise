public class removeDuplicate {
    public static void main(String[] args) {
        int arr[]={0,0,1,7,1,2,2,3,3,4};


        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if ((arr[i]==arr[j]) || (i==j) ){
                    System.out.print(arr[i]+" ");



                }
            }
        }
    }
}
