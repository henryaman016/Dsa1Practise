public class tripletSum {
    public static void main(String args[]){
        int arr[]={0,-1,2,-3,1};
        boolean found=false;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        System.out.println(arr[i]+ " " +arr[j]+ " " + arr[k]+ " ");
                        found=true;
                    }
                }if(found==false){
                    System.out.println("not exist");
                }
            }
        }


    }
}
