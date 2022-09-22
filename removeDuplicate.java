public class removeDuplicate {
    public static void main(String[] args) {
        int arr[]={45,72,8,74,60,14,45,60,25,8,30,51,15,25};


        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if ((arr[i]==arr[j])){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
