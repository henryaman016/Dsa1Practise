public class nonRepeatingElement {
    public static void main(String[] args) {
        int arr[]={9,7,7,6,5,3,2,2};
boolean chk;
        for (int i=0;i<arr.length;i++){
            chk=false;
            for (int j=0;j<arr.length;j++){
                if ((arr[i]==arr[j]) && (i!=j)){
                    chk =true;
                    break;
                }
            }if (!chk)
                System.out.println(arr[i]+" ");
        }
    }
}
