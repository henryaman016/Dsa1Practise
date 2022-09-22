public class frequency {
    public static void main(String[] args) {
        int arr[]={1,2,8,3,2,2,2,5,1};
        int n=arr.length;
        int []freq=new int[n];
        int visited=-1;
        for (int i=0;i<n;i++){
            int count=1;
            for (int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    count++;

                    freq[j]=visited;
                }
            }
            if (freq[i]!=visited)
                freq[i]=count;
        }
        System.out.println("Element | Frequeny");

        for (int i=0;i<freq.length;i++){
            if (freq[i]!=visited){
                System.out.println("" +arr[i] + " | " + freq[i]);
            }
        }
    }
}
