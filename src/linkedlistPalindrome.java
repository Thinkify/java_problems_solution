import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class linkedlistPalindrome {
    public static void main(String[] args){
        boolean isPalin = false;
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 3, 2, 3, 1));
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<linkedList.size();i++){
            stack.push(linkedList.get(i));
        }
        for(int j=0;j< linkedList.size();j++){
            int i = stack.pop();
            System.out.println(i);
            if(i != linkedList.get(j)) {
                isPalin = false;
                break;
            }else {
                isPalin = true;
            }
        }
        if(isPalin)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
