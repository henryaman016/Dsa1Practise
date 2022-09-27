public class localGreater {
    public static void main(String[] args) {
        int arr[]={10,5,11,4,8,7,3};
        LocalGreater(arr);

    }
    public static void LocalGreater(int arr[]){
        for (int i=0;i<arr.length;i++){
            if (i==0){
                if (arr[i]>arr[arr.length-1] && arr[i]>arr[i+1]){
                    System.out.println(arr[i]+ " ");
                }
            }else if (i>0 && i<arr.length-1){
                if (arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                    System.out.println(arr[i]+" ");
                }
            }
            else if (i==arr.length-1){
                if (arr[i]>arr[i-1] && arr[i]>arr[0]){
                    System.out.println(arr[i]+" ");
                }
            }
        }
    }
}
