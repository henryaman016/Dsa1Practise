import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the element of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter key ");
            int key = sc.nextInt();
            int result = -1;



            for (int i=0;i<n;i++){
                if(arr[i]==key){
                    result=i;
                    break;
                }
            }
            if(result==-1){
                System.out.println("not found");
            }else {
                System.out.println(result);
            }
        }
    }
