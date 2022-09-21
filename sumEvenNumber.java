public class sumEvenNumber {
    public static void main(String[] args) {
//        int sum=0;
//        int n=50;
//        int num=1;
//        for (int count=1;count<=n;){   //sum even 50 number
//           if (num%2==0){
//               sum=sum+num;
//               count++;
//           }
//           num++;}
//
//            System.out.println(sum);


        int num=50, sum=0;

        for (int i=1;i<=num;i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);


    }

    }

