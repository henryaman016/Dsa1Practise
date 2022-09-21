public class linearSearch {
    public static void main(String args[]){
        int arr[]={4,5,9,8,7,3,6,1,2};
        int key =5;
        int result=-1;

        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                result=i;
                break;
            }
        }if(result==-1){
            System.out.println("false");
        }else {
            System.out.println(result);
        }
    }
}
