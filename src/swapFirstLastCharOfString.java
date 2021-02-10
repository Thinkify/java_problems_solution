import java.util.Arrays;

public class swapFirstLastCharOfString {
    public static void main(String[] args){
        String str = "ExampleString   ";
        char first = str.charAt(0), last = str.charAt(str.length()-4);
        char[] arr = str.toCharArray();
        arr[0] = last;
        arr[str.length()-4] = first;
        str = Arrays.toString(arr);
        System.out.print(str);
    }
}
