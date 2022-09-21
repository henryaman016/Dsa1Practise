public class findNonRepeatingElement {
    public static void main(String[] args) {
        int arr[]={1,2,-1,1,3,1};
        boolean chk;
        for (int i=0;i<arr.length;i++){
            chk =false;
            for (int j=0;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j]){
                    chk=true;
                    break;
                }
            }
            if (!chk)
                System.out.println(arr[i]+" ");
        }
    }
}
