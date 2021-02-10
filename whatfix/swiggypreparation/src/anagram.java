import java.util.ArrayList;
import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        boolean a = anagramcheck();
        System.out.println(a);
    }
    public static boolean anagramcheck(){
        String s1 = "D'costa", s2 = "Dcosta ";
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1!=n2)
            return false;
        char[] s3 = s1.toCharArray();
        char[] s4 = s2.toCharArray();
        Arrays.sort(s3);
        Arrays.sort(s4);

        for(int i=0;i<n1;i++){
            if(s3[i]!=s4[i])
                return false;
        }

        return true;
    }
}
