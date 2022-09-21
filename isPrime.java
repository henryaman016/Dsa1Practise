import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        System.out.println("enter the no. : ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        boolean isPrime=false;

        for (int i=2;i<a/2;i++){
            if (a%i==0){
                isPrime=true;
                break;
            }
        }
        if (!isPrime){
            System.out.println(a + " is prime no. ");
        }else {
            System.out.println(a + " is not a prime no. ");
        }
    }
}
