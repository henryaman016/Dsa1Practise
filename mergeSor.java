public class mergeSor {
    public static void merge(int[] arr,int start,int end,int mid){
        int i,j,k;

        int sizeOfAux1=mid - start+1;
        int sizeOfAux2=end - mid;

        int []aux1=new int[sizeOfAux1];
        int []aux2=new int[sizeOfAux2];

        for (int idx=0;idx<sizeOfAux1;idx+=1){
            aux1[idx]=arr[start+idx];
        }
        for (int idx=0;idx<sizeOfAux2;idx+=1){
            aux2[idx]=arr[mid+1+idx];
        }
        i=0;
        j=0;
        k=start;


        while (i<sizeOfAux1 && j<sizeOfAux2){
            if (aux1[i]<=aux2[i]){
                arr[k]=aux1[i];
                i+=1;
            }else {
                arr[k]=aux2[j];
                j+=1;
            }
            k+=1;
        }
        while (i<sizeOfAux1){
            arr[k]=aux1[i];
            i+=1;
            k+=1;
        }
        while (j<sizeOfAux2){
            arr[k]=aux2[j];
            j+=1;
            k+=1;
        }
    }

    public static void mergeSort(int arr[],int start , int end){
        if (start>=end){
            return;
        }

        int mid=start + (end - start)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }




    public static void main(String[] args) {


    }
}
