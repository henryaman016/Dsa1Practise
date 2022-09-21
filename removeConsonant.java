public class removeConsonant {
    static String remVowel(String str)
    {
        return str.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "");
    }

    // Driver Code
    public static void main(String[] args)
    {
        String str = "OCEIAN";
        System.out.println(remVowel(str));
    }
}
