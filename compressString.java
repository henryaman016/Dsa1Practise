public class compressString {
  static void gen_compressed_str(String str){
      int n=str.length();
      for (int i=0;i<n;i++){
          int count=1;
          while (i<n-1 && str.charAt(i) == str.charAt(i+1)){
              count++;
              i++;
          }
          if (count==1){
              System.out.println(str.charAt(i) + "1");
          }else {
              System.out.print(str.charAt(i));
              System.out.print(count);
          }
      }
  }

    public static void main(String[] args) {
        String str="aaabbcccddeef";
        gen_compressed_str(str);

    }
}
