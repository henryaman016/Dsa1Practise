import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter the element of array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the key");
        int key=sc.nextInt();
        int result=-1;
        int s=0,e=n-1,mid;


        while (s<=e) {
            mid = (s + e) / 2;
            {
                if (key == arr[mid]) {
                    result = mid;
                    break;
                } else if (key < arr[mid])
                    e = mid - 1;
                else
                    s = mid + 1;
            }
        }
            if (result==-1){
                System.out.println("not found");
            }else {
                System.out.println(result);
            }
        }
    }

