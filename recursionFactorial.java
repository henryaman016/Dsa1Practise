public class recursionFactorial {
    public static void main(String[] args) {
      int n=4;
      int ans= factorial(n);
        System.out.println(ans);
        }
        public static   int factorial(int n){
        if(n>0){
            return n*factorial(n-1);
        }else {
            return 1;
        }
        }
    }
//
