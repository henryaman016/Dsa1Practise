public class minMaxArray {
    public static void main(String args[]){
        int arr[]={40,31,15,10,66,23,51,28};
        int min=arr[0];
        int pos=-1;

        int max=arr[0];
        int sit=-1;

        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
                pos =i;
            }
            if(max<arr[i]){
                max=arr[i];
                sit =i;
            }
        }
        System.out.println(min);
        System.out.println(pos);

        System.out.println(max);
        System.out.println(sit);
    }
}
