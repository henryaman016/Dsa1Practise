//import java.util.Arrays;
//
//public class mergeSort {
//    void merge(int arr[],int p, int q,int r){
//        int n1=q-p+1;
//        int n2=r-q;
//
//        int L[]=new int[n1];
//        int M[]=new int[n2];
//
//
//        for(int i=0;i<n1;i++)
//            L[i]=arr[p+i];
//        for(int j=0;j<n2;j++)
//            M[j]=arr[q+1+j];
//
//        int i,j,k;
//        i=0;
//        j=0;
//        k=p;
//
//        while (i<n1 && j<n2){
//            if(L[i]<=M[j]){
//                arr[k]=L[i];
//                i++;
//            }else {
//                arr[k]=M[j];
//                j++;
//            }
//            k++;
//        }
//        while (i<n1){
//            arr[k]=M[i];
//            i++;
//            k++;
//        }
//        while (j<n2){
//            arr[k]=M[j];
//            j++;
//            k++;
//        }
//    }
//    void mergeSort(int arr[],int left,int right){
//        if(left<right){
//            int mid =(left+right)/2;
//
//            mergeSort(arr,left,mid);
//            mergeSort(arr,mid+1,right);
//
//            merge(arr,left,mid,right);
//        }
//    }
//    public static void main(String args[]){
//        int [] arr={6,5,12,10,9,1};
//
//        Main ob=new  Main();
//        ob.mergeSort(arr,0,arr.length-1);
//
//        System.out.println("Sorted Array:");
//        System.out.println(Arrays.toString(array));
//    }
//}
