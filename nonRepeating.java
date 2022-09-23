public class nonRepeating {
    public static void main(String[] args) {
        int arr[]={4,5,8,9,4,5};

        boolean result;

        for (int i=0;i<arr.length;i++){
            result=false;
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]!=arr[j] && i!=j){
                    result=true;
                    break;
                }
            }
            if (!result){
                System.out.println(arr[i]+" ");
            }
        }
    }
}
