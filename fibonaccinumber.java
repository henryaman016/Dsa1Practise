public class fibonaccinumber {
    public static void main(String[] args) {
       int n=5;
        long ans=Fibonacci(n);
//not complete code writen
        System.out.println(ans);
    }
    static long Fibonacci(long n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}