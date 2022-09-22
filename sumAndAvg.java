import java.util.Scanner;

public class sumAndAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int avg=0;

        for (int i=0;i<n;i++){
            sum+=arr[i];

            avg=sum/2;
        }
        System.out.println("sum of arrays is " +sum);
        System.out.println( "average of array is  " + avg);
    }
}
