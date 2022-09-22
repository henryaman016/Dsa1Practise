public class primeNo {
    public static void main(String[] args) {
        int a=5;
boolean isPrime=false;
        for (int i=2;i<a/2;i++){
            if (a%2==0){
                isPrime=true;
                break;
            }
        }if (!isPrime){
            System.out.println(a + " is prime no. ");
        }else {
            System.out.println(a + "is not prime ");
        }
    }
}
