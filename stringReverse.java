public class stringReverse {
    public static void main(String[] args) {
        String str="Hanuman";
        System.out.println(str);
        System.out.println();

        char[] chars=str.toCharArray();
        for (int i=chars.length-1;i>=0;i--){
            System.out.print(chars[i]);

        }
    }
}
