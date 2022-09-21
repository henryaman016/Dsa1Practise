public class repeatElement {
    public static void main(String args[]){
        int arr[]={10,15,40,6,8,55,4,1,60,60,5,4,6};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
